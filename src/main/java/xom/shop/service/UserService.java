package xom.shop.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
	User_Repository userRepo;
	String message = "Check values carefully";
	@Autowired
	ProductService proserv;

	public ModelAndView getuser(HttpServletRequest req, Model model, String post) {
		Integer id = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");
		System.out.println("ID" + id + "\tpassword" + password + "\t" + "Post" + post);
		if (id == null | password == null) {
			model.addAttribute(id);
			model.addAttribute(password);
			model.addAttribute(message);
			return new ModelAndView("loginForm", "model", model);
		}
		User user = userRepo.getUser(id, password);
		if (id.equals(user.getUser_id()) && password.equals(user.getPassword())) {
			List<Product> productList = proserv.getProducts();
			model.addAllAttributes(productList);
			model.addAttribute(user);
			return new ModelAndView("user", "model", model);
		} else {
			model.addAttribute(id);
			model.addAttribute(password);
			model.addAttribute(message);
			return new ModelAndView("loginForm", "model", model);
		}
	}

	public UserService() {
		// TODO Auto-generated constructor stub
	}

}
