package services.product;


import java.util.Set;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import services.representation.customer.CustomerRepresentation;
import services.representation.customer.CustomerRequest;
import services.representation.product.ProductRepresentation;
import services.representation.partner.PartnerRepresentation;
import services.workflow.customer.CustomerActivity;
import services.workflow.product.ProductActivity;
@Path("/productservice")
public class ProductResource {
	@GET
	@Produces({"application/xml" , "application/json"})
	@Path("/product")
	public Set<ProductRepresentation> getproduct() {
		System.out.println("GET METHOD Request for all Products .............");
		ProductActivity custActivity = new ProductActivity();
		return custActivity.getProduct();
	}
	@GET
	@Produces({"application/xml" , "application/json"})
	@Path("/product/{productID}")
	public ProductRepresentation getproduct(@PathParam("productID") int id) {
		System.out.println("GET METHOD Request from Client with customerrequest string ............." + id);
		ProductActivity custActivity = new ProductActivity();
		return custActivity.getProduct(id);
	}
	@POST
	@Produces({"application/xml" , "application/json"})
	@Path("/product")
	public CustomerRepresentation createEmployee(CustomerRequest  employeeRequest) {
		System.out.println("POST METHOD Request from Client with ............." + employeeRequest.getFirstName() + "  " + employeeRequest.getLastName());
		CustomerActivity empActivity = new CustomerActivity();
		return empActivity.createEmployee(employeeRequest.getFirstName(), employeeRequest.getLastName());
	}	
}
