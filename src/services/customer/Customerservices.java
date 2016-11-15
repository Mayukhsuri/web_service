package services.customer;

import java.sql.SQLException;
import java.util.Set;

import javax.jws.WebService;

import services.representation.customer.CustomerRepresentation;
import services.representation.customer.CustomerRequest;


@WebService
public interface Customerservices {
	
	public Set<CustomerRepresentation> getCustomers()throws SQLException;
	public CustomerRepresentation getCustomer(String customerID)throws SQLException;
	public CustomerRepresentation createCustomer(CustomerRequest customerRequest)throws SQLException;
}
