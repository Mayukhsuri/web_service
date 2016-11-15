package services.workflow.order;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import services.order.OrderServices;
import services.representation.order.*;


import domain.order.Order;
import domain.order.Ordermanagerfacade;
import domain.order.Orderstatus;

public class OrderActivity  {

private static Ordermanagerfacade em = new Ordermanagerfacade();
	
	public Set<OrderRepresentation> getorder() {
		
		Set<Order> order = new HashSet<Order>();
		Set<OrderRepresentation> orderRepresentation = new HashSet<OrderRepresentation>();
		//employees = dao.getAllEmployees();
		order = em.getAllorders();
		
		Iterator<Order> it = order.iterator();
		while(it.hasNext()) {
			Order emp = (Order)it.next();
			OrderRepresentation orderRepresentations= new OrderRepresentation();
			orderRepresentations.setorderID(emp.getOrderID());
			orderRepresentations.setOrderdate(emp.getOrderDate());
	orderRepresentations.setOrderstatus(emp.getOrderStatus());
          
          //now add this representation in the list
			orderRepresentations.add(orderRepresentations);
        }
		return orderRepresentation;
	}
	
	public OrderRepresentation getOrder(String id) {
		
		//Employee emp = dao.getEmployee(id);
		Order ord = new Order();
		ord = em.getOrder(id);
		
		OrderRepresentation ordRep = new OrderRepresentation();
		ordRep.setOrderdate(ord.getOrderDate());
		ordRep.setOrderstatus(ord.getOrderStatus());
		ordRep.setorderID(ord.getOrderID());
		
		return ordRep;
	}
	
	public OrderRepresentation createorder(int orderDate, Orderstatus orderStatus) {
		
		//Employee emp = dao.addEmployee(firstName, lastName);
		Order emp = em.addOrder(orderDate, orderStatus);
		
		OrderRepresentation ordRep = new OrderRepresentation();
		ordRep.setOrderdate(emp.getOrderDate());
		ordRep.setOrderstatus(emp.getOrderStatus());
		ordRep.setorderID(emp.getOrderID());
		
		return ordRep;
	}
	
	public String deleteEmployee(String id) {
		
		//dao.deleteOrder(id);
		//em.deleteOrder(id);
		
		return "OK";
	}

	public Set<OrderRepresentation> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
