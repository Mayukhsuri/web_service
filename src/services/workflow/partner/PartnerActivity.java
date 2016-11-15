package services.workflow.partner;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import services.representation.customer.CustomerRepresentation;
import services.representation.partner.PartnerRepresentation;
import domain.customer.Customer;
import domain.customer.Customermanagerfacade;
import domain.partner.Partner;
import domain.partner.PartnerManagerfacade;

public class PartnerActivity {
private static PartnerManagerfacade em = new PartnerManagerfacade();
	
	public Set<PartnerRepresentation> getPartners() {
		
		Set<Partner> partner = new HashSet<Partner>();
		Set<PartnerRepresentation> partnerRepresentations = new HashSet<PartnerRepresentation>();
		//employees = dao.getAllEmployees();
		partner = em.getAllPartners();
		
		Iterator<Partner> it = partner.iterator();
		while(it.hasNext()) {
			Partner emp = (Partner)it.next();
			PartnerRepresentation partnerRepresentation = new PartnerRepresentation();
			partnerRepresentation.setPartnerID(emp.getPartnerID());
			partnerRepresentation.setPartnerName(emp.getPartnerName());
          
          //now add this representation in the list
			partnerRepresentations.add(partnerRepresentation);
        }
		return partnerRepresentations;
	}
	
	public PartnerRepresentation getPartner(int id) {
		
		//Employee emp = dao.getEmployee(id);
		Partner emp = em.getPartner(id); 
		
		PartnerRepresentation empRep = new PartnerRepresentation();
		empRep.setPartnerName(emp.getPartnerName());
		empRep.setPartnerID(emp.getPartnerID());
		
		return empRep;
	}

	public PartnerRepresentation createPartner(String Name, int idd) {
		
		Partner emp = em.addPartner(Name, idd);
		
		PartnerRepresentation empRep = new PartnerRepresentation();
		empRep.setPartnerName(emp.getPartnerName());
		empRep.setPartnerID(emp.getPartnerID());
		
		return empRep;
	}
	
	public String deleteEmployee(String id) {
		
		//dao.deleteEmployee(id);
		//em.deleteEmployee(id);
		
		return "OK";
	}

	public Set<PartnerRepresentation> getPartner() {
		// TODO Auto-generated method stub
		return null;
	}
}
