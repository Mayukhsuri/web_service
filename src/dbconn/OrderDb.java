package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import domain.order.Order;
import domain.product.Product;


public class OrderDb {


	private static String dbUrl = "jdbc:mysql://localhost:3307/mycart";
	private static String dbUsername = "root";
	private static String dbPassword = "Mayukh123";

	private Statement statement = null;

	public void deleteorder(){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			statement = connection.createStatement();
			ResultSet result1 = null;
			/*System.out.println("Database connection established");

			System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO product " +
		                   "VALUES (4, 'Chair', 75.50)";
		   statement.executeUpdate(sql);
		   System.out.println("Inserted records into the table...");*/
			
			String sql3 = "Delete from orderr WHERE OrderID=1;";
					result1 = statement.executeQuery(sql3);
			System.out.println("records have been sucessfully inserted...");

		}			
		 catch(SQLException e) {
			System.err.print(e.getMessage());
		} catch(Exception e) {
			System.err.print(e.getMessage());
		}
	}
					
	
	public void orderaccept(Order o, Map<Product, Integer> product)
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
			
			String sql2 = "Select * from orderr WHERE Orderquantity =3 ;";
			
			//result = statement.executeQuery(query);
			result = statement.executeQuery(sql2);
			
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
		Order order1 = new Order();
		for (Map.Entry<Product, Integer> en : product.entrySet()) {
			order1.setOrderQuantity("3");
			order1.setTotalPrice(300);
		}
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
}


