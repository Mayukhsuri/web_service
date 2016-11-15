package domain.order;
import dbconn.*;
import domain.order.*;
import domain.product.Product;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Ordermanagerfacade extends OrderDb{

	OrderDb oconn = new OrderDb();
	public void ordermanage(Map<Product,Integer> product, String orderdesp, int orderquant)
	{
		Order o = new Order();
		String status=null;
		Orderstatus os = new Orderstatus(status);
		

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

	public Order addOrder(int orderDate, Orderstatus orderStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Order> getAllorders() {
		Set<Order> orders = new HashSet<Order>();
		//orders = oconn.or
				return null;
	}

	public Order getOrder(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}