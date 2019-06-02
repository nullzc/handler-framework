package com.nullzc.service.handler;

import java.util.Set;

import com.nullzc.service.enums.HandlerEnum.BussinessType;
import com.nullzc.service.enums.HandlerEnum.Order;

/**
 * 总处理器接口
 * @author nullzc
 *
 */
public interface Handler extends Comparable<Handler>{

	/**
	 * 具体Handler类对应的BussinessType
	 * @return
	 */
	Set<BussinessType> getBussinessType();
	/**
	 * 排序编号
	 * @return
	 */
	Order getOrder();
}
