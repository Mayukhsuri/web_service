package dbconn;


import domain.product.Product;
import functions.*;



public class Main {
	
	public static void main(String []args){
		
	Functionalities functions = new Functionalities();
	Product product = functions.serachProduct(1001);
	System.out.print("Product search result :" + " " 
	+"Product Description - "+product.getProductDescription()+" "+"unit Price - "+  product.getUnitPrice());
	
	Functionalities functionorder = new Functionalities();
	//Order or = functionorder.ordermanage(, orderdesp, orderquant)();
	//System.out.println( "your order place data is: " + " " +"order ID - "+or.getOrderID()+"order quantity: "+ or.getOrderQuantity());
	
	Functionalities functionopayment = new Functionalities();
	//Payment p = functionopayment.paymentcheck(123456789012353, 123);
	
	

}
		

}

