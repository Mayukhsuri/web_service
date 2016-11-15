package domain.customer;

public class Address {

	private int zip;
	private String street;
	private String houseNumber;
	private String state;
	private String city;
	
	
	public Address(){
		
	}
	
public Address( String houseNumber, String street, String state, String city, int zip ){
	this.houseNumber=houseNumber;	
	this.street=street;
	this.city=city;
	this.state= state;
	this.zip=zip;
	}
	
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
