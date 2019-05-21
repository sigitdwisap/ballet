package common;

import java.io.Serializable;

public class RestResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int status;	
	private String message; 
	private Object datas;
	
	public RestResponse(){
	}
	
	public RestResponse(int status, String message, Object datas){
		this.status = status;
		this.message = message;
		this.datas = datas;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Object getDatas() {
		return datas;
	}
	
	public void setDatas(Object datas) {
		this.datas = datas;
	} 
		
}
