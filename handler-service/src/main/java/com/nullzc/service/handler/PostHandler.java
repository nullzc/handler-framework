package com.nullzc.service.handler;

import com.nullzc.service.handler.entity.RequestParam;
import com.nullzc.service.handler.entity.Result;

/**
 * 后置处理器接口
 * @author nullzc
 */
public interface PostHandler extends Handler {

	/**
	 * 后置处理
	 * @param param
	 * @return
	 */
	Result<?> postHandle(RequestParam<?> param);
	/**
	 * 后置处理降级处理
	 * @param param
	 */
	void fallback(RequestParam<?> param);
}
