package dto;

import java.util.List;

public class ShowDto {

	private int sid;
	private String title;
	private String choreo;
	private String composer;
	private int year;
	private List<RoleDto> roleDtos;
	
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getChoreo() {
		return choreo;
	}
	
	public void setChoreo(String choreo) {
		this.choreo = choreo;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public List<RoleDto> getRoleDtos() {
		return roleDtos;
	}
	
	public void setRoleDtos(List<RoleDto> roleDtos) {
		this.roleDtos = roleDtos;
	}
		
}
