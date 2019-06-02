package com.nullzc.service.handler;

import com.nullzc.service.handler.entity.RequestParam;

public abstract class AbstractPreAndPostHandler implements PreHandler, PostHandler {
	
	@Override
	public int compareTo(Handler o) {
		return getOrder().getOrder() - o.getOrder().getOrder();
	}
	
	@Override
	public void rollbackPreHandle(RequestParam<?> param) {
		// 具体是否有回滚场景交给具体业务去做
	}
	
	@Override
	public void fallback(RequestParam<?> param) {
		// 交给具体业务去处理
	}
	
}
