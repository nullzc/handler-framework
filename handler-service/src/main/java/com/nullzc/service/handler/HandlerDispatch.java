package com.nullzc.service.handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import com.nullzc.service.handler.chains.PostHandlerChains;
import com.nullzc.service.handler.chains.PreHandlerChains;
import com.nullzc.service.handler.entity.RequestParam;
import com.nullzc.service.handler.entity.Result;

public abstract class HandlerDispatch {
	
	@Autowired
	private PreHandlerChains preHandlerChains;
	
	@Autowired
	private PostHandlerChains postHandlerChains;
	
	public <T> T dispatch(RequestParam<?> param, Class<T> clazz) {
		Result<T> result = new Result<T>(false);
		result = (Result<T>) preHandlerDispatch(param, result);
		if(result.isSuccess()) {
			doBusiness(param);
			postHandlerDispatch(param);
		}
		return result.getPeculiarResult();
	}
	
	protected abstract void doBusiness(RequestParam<?> param);
	
	private Result<?> preHandlerDispatch(RequestParam<?> param, Result<?> result) {
		Set<PreHandler> preHandlers = preHandlerChains.getHandlers(param.getBussinessType());
		if(CollectionUtils.isEmpty(preHandlers)) {
			System.err.println("==========类型错误===========");
			return result;
		} else {
			List<PreHandler> isPassHandlers = new ArrayList<PreHandler>();
			try {
				for(PreHandler preHandler : preHandlers) {
					isPassHandlers.add(preHandler);
					result = preHandler.preHandle(param);
					if(result.isSuccess()) {
					} else {
						preHandler.rollbackPreHandle(param);
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				if(!result.isSuccess()) {
					int init = isPassHandlers.size() - 1;
					for(int i = init; i >= 0; i--) {
						// TODO 回滚的业务
						isPassHandlers.get(i).rollbackPreHandle(param);
					}
				}
			}

		}
		return result;
	}
	
	private void postHandlerDispatch(RequestParam<?> param) {
		postHandlerChains.getHandlers(param.getBussinessType());
	}
}
