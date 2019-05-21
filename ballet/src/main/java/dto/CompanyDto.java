package dto;

public class CompanyDto {

	private String cname;
	private String city;
	private String country;
	
	public CompanyDto() {		
	}
	
	public CompanyDto(String cname, String city, String country) {
		this.cname = cname;
		this.city = city;
		this.country = country;
	}
		
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
}
