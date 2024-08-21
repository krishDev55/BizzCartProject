package xom.shop.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import xom.shop.persist.Product;
import xom.shop.service.Product_Service;

@RestController
public class ProductC {
	
@Autowired 
 Product_Service product_Service;


	@GetMapping("/proHome")
	public ModelAndView productHome() {
		return new ModelAndView("product/productHome");
	}
	
	@GetMapping("/prod_form")
	public ModelAndView productForm() {
		
		return new ModelAndView("product/product_addPage");
	}
	
	@PostMapping("/saveProduct")
	public void saveProduct(@ModelAttribute Product product , HttpServletRequest req) throws IOException, ServletException {
		Part part = req.getPart("image");
		String imageName = part.getSubmittedFileName();
		System.out.println("Image is :"+ imageName);
		InputStream inputStream = part.getInputStream();
		 
		
		System.out.println("inside save Controller");
		product_Service.save_product(product);
		
//		return new ModelAndView("product/productHome");
	}
	
	
}
