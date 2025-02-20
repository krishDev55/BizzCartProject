package xom.shop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import xom.shop.persist.Product;
import xom.shop.persist.User;
import xom.shop.service.ProductService;
import xom.shop.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired()
	UserService userService;
	@Autowired()
	ProductService productService;

	@RequestMapping(method = RequestMethod.GET, value = "/showOffers")
	public ModelAndView showOffers(HttpServletResponse response, Model model) throws IOException {
		System.out.println("this is showOffers methos");
		List<Product> productList = productService.getProductList();
		model.addAttribute("productList", productList);
		return new ModelAndView("user/Shopping");
	}

	@RequestMapping(value = "/checkProduct/{id}", method = RequestMethod.GET)
	public ModelAndView checkProduct(@PathVariable("id") int id, Model model) throws IOException {
		System.out.println("id--->" + id);
		return userService.checkProduct(id,model);
	} 
	
	@RequestMapping(value = "/purchase", method = RequestMethod.POST)
	public ModelAndView buyProduct(@RequestParam("productId") int productId, Model model) throws IOException {
		System.out.println("id--->" + productId);	
		return userService.buyProduct();
	}

	@RequestMapping(value = "/addToBucket", method = RequestMethod.POST)
	public ModelAndView addProductToBucket(@RequestParam("productId") int productId, Model model) throws IOException {
		System.out.println("id--->" + productId);	
		return userService.addToBucket();
	}
	@RequestMapping(value = "/createEntity")
	public ModelAndView creatEntity(HttpServletResponse response,Model model) throws IOException {
		User user = new User();
		return new ModelAndView("user/loginDataForm", "user", user);
	}

	@RequestMapping(value = "/saveEntity", method = RequestMethod.POST)
	public ModelAndView saveEntity(@ModelAttribute("user") User user) throws IOException {
		return userService.saveUser(user);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getUser")
	public ModelAndView getuser(HttpServletRequest req, Model model, String post,HttpServletResponse response) {
		return userService.getuser(req, model, post,response);
	}

	@RequestMapping(value = "/sendEntity", method = RequestMethod.POST)
	public ModelAndView transferEntity(@ModelAttribute("user") User user) throws IOException {
		return new ModelAndView("user/userForm", "user", user);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/forwardUserUpdate/{id}")
	public ModelAndView forwordUserUpdate(@PathVariable("id") int id, HttpServletResponse response, Model model)
			throws IOException {
		User user = userService.getuserById(new Integer(id));
		return new ModelAndView("user/userUpdate", "user", user);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/updateUser/{id}")
	public ModelAndView updateUser(@PathVariable("id") int id, HttpServletResponse response, Model model)
			throws IOException {
		return new ModelAndView("user/update");
	}

	@RequestMapping(method = RequestMethod.POST, value = "/updateUser")
	public ModelAndView updateUser(@ModelAttribute("user") User user, HttpServletResponse response, Model model)
			throws IOException {
		userService.updateUser(user);
		return new ModelAndView("user/Shopping");
	}

	public UserController() {
		System.out.println("this is userController");
	}

}
