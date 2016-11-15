package services.representation.product;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement(name = "Product")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ProductRepresentation {

private int ProductID;
private String productDescription;
private double unitPrice;


public int getProductID() {
	return ProductID;
}


public void setProductID(int productID) {
	ProductID = productID;
}


public String getProductDescription() {
	return productDescription;
}


public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}


public double getUnitPrice() {
	return unitPrice;
}


public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}


public void add(ProductRepresentation productRepresentations) {
	// TODO Auto-generated method stub
	
}

}
