package entity;

import java.io.Serializable;

public class RolePK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int did;
	private int sid;
	private String role;
	
	public int getDid() {
		return did;
	}
	
	public void setDid(int did) {
		this.did = did;
	}
	
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
}
