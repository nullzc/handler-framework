package com.nullzc.service.handler.chains;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.nullzc.service.enums.HandlerEnum.BussinessType;
import com.nullzc.service.handler.Handler;
import com.nullzc.service.handler.PreHandler;

public abstract class AbstractPreHandlerChains implements HandlerChains{

	public static Map<String, Set<PreHandler>> preHandlerMap = new HashMap<String, Set<PreHandler>>();
	
	@Override
	public final void register(Handler handler) {
		if(handler == null) {
			return;
		}
		if(handler instanceof PreHandler) {
			Set<BussinessType> bussinessTypeSet = handler.getBussinessType();
			for(BussinessType bussinessType : bussinessTypeSet) {
				Set<PreHandler> handlerSet = preHandlerMap.get(bussinessType.getType());
				if(handlerSet == null) {
					handlerSet = new HashSet<PreHandler>();
				}
				handlerSet.add((PreHandler) handler);
				preHandlerMap.put(bussinessType.getType(), handlerSet);
			}
		}
	}
	
	@Override
	public Set<PreHandler> getHandlers(String bussinessType) {
		Set<PreHandler> preHandlers = preHandlerMap.get(bussinessType);
		if(preHandlers == null) {
			preHandlers = Collections.emptySet();
		}
		return preHandlers;
	}
	
	protected abstract void registerHandler(PreHandler preHandler);
	
}
