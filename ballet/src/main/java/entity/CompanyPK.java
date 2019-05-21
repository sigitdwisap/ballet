package entity;

import java.io.Serializable;

public class CompanyPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cname;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
