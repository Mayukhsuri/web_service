package services.product;

import java.util.Set;

import services.representation.product.ProductRepresentation;
import services.representation.product.ProductRequest;


public interface ProductService {
	
	public Set<ProductRepresentation> getProduct();
	public ProductRepresentation getProduct(String ProductID);
	public ProductRepresentation createProduct(ProductRequest ProductRequest);
}
