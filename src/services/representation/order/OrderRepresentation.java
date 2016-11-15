package services.representation.order;

import domain.order.Orderstatus;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement(name = "Order")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
    public class OrderRepresentation {
	private int orderID;
	private int orderdate;
	private Orderstatus orderstatus;
	
	public int getorderID() {
		return orderID;
	}
	public void setorderID(int orderID) {
		this.orderID = orderID;
	}
	
	
	
	public int getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(int orderdate) {
		this.orderdate = orderdate;
	}
	public Orderstatus getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(Orderstatus orderstatus) {
		this.orderstatus = orderstatus;
	}
	public void add(OrderRepresentation orderRepresentations) {
		// TODO Auto-generated method stub
		
	}	
}
