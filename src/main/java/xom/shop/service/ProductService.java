package xom.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import xom.shop.dao.ProductRepo;
import xom.shop.persist.Product;

@Service
public class ProductService {
	@Autowired
	ProductRepo prorepo;

	public ProductService() {
		// TODO Auto-generated constructor stub
	}

	public List<Product> getProducts() {
		return prorepo.getPoductList();
	}

}
