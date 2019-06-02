package com.nullzc.service.handler;

import com.nullzc.service.handler.entity.RequestParam;

public abstract class AbstractPostHandler implements PostHandler {
	
	@Override
	public int compareTo(Handler o) {
		return getOrder().getOrder() - o.getOrder().getOrder();
	}
	
	@Override
	public void fallback(RequestParam<?> param) {
		// 交给具体业务去处理
	}
}
