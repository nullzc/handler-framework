package com.nullzc.service.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.nullzc.service.handler.Handler;

public class HandlerEnum {

	public static enum BussinessType {
		TYPE_1("TYPE_1", "类型1"),
		TYPE_2("TYPE_2", "类型2"),
		TYPE_3("TYPE_3", "类型3"),
		TYPE_4("TYPE_4", "类型4");
		
		private String type;
		
		private String desc;

		private BussinessType(String type, String desc) {
			this.type = type;
			this.desc = desc;
		}
		
		public static Set<BussinessType> getBussinessTypes(BussinessType... types) {
			if(types == null) {
				return Collections.emptySet();
			}
			return new HashSet<HandlerEnum.BussinessType>(Arrays.asList(types));
		}
		
		public static BussinessType[] getAllBussinessTypes() {
			return new BussinessType[] {BussinessType.TYPE_1, BussinessType.TYPE_2, BussinessType.TYPE_3, BussinessType.TYPE_4};
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
	
	public static enum Order {
//		LockHandler(1, LockHandler.class),
//		//--------------------------------------------------------
//		CommonPreHandler(10, CommonPreHandler.class),
//		Type1PreHandler(20, Type1PreHandler.class),
//		//--------------------前置后置分割线-----------------------
//		Type1PostHandler(101, Type1PostHandler.class),
//		CommonPostHandler(100, CommonPostHandler.class),
		;
		
		private int order;
		
		private Class<? extends Handler> handler;

		private Order(int order, Class<? extends Handler> handler) {
			this.order = order;
			this.handler = handler;
		}

		public int getOrder() {
			return order;
		}

		public void setOrder(int order) {
			this.order = order;
		}

		public Class<? extends Handler> getHandler() {
			return handler;
		}

		public void setHandler(Class<? extends Handler> handler) {
			this.handler = handler;
		}

	}
	
	public static enum ErrorCode {
		SUCCESS("1000", "成功", FinalState.Success),
		DBUpdateError("1001", "数据库更新失败", FinalState.Fail),
		SYSError("1002", "系统异常", FinalState.Processing);
		
		private String code;
		private String desc;
		private FinalState state;
		private ErrorCode(String code, String desc, FinalState state) {
			this.code = code;
			this.desc = desc;
			this.state = state;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public FinalState getState() {
			return state;
		}
		public void setState(FinalState state) {
			this.state = state;
		}
		
	}
	
	public static enum FinalState {
		Success(0, "成功"),
		Fail(1, "失败"),
		Processing(2, "处理中");
		private int state;
		private String desc;
		private FinalState(int state, String desc) {
			this.state = state;
			this.desc = desc;
		}
		public int getState() {
			return state;
		}
		public void setState(int state) {
			this.state = state;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		
	}

}
