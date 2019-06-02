package com.nullzc.service.handler;

import com.nullzc.service.handler.entity.RequestParam;

public abstract class AbstractPreHandler implements PreHandler {
	
	@Override
	public int compareTo(Handler o) {
		return o.getOrder().getOrder() - getOrder().getOrder();
	}
	
	@Override
	public void rollbackPreHandle(RequestParam<?> param) {
		// 具体是否有回滚场景交给具体业务去做
	}
}
