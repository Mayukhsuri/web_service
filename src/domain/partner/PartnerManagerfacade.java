package domain.partner;

import java.util.Scanner;
import java.util.Set;

import com.sun.jndi.cosnaming.IiopUrl.Address;


import dbconn.CustomerDb;
import domain.partner.Partner;
import dbconn.OrderDb;
import dbconn.PartnerDb;
import dbconn.dbConnection;
import domain.partner.Partner;


public class PartnerManagerfacade  extends PartnerDb{
	
	private static Scanner sc = new Scanner(System.in);
	public void addPartner() {
		
		//int customerID=0; 
		Partner partnerAddress= null;
		
		PartnerDb conn = new PartnerDb();	
		
		Partner c = new Partner();
			
		System.out.println("please enter partnerID: ");
		int partnerID=sc.nextInt();
		c.setPartnerID(partnerID);
		
		System.out.println("please enter partners name: ");
		String partnerName=sc.nextLine();
		c.setPartnerName(partnerName);
		
		System.out.println("please enter type: ");
		String partnerType=sc.nextLine();
		c.setPartnerType(partnerType);

		
	conn.Partnerinsert(c);
	
	}
	public Set<Partner> getAllPartners() {
		// TODO Auto-generated method stub
		return null;
	}
	public Partner addPartner(String Name, int idd) {
		// TODO Auto-generated method stub
		return null;
	}
	public Partner getPartner(int id) {
		
		return null;
	}
}
