package xom.shop.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import xom.shop.dao.User_Repository;
import xom.shop.persist.Editor;
import xom.shop.persist.User;
import xom.shop.service.Admin_EditorService;
import xom.shop.service.UserService;

@Controller
public class HomeController {

	@Autowired
	User_Repository homedao;

	@Autowired()
	Admin_EditorService admed;
	@Autowired()
	UserService usser;

	public HomeController() {
		System.out.println("This is HomeController constructor");
	}

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}

	@RequestMapping(method = RequestMethod.POST, value = "/editor/login")
	public ModelAndView test1(HttpServletRequest req, @ModelAttribute("editor") Editor edito, Model mod)
			throws IOException {
		return admed.getEditor(req, mod);

	}

	@RequestMapping(value = "/logine")
	public ModelAndView editor(HttpServletResponse response) throws IOException {
		return new ModelAndView("loginForm");
	}

	@RequestMapping(value = "/Editor")
	public ModelAndView loginForm(Model mode) throws IOException {
		return new ModelAndView("EditorCheck");
	}

	@RequestMapping(value = "/saveEntity", method = RequestMethod.POST)
	public ModelAndView saveEntity(@ModelAttribute("user") User user) throws IOException {
		homedao.saveUser(user);
		return new ModelAndView("usersaved");
	}

	@RequestMapping(value = "/createEntity")
	public ModelAndView creatEntity(HttpServletResponse response) throws IOException {
		User user = new User();
		return new ModelAndView("userEntry", "user", user);
	}

	@RequestMapping(value = "/loginEntity")
	public ModelAndView checkEntity(HttpServletRequest req, Model mode) throws IOException {
		String post = req.getParameter("post");
		if (post.equals("admin")) {
			return admed.getAdmin(req, mode, post);
		} else {
			return usser.getuser(req, mode, post);
		}
	}

}
