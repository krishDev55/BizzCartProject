package xom.shop.service;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import xom.shop.dao.AdminEditor_Repo;
import xom.shop.persist.Admin;
import xom.shop.persist.Categories;
import xom.shop.persist.Editor;
import xom.shop.persist.Product;

@Service
public class Admin_EditorService {
	@Autowired
	AdminEditor_Repo adminrepo;
	@Autowired
	ProductService proserv;

	String message = "Check values properly";
	public static HashMap<String,String> adminLoginSession=new HashMap<>();


	public ModelAndView getAdmin(HttpServletRequest req, Model model,String post,HttpServletResponse response) {
		Integer id = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");
		System.out.println("ID-->" + id + "\tpassword-->" + password + "\t"+"post-->"+post);
		if (id == null | password == null) {
			model.addAttribute("id", id);
			model.addAttribute("password", password);
			model.addAttribute(message);
			return new ModelAndView("loginForm");
		}
		Admin admin = adminrepo.getAdmin(id, password);
		System.out.println(admin);
		if (id.equals(admin.getAdmin_id()) && password.equals(Integer.toString(admin.getPassword()))) {
			
			List<Product> productList = proserv.getProductList();
			model.addAttribute("productList", productList);
			model.addAttribute(admin);
			return new ModelAndView("admin");
		} else {
			model.addAttribute("id", id);
			model.addAttribute("password", password);
			model.addAttribute(message);
			return new ModelAndView("loginForm");
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
		if (editor.getFlag() == false) {
			editor.setEditor_id(id);
			editor.setPasskey(key);
			mod.addAttribute("message", message);
			mod.addAttribute("editor", editor);
			return new ModelAndView("EditorCheck");
		} else {
			List<Admin> list = adminrepo.getListAdmin();
			mod.addAttribute("adminList", list);
			mod.addAttribute("editor", editor);
			return new ModelAndView("Editor");
		}
	}

	public List<Categories> getListCategory() {
		return adminrepo.getListCategory();
	}

	public Admin_EditorService() {
		// TODO Auto-generated constructor stub
	}

}
