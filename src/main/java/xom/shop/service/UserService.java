package xom.shop.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import xom.shop.dao.User_Repository;
import xom.shop.persist.Product;
import xom.shop.persist.User;

@Service
public class UserService {
	@Autowired
	User_Repository userRepository;
	String message = "Check values carefully";
	@Autowired
	ProductService productService;

	public static HashMap<String, String> userLoginSession = new HashMap<>();

	public ModelAndView getuserById(int id) {
		User user = userRepository.getUserById(id);
		return new ModelAndView("user/loginDataForm", "user", user);
	}

	public User getuserById(Integer id) {
		return userRepository.getUserById(id);
	}

	public ModelAndView getuser(HttpServletRequest req, Model model, String post, HttpServletResponse response) {
		Integer id = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");
		String productId = req.getParameter("productId");

		System.out.println("ID-->" + id + "\tpassword-->" + password + "\t" + "post-->" + post);
		if(productId=="") {
			productId=null;
		}
		System.out.println("ProductId------->"+productId);
		if (id == null | password == null) {
			model.addAttribute(id);
			model.addAttribute(password);
			model.addAttribute(message);
			model.addAttribute(productId);
			return new ModelAndView("loginForm");
		}
		User user = userRepository.getUserById(id);
		if (productId != null && id.equals(user.getUser_id()) && password.equals(user.getPassword())) {
			Cookie cookie = new Cookie(String.valueOf(user.getUser_id()), user.getUsername());
			cookie.setComment("use_as_user_login");
			cookie.setMaxAge(30 * 60);
			cookie.setPath("/");
			Cookie productCookie = new Cookie("productCooki", productId);
			productCookie.setMaxAge(30 * 60);
			productCookie.setPath("/");
			response.addCookie(productCookie);
			response.addCookie(cookie);
			model.addAttribute(user);
			model.addAttribute("productId",productId);
			return new ModelAndView("user/userProfile");
		} else if (id.equals(user.getUser_id()) && password.equals(user.getPassword())) {
			Cookie cookie = new Cookie(String.valueOf(user.getUser_id()), user.getUsername());
			cookie.setComment("use_as_user_login");
			cookie.setMaxAge(30 * 60);
			cookie.setPath("/");
			response.addCookie(cookie);
			List<Product> productList = productService.getProductList();
			model.addAllAttributes(productList);
			model.addAttribute(user);
			model.addAttribute("productId",productId);
			return new ModelAndView("user/userProfile");
		} else {
			model.addAttribute(id);
			model.addAttribute(password);
			model.addAttribute(message);
			model.addAttribute(productId);
			return new ModelAndView("loginForm");
		}
	}

	public ModelAndView saveUser(User user) {
		userRepository.saveUser(user);
		return new ModelAndView("user/usersaved");
	}

	public void updateUser(User user) {
		user.setBirth_d(setMonth(user));
		userRepository.upadateUser(user);
	}
	
	public ModelAndView checkProduct(int id, Model model) {

		Product product = productService.getPoduct(id);
		String[] allImageUrl = product.getImage_url().split(",");
		List<String> listImages = new ArrayList<String>();
		for (int i = 1; i < allImageUrl.length - 1; i++) {
			if ("null" == allImageUrl[i] || "" == allImageUrl[i] || "," == allImageUrl[i]) {
				continue;
			} else {
				listImages.add(allImageUrl[i]);
			}
		}
		List<Product> productList = productService.getProductList();
		model.addAttribute("product", product);
		model.addAttribute("ProductList", productList);
		model.addAttribute("listImages", listImages);

		return new ModelAndView("user/showProduct");
	}

	private String setMonth(User user) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("JAN", "01");
		map.put("FEB", "02");
		map.put("MAR", "03");
		map.put("APR", "04");
		map.put("MAY", "05");
		map.put("JUN", "06");
		map.put("JUL", "07");
		map.put("AUG", "08");
		map.put("SEP", "09");
		map.put("OCT", "10");
		map.put("NEV", "11");
		map.put("DES", "12");
		String[] month = user.getBirth_d().split("/");
		String birthdate = month[0] + "/" + map.get(month[1]) + "/" + month[2];
		System.out.println(Arrays.toString(month));
		return birthdate;
	}

	public UserService() {
	}

	public ModelAndView buyProduct() {
		
		return null;
	}

	public ModelAndView addToBucket() {
		// TODO Auto-generated method stub
		return null;
	}
}
