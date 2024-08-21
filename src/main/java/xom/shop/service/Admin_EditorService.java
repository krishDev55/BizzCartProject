package xom.shop.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import xom.shop.dao.AdminEditor_Repo;
import xom.shop.persist.Admin;
import xom.shop.persist.Editor;

@Service
public class Admin_EditorService {
	@Autowired
	AdminEditor_Repo adminrepo;

	public Admin_EditorService() {
		// TODO Auto-generated constructor stub
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
			mod.addAttribute("admin", admin);
			mod.addAttribute("adminList", list);
			mod.addAttribute("editor", editor);
			return new ModelAndView("Editor", "mod", mod);
		}

	}

}
