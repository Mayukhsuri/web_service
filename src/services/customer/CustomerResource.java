package services.customer;

import java.sql.SQLException;
import java.util.Set;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import services.representation.customer.CustomerRepresentation;
import services.representation.customer.CustomerRequest;
import services.representation.order.*;
import services.workflow.*;
import services.workflow.customer.CustomerActivity;




@Path("/customerservice")
public class CustomerResource implements Customerservices  {
  
	@GET
	@Produces({"application/xml" , "application/json"})
	@Path("/customer")
	public Set<CustomerRepresentation> getCustomer() {
		System.out.println("GET METHOD Request for all customers .............");
		CustomerActivity custActivity = new CustomerActivity();
		return custActivity.getCustomers();	
		}
	@GET
	@Produces({"application/xml" , "application/json"})
	@Path("/customer/{customerID}")
	public CustomerRepresentation getCustomer(@PathParam("customerID") String id) {
		System.out.println("GET METHOD Request from Client with customerrequest string ............." + id);
		CustomerActivity custActivity = new CustomerActivity();
		return custActivity.getCustomer(id);
	}
	@POST
	@Produces({"application/xml" , "application/json"})
	@Path("/customer")
	public CustomerRepresentation createEmployee(CustomerRequest  employeeRequest) {
		System.out.println("POST METHOD Request from Client with ............." + employeeRequest.getFirstName() + "  " + employeeRequest.getLastName());
		CustomerActivity empActivity = new CustomerActivity();
		return empActivity.createEmployee(employeeRequest.getFirstName(), employeeRequest.getLastName());
	}

	@Override
	public Set<CustomerRepresentation> getCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerRepresentation createCustomer(CustomerRequest customerRequest)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}	
  }
