package com.nullzc.service.handler.pre;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.nullzc.service.enums.HandlerEnum.BussinessType;
import com.nullzc.service.enums.HandlerEnum.Order;
import com.nullzc.service.handler.AbstractPreHandler;
import com.nullzc.service.handler.entity.RequestParam;
import com.nullzc.service.handler.entity.Result;
/**
 * 基本信息填充
 * @author nullzc
 *
 */
@Service
public class BaseInfoInitPreHandler extends AbstractPreHandler {
	
	private ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<Map<String,Object>>();

	@Override
	public Result<?> preHandle(RequestParam<?> param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<BussinessType> getBussinessType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void rollbackPreHandle(RequestParam<?> param) {
		super.rollbackPreHandle(param);
		// 用完即删
		threadLocal.remove();
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
