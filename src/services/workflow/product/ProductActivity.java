package services.workflow.product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import services.product.ProductService;
import services.representation.*;
import services.representation.product.ProductRepresentation;


import domain.product.Product;
import domain.product.ProductManagerfacade;
import domain.*;

public class ProductActivity{

private static ProductManagerfacade em = new ProductManagerfacade();
	
	public Set<ProductRepresentation> getProducts() {
		
		Set<Product> product = new HashSet<Product>();
		Set<ProductRepresentation> productRepresentation = new HashSet<ProductRepresentation>();
		//employees = dao.getAllEmployees();
		product = em.getAllProduct();
		
		Iterator<Product> it = product.iterator();
		while(it.hasNext()) {
			Product emp = (Product)it.next();
			ProductRepresentation productRepresentations= new ProductRepresentation();
			productRepresentations.setProductID(emp.getProductID());
			productRepresentations.setProductDescription(emp.getProductDescription());
			productRepresentations.setUnitPrice(emp.getUnitPrice());
          
          //now add this representation in the list
			productRepresentations.add(productRepresentations);
        }
		return productRepresentation;
	}
	
	public ProductRepresentation getProduct(int id) {
		
		//Employee emp = dao.getEmployee(id);
		Product ord = em.serachProduct(id);
		
		ProductRepresentation ordRep = new ProductRepresentation();
		ordRep.setProductDescription(ord.getProductDescription());
		ordRep.setUnitPrice(ord.getUnitPrice());
		ordRep.setProductID(ord.getProductID());
		
		return ordRep;
	}
	
	public ProductRepresentation createProduct(String productDescription, int unitPrice, int availableQuantity ) {
		
		//Employee emp = dao.addEmployee(firstName, lastName);
		Product emp = em.addProduct(productDescription, unitPrice, availableQuantity);
		
		ProductRepresentation ordRep = new ProductRepresentation();
		ordRep.setProductDescription(emp.getProductDescription());
		ordRep.setUnitPrice(emp.getUnitPrice());
		ordRep.setProductID(emp.getProductID());
		
		return ordRep;
	}

	public Set<ProductRepresentation> getProduct() {
		// TODO Auto-generated method stub
		return null;
	}
}
