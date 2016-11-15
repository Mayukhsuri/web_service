package domain.payment;
import domain.customer.*;
import domain.product.Product;


public class Payment {
	public Product product;
public Customer customerID;
public long cardno;
public int cvv;
public String type;

public Payment(Product product,Customer customerID,long cardno,int cvv,String type)
{
	this.product=product;
	this.customerID=customerID;
	this.cardno = cardno;
	this.cvv=cvv;
	this.type=type;
}
public Product getProductID()
{
	return product;
	
}
public void setProductID()
{
	this.product=product;
}
public Customer getCustomerID() {
	return customerID;
}

public void setCustomerID(Customer customerID) {
	this.customerID = customerID;
}

public long getCardno() {
	return cardno;
}

public void setCardno(long cardno) {
	this.cardno = cardno;
}

public int getCvv() {
	return cvv;
}

public void setCvv(int cvv) {
	this.cvv = cvv;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}
	

}


