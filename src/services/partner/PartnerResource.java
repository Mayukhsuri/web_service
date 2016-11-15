package services.partner;

import java.util.Set;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import services.representation.customer.CustomerRepresentation;
import services.representation.customer.CustomerRequest;
import services.representation.partner.PartnerRepresentation;
import services.representation.partner.PartnerRequest;
import services.workflow.customer.CustomerActivity;
import services.workflow.partner.PartnerActivity;
@Path("/partnerservices")
public abstract class PartnerResource implements PartnerServices {
	@GET
	@Produces({"application/xml" , "application/json"})
	@Path("/partner")
	public Set<PartnerRepresentation> getPartner() 
	{
		System.out.println("GET METHOD Request for all Partners .............");
		PartnerActivity custActivity = new PartnerActivity();
		return custActivity.getPartner();	
	}
	@GET
	@Produces({"application/xml" , "application/json"})
	@Path("/partner/{partnerID}")
	public PartnerRepresentation getPartners(@PathParam("partnerID") int id) {
		System.out.println("GET METHOD Request from Client with customerrequest string ............." + id);
		PartnerActivity custActivity = new PartnerActivity();
		return custActivity.getPartner(id);
	}
	@POST
	@Produces({"application/xml" , "application/json"})
	@Path("/partner")
	public PartnerRepresentation createPartner(PartnerRequest  partnerRequest) {
		System.out.println("POST METHOD Request from Client with ............." + partnerRequest.getPartnerName() + "  " );
		PartnerActivity empActivity = new PartnerActivity();
		return empActivity.createPartner(partnerRequest.getPartnerName(), partnerRequest.getPartnerID());
	}	
}
