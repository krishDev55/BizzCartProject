package xom.shop.controller;

import java.io.IOException;
import java.util.List;

/**
 * every url="http://localhost:8081/Shop/"
*/
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import xom.shop.persist.Product;
import xom.shop.service.Admin_EditorService;
import xom.shop.service.ProductService;
import xom.shop.service.UserService;

/**
 *  
*/
@Controller
public class HomeController {
	@Autowired()
	Admin_EditorService adminEDService;
	@Autowired()
	UserService userService;
	@Autowired()
	ProductService productService;

	@RequestMapping(value = "/")
	public ModelAndView home(HttpServletResponse response, Model model) throws IOException {
		String message = "Login to see Best Offer's";
		List<Product>productList=productService.getProductList();
		model.addAttribute("message", message);
		model.addAttribute("offers",productList);
		return new ModelAndView("ShoppingApp");
	}

	@RequestMapping(value = "/logine")
	public ModelAndView loginForm(HttpServletResponse response,Model model) throws IOException {
		return new ModelAndView("loginForm");
	}     

	@RequestMapping(value = "/Editor")
	public ModelAndView editor(Model mode) throws IOException {
		return new ModelAndView("EditorCheck");
	}
	
	@RequestMapping(value = "/contactUs")
	public String aboutUs(HttpServletRequest request,HttpServletResponse response, Model model) {
		return "contactUs";
	}

	@RequestMapping(value = "/loginEntity")
	public ModelAndView checkEntity(HttpServletRequest req, Model mode,HttpServletResponse response) throws IOException {
		System.out.println("this is checkEntity method");
		String post = req.getParameter("post");
		if (post.equals("admin")) {
			return adminEDService.getAdmin(req, mode, post,response);
		} else {
			return userService.getuser(req, mode, post,response);
		}
	}

	public HomeController() {
		System.out.println("This is HomeController constructor");
	}

}
