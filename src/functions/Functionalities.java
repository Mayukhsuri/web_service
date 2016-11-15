package functions;
import java.util.Map;

import dbconn.OrderDb;
import dbconn.dbConnection; 
import domain.order.Order;
import domain.order.Orderstatus;
import domain.payment.Payment;
import domain.product.Product;

public class Functionalities {
	public Product serachProduct(int productID)
	{

		dbConnection connect = new dbConnection();
		Product product = connect.searchProduct(productID);
		return product;

	}
/*	public Order orderacc(int orderquantity)
	{

		OrderDb connect1 = new OrderDb();
		Order or1 = connect1.orderaccept(orderquantity);
		return or1;
	}
*/	
	public void paymentcheck(Payment cardnoo,Payment cvvv )
	{
		//Customer cust = payy.getCustomerID();
		long cardno = cardnoo.getCardno();
		int cvv = cvvv.getCvv();
		//String type = payy.getType();
		if (String.valueOf(cardno).length()<15)
		{
			if (String.valueOf(cvv).length()<3)
			{
				System.out.print("Payment details are saved successfully");
			}
		}
		else
		{
			System.out.println("Details are not valid");
		}
	}
	public void ordermanage(Map<Product,Integer> product, String orderdesp, int orderquant)
	{
		Order o = new Order();
		Orderstatus os = new Orderstatus();
		OrderDb oconn = new OrderDb();
		orderdesp ="book";
		orderquant = 2;
		
		Product p = new Product(1002, "book", 300);
		product.put(p, 3);
		o.setOrderID(123);
//		o.setCustomer(customer);
		o.setTotalPrice(300);
		os.setOrderStatus("dispatch");
		oconn.orderaccept(o, product);
	
		
	}
}
