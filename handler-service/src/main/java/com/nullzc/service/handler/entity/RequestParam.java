package com.nullzc.service.handler.entity;

import java.io.Serializable;

public class RequestParam<E> implements Serializable {

	private static final long serialVersionUID = 8531636780651046313L;
	
	private String bussinessType;
	
	private String commonParam;
	
	private E peculiarParam;

	public String getBussinessType() {
		return bussinessType;
	}

	public void setBussinessType(String bussinessType) {
		this.bussinessType = bussinessType;
	}

	public String getCommonParam() {
		return commonParam;
	}

	public void setCommonParam(String commonParam) {
		this.commonParam = commonParam;
	}

	public E getPeculiarParam() {
		return peculiarParam;
	}

	public void setPeculiarParam(E peculiarParam) {
		this.peculiarParam = peculiarParam;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
