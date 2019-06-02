package com.nullzc.service.handler.chains;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.nullzc.service.enums.HandlerEnum.BussinessType;
import com.nullzc.service.handler.Handler;
import com.nullzc.service.handler.PostHandler;

public abstract class AbstractPostHandlerChains implements HandlerChains{

	public static Map<String, Set<PostHandler>> postHandlerMap = new HashMap<String, Set<PostHandler>>();
	
	@Override
	public final void register(Handler handler) {
		if(handler == null) {
			return;
		}
		if(handler instanceof PostHandler) {
			Set<BussinessType> bussinessTypeSet = handler.getBussinessType();
			for(BussinessType bussinessType : bussinessTypeSet) {
				Set<PostHandler> handlerSet = postHandlerMap.get(bussinessType.getType());
				if(handlerSet == null) {
					handlerSet = new HashSet<PostHandler>();
				}
				handlerSet.add((PostHandler) handler);
				postHandlerMap.put(bussinessType.getType(), handlerSet);
			}
		}
	}
	
	@Override
	public Set<PostHandler> getHandlers(String bussinessType) {
		Set<PostHandler> postHandlers = postHandlerMap.get(bussinessType);
		if(postHandlers == null) {
			postHandlers = Collections.emptySet();
		}
		return postHandlers;
	}
	
	protected abstract void registerHandler(PostHandler postHandler);
	
}
