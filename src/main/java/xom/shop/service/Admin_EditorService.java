package xom.shop.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import xom.shop.dao.AdminEditor_Repo;
import xom.shop.persist.Admin;
import xom.shop.persist.Editor;
import xom.shop.persist.Product;

@Service
public class Admin_EditorService {
	@Autowired
	AdminEditor_Repo adminrepo;
	@Autowired
	ProductService proserv;

	public Admin_EditorService() {
		// TODO Auto-generated constructor stub
	}

	String message = "Check values properly";

	@SuppressWarnings("unlikely-arg-type")
	public ModelAndView getAdmin(HttpServletRequest req, Model model, String post) {
		Integer id = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");
		System.out.println("ID" + id + "\tpassword" + password + "\t" + "Post" + post);
		if (id == null | password == null) {
			model.addAttribute(id);
			model.addAttribute(password);
			model.addAttribute(message);
			return new ModelAndView("loginForm", "model", model);
		}
		Admin admin = adminrepo.getAdmin(id, password);
		System.out.println(admin);
		if (id.equals(admin.getAdmin_id()) && password.equals(Integer.toString(admin.getPassword()))) {
			System.out.println("this admin is right");
			List<Product> productList = proserv.getProducts();
			System.out.println(productList);
			model.addAllAttributes(productList);
			model.addAttribute(admin);
			return new ModelAndView("Admin", "model", model);
		} else {
			System.out.println("this is admin is wrong");
			model.addAttribute(id);
			model.addAttribute(password);
			model.addAttribute(message);
			return new ModelAndView("loginForm", "model", model);
		}
	}

	public ModelAndView getEditor(HttpServletRequest req, Model mod) {
		Integer id = Integer.parseInt(req.getParameter("id"));
		String key = req.getParameter("passkey");
		String message = "Somthing Went rong Check if Id or passkey are Correct \n They must not blank ";
		if (id == null | key == null) {
			return new ModelAndView("EditorCheck", "message", message);
		}
		Editor editor = adminrepo.getEditor(id, key);
		Admin admin = adminrepo.getAdmin(0, "");
		if (editor.getFlag() == false) {
			editor.setEditor_id(id);
			editor.setPasskey(key);
			mod.addAttribute("message", message);
			mod.addAttribute("editor", editor);
			return new ModelAndView("EditorCheck", "modal", mod);
		} else {
			List<Admin> list = adminrepo.getListAdmin();
			mod.addAttribute("adminList", list);
			mod.addAttribute("editor", editor);
			return new ModelAndView("Editor", "mod", mod);
		}

	}

}
