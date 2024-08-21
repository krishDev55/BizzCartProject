package xom.shop.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.boot.spi.AdditionalJaxbMappingProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import xom.shop.dao.AdminEditor_Repo;
import xom.shop.dao.User_Repository;
import xom.shop.persist.Editor;
import xom.shop.persist.User;
import xom.shop.service.Admin_EditorService;

@Controller
public class HomeController {

	@Autowired
	User_Repository homedao;

	@Autowired()
	AdminEditor_Repo adminrepo;
	@Autowired()
	Admin_EditorService admed;

	/**
	 * this is Defalt custructor for  flow varification  created by swapnil
	 * ***/
	public HomeController() {
		System.out.println("This is HomeController constructor");
	}

	
	/**
	 *  this method is always to use of dispatcher when
	 *   we are run the program  then ('/') project
	 *   
	 *   Git_Token : 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
	 * 
	 * ***/ 
	@RequestMapping(value = "/home")
	public ModelAndView test(HttpServletResponse response ,HttpServletRequest request) throws IOException {
		String contextPath = request.getContextPath();
		
		
		System.out.println("the Path is : " +contextPath);
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
	public ModelAndView checkEntity(HttpServletRequest req, Model mode, HttpServletResponse res) throws IOException {

		String username = req.getParameter("username");
		String passward = req.getParameter("lastName");
		String post = req.getParameter("post");
		System.out.println("username" + username + "\tpassword" + passward + "\t" + "Post" + post);
		if (post.equals("admin")) {

			return new ModelAndView("admin");
		} else {
			User use = homedao.getUser(username, passward);
			return new ModelAndView("user", "use", use);
		}

	}

}
