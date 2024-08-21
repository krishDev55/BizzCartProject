package xom.shop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import xom.shop.persist.Product;

@Repository("product_Repo")
public class ProductRepo {

	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	HibernateTemplate hibernate;
	
	public void saveProduct(Product product) {
		System.out.println("save product :" +product);
//		hibernate.save(product);
	}
}