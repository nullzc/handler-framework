package com.nullzc.common.enums;

public class ResultEnum {

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
