package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Set;

import javax.management.Query;

import domain.customer.Customer;
import domain.order.Order;
import domain.product.Product;


public class CustomerDb {


	private static String dbUrl = "jdbc:mysql://localhost:3307/mycart";
	private static String dbUsername = "root";
	private static String dbPassword = "Mayukh123";

	private Statement statement = null;

	
	public void customerinsert(Customer custom)
	{
		//Order order1 = new Order();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			statement = connection.createStatement();
			ResultSet result = null;
			/*System.out.println("Database connection established");

			System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO product " +
		                   "VALUES (4, 'Chair', 75.50)";
		   statement.executeUpdate(sql);
		   System.out.println("Inserted records into the table...");*/
			
			//String sql2 = "Select * from orderr WHERE Orderquantity =3 ;";
			
			//result = statement.executeQuery(query);
			//result = statement.executeQuery(sql2);
			
/*			if(orderquantity<1)
			{
				System.out.println("Order cannot be placed.");
				result.next();
			}
			else
			{
				System.out.println("Your order is placed.");

	 		}
	 		
	*/	
		
		
		System.out.println("records have been sucessfully inserted...");

		}			
		 catch(SQLException e) {
			System.err.print(e.getMessage());
		} catch(Exception e) {
			System.err.print(e.getMessage());
		}
		finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public Customer displaydetails()
	{
		return null;
		
	}

	public Set<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	  }
	
	
}
