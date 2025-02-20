package xom.shop.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import xom.shop.dao.ProductRepo;
import xom.shop.persist.Product;

@Service
public class ProductService {
	@Autowired
	ProductRepo productRepo;

	public Product getPoduct(int id) {

		return productRepo.getPoduct(id);
	}

	@Transactional
	public void updatePoduct(Product product) {
		productRepo.updatePoduct(product);
	}

	@Transactional
	public void deletPoduct(Product product) {
		productRepo.deletPoduct(product);
	}

	@Transactional
	public Integer savePoduct(Product product) {
		return (Integer) productRepo.savePoduct(product);
	}

	@Transactional
	public Product saveAndGetProduct(Product product) {
		return productRepo.saveAndGetProduct(product);
	}

	public ProductService() {
		// TODO Auto-generated constructor stub
	}

	public List<Product> getProductList() {
		List<Product> productList = productRepo.getPoductList();
		for (Product pr : productList) {
			String[] allImageUrl = pr.getImage_url().split(",");
			for (int i = 0; i < allImageUrl.length - 1; i++) {
				if (allImageUrl[i] == "+" | allImageUrl[i] == "null") {
					continue;
				} else {
					pr.setImage_url(allImageUrl[i]);
				}
			}
		}
		return productList;
	}

	public List<Product> getProductListwithImages() {
		return productRepo.getPoductList();
	}

	public ModelAndView checkProduct(int id, Model model) {

		Product product = getPoduct(id);
		String[] allImageUrl = product.getImage_url().split(",");
		List<String> listImages = new ArrayList<String>();
		for (int i = 1; i < allImageUrl.length - 1; i++) {
			if ("null" == allImageUrl[i] || "" == allImageUrl[i] || "," == allImageUrl[i]) {
				continue;
			} else {
				listImages.add(allImageUrl[i]);
			}
		}
		List<Product> productList = getProductList();
		model.addAttribute("product", product);
		model.addAttribute("ProductList", productList);
		model.addAttribute("listImages", listImages);

		return new ModelAndView("product/showProduct");
	}

}
