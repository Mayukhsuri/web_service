package services.representation.customer;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "Customer")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class CustomerRepresentation {
	private int customerID;
	private String lastName;
	private String firstName;
	
	public CustomerRepresentation()
	{
		
	}
	public int getcustomerID() {
		return customerID;
	}
	public void setcustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	
}
