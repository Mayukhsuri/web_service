package services.representation.order;

import domain.order.Orderstatus;
import domain.product.Product;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class OrderRequest  {
	private Orderstatus orderStatus;
	public Orderstatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Orderstatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(int orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(String orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	private int orderDate;
	private String orderQuantity;
	private double totalPrice;
	private Product product;
	
	
	
	
	
	
	
}
