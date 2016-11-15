package services.order;

import java.util.Set;

import services.representation.order.OrderRepresentation;
import services.representation.order.OrderRequest;



public interface OrderServices{
	public Set<OrderRepresentation> getOrders();
	public OrderRepresentation getOrders(String customerID);
	public OrderRepresentation createOrder(OrderRequest OrderRequest);
}
