package com.nullzc.service.handler;

import com.nullzc.service.handler.entity.RequestParam;
import com.nullzc.service.handler.entity.Result;

/**
 * 前置处理器接口
 * @author nullzc
 */
public interface PreHandler extends Handler {

	/**
	 * 前置处理
	 * @param param
	 * @return
	 */
	Result<?> preHandle(RequestParam<?> param);
	/**
	 * 失败回滚
	 * @param param
	 */
	void rollbackPreHandle(RequestParam<?> param);
}
