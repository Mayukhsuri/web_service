package domain.customer;
import java.util.Scanner;
import java.util.Set;

import org.apache.http.conn.params.ConnConnectionParamBean;


import dbconn.CustomerDb;
import dbconn.dbConnection;
import domain.order.Order;


public class Customermanagerfacade extends CustomerDb{
		
		//int customerID=0;
		
		CustomerDb conn = new CustomerDb();	
		
		Customer c = new Customer();
			

	public Customer addCustomer(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public Set<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return conn.getAllCustomers();
	}


	public Customer getCustomer(String id) {
		// TODO Auto-generated method stub
		return conn.getCustomer();
	}
}
