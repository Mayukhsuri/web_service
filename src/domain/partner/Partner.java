package domain.partner;

import domain.product.Product;

public class Partner {
	
	private int partnerID;
	private String partnerType;
	private String partnerName;
	private Product product;
	
	public Partner(int partnerID, String partnerType, String partnerName, Product product) {
		super();
		this.partnerID = partnerID;
		this.partnerType = partnerType;
		this.partnerName = partnerName;
		this.product = product;
	}
	public Partner() {
		
		this.partnerID = partnerID;
		this.partnerType = partnerType;
		this.partnerName = partnerName;
		this.product = product;
	}
	public int getPartnerID() {
		return partnerID;
	}

	public void setPartnerID(int partnerID) {
		this.partnerID = partnerID;
	}

	public String getPartnerType() {
		return partnerType;
	}

	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
