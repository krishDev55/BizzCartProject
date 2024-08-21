package xom.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xom.shop.dao.ProductRepo;

import xom.shop.persist.Product;

@Service("product_Service")
public class Product_Service {

	@Autowired
	ProductRepo product_Repo;
	
	@SuppressWarnings("null")
	public void save_product(Product product) {
		String product_name = product.getProduct_name();
		float price = product.getPrice();
		int count = product.getCount();
		
		if(product_name==null  && price <=0 && count <=0) {
			System.out.println("product name is blank");
		}
		else {
			product_Repo.saveProduct(product);
		}
	}
	
}
