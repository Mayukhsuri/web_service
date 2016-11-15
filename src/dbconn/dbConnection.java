package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import domain.product.Product;


public class dbConnection {


	private static String dbUrl = "jdbc:mysql://localhost:3307/mycart";
	private static String dbUsername = "root";
	private static String dbPassword = "Mayukh123";

	private static Statement statement = null;

	public Product searchProduct(int productID)
	{
		Product product = new Product();
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
			String query = "select * from product where Product_ID=1001";
			result = statement.executeQuery(query);
			if(result!=null)
			{
				System.out.println("Inserting records into the table...");
				result.next();
				product.setProductID(result.getInt("Product_ID"));
				product.setProductDescription(result.getString("Product_Description"));
				product.setUnitPrice(result.getDouble("Unit_Price"));
			}


		} catch(SQLException e) {
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
		return product;
	}

	public static String addProduct(Product product) {
		// TODO Auto-generated method stub
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			statement = connection.createStatement();
			ResultSet result = null;
			System.out.println("Records inserted");
			String status = "Product Added" ;
			return status;

		}catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	
			
	}	

	
	
}

