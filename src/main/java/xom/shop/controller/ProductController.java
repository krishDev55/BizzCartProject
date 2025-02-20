package xom.shop.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import xom.shop.service.ProductService;

/**
 * This is productController to manage product life cycle
 * 
 * 
 */

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@Autowired
	HomeController homeController;
	
	@RequestMapping(value = "/purchase", method = RequestMethod.POST)
	public ModelAndView buyProduct(@RequestParam("productId")Integer productId,HttpServletResponse response,Model model) throws IOException {
		model.addAttribute("productId",productId);
		return homeController.loginForm(response, model);
	}
	
	@RequestMapping(value = "/checkProduct/{id}", method = RequestMethod.GET)
	public ModelAndView checkProduct(@PathVariable("id") int id, Model model) throws IOException {
		return productService.checkProduct(id, model);
	}

	public ProductController() {
		System.out.println("this is productController ");
	}

}
