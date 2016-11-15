package services.order;

import java.util.Set;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sun.org.glassfish.gmbal.ParameterNames;

import services.representation.customer.CustomerRepresentation;
import services.representation.customer.CustomerRequest;
import services.representation.order.*;
import services.workflow.*;
import services.workflow.customer.CustomerActivity;
import services.workflow.order.OrderActivity;




@Path("/orderservice")
public class OrderResource  implements OrderServices{
	
	@GET
	@Produces({"application/xml" , "application/json"})
	@Path("/order")
	public Set<OrderRepresentation> getOrders() {
		System.out.println("GET METHOD Request for all customers .............");
		OrderActivity custActivity = new OrderActivity();
		return custActivity.getOrders();	
		}
	@GET
	@Produces({"application/xml" , "application/json"})
	@Path("/order/{orderID}")
	public OrderRepresentation getOrder(@PathParam("orderID") String id) {
		System.out.println("GET METHOD Request from Client with customerrequest string ............." + id);
		OrderActivity custActivity = new OrderActivity();
		return custActivity.getOrder(id);
	}
	@POST
	@Produces({"application/xml" , "application/json"})
	@Path("/order")
	public OrderRepresentation createorder(OrderRequest  orderRequest) {
		System.out.println("POST METHOD Request from Client with ............." + orderRequest.getOrderDate() + "  " + orderRequest.getOrderStatus());
		OrderActivity empActivity = new OrderActivity();
		return empActivity.createorder(orderRequest.getOrderDate(), orderRequest.getOrderStatus());
	}

	@Override
	public OrderRepresentation getOrders(String customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderRepresentation createOrder(OrderRequest OrderRequest) {
		// TODO Auto-generated method stub
		return null;
	}	
  }
