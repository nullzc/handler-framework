package com.nullzc.service.handler.chains;

import java.util.Set;

import com.nullzc.service.handler.Handler;

public interface HandlerChains {
	
	void register(Handler handler);
	
	Set<? extends Handler> getHandlers(String bussinessType);
}
