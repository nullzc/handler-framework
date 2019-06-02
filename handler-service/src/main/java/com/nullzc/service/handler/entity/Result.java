package com.nullzc.service.handler.entity;

import java.io.Serializable;

public class Result<T> implements Serializable {

	private static final long serialVersionUID = -2575472384535871957L;
	
	private boolean isSuccess;
	
	private String commonResult;
	
	private T peculiarResult;
	
	public Result(boolean isSuccess, String commonResult, T peculiarResult) {
		super();
		this.isSuccess = isSuccess;
		this.commonResult = commonResult;
		this.peculiarResult = peculiarResult;
	}

	public Result(boolean isSuccess) {
		super();
		this.isSuccess = isSuccess;
	}

	public Result() {
		super();
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCommonResult() {
		return commonResult;
	}

	public void setCommonResult(String commonResult) {
		this.commonResult = commonResult;
	}

	public T getPeculiarResult() {
		return peculiarResult;
	}

	public void setPeculiarResult(T peculiarResult) {
		this.peculiarResult = peculiarResult;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
