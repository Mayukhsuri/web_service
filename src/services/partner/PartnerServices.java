package services.partner;

import java.util.Set;

import services.representation.order.OrderRepresentation;
import services.representation.order.OrderRequest;
import services.representation.partner.PartnerRepresentation;
import services.representation.partner.PartnerRequest;

public interface PartnerServices {
	
		public Set<PartnerRepresentation> getPartner();
		public PartnerRepresentation getPartner(int PartnerID);
		public PartnerRepresentation createpartner(PartnerRequest partnerRequest);
	

}
