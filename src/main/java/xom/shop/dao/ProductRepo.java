package xom.shop.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import xom.shop.persist.Product;

@Repository
public class ProductRepo {

	@Autowired
	HibernateTemplate hiber;

	public List<Product> getPoductList() {
		List<Product> prolist = hiber.loadAll(Product.class);
		System.out.println(prolist);
		return prolist;
	}

	public Product getPoduct(int id) {
		Product pro = hiber.get(Product.class, id);
		System.out.println(pro);
		return pro;
	}

	@Transactional
	public void updatePoduct(Product product) {
		hiber.update(product);
	}

	@Transactional
	public void deletPoduct(Product product) {
		hiber.delete(product);
	}

	@Transactional
	public Integer savePoduct(Product product) {
		return (Integer) hiber.save(product);
	}
	@Transactional
	public Product saveAndGetProduct(Product product) {
		return  hiber.merge(product);
	}

	public ProductRepo() {
		// TODO Auto-generated constructor stub
	}
}
