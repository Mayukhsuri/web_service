package domain.payment;

public class Paymentcustomer {
	public void paymentcheck(Payment payy)
	{
		//Customer cust = payy.getCustomerID();
		long cardno = payy.getCardno();
		int cvv = payy.getCvv();
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
	
	
	

}
