package domain.order;

import domain.customer.*;
import domain.order.*;
import domain.product.*;

public class Order {

	private int orderID;
	
	private Customer customer;
	private Orderstatus orderStatus;
	private int orderDate;
	private String orderQuantity;
	private double totalPrice;
	private Product product;
	
	public Order(int orderID, Customer customer,  Orderstatus orderStatus, int orderDate, String orderQuantity,
			double totalPrice, Product product) {
		
		this.orderID = orderID;
		this.customer = customer;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.orderQuantity = orderQuantity;
		this.totalPrice = totalPrice;
		this.product = product;
	}
	public Order()
	{
		super();
		this.orderID = orderID;
		this.customer = customer;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.orderQuantity = orderQuantity;
		this.totalPrice = totalPrice;
		this.product = product;
	}

	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
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
}
