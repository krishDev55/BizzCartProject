package xom.shop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import xom.shop.persist.Admin;
import xom.shop.persist.Categories;
import xom.shop.persist.Editor;

@Repository()
public class AdminEditor_Repo {

	@Autowired
	HibernateTemplate hiber;

	public Admin getAdmin(int id, String password) {
		Admin admin = hiber.get(Admin.class, id);
		return admin;
	}

	@Transactional
	public Editor getEditor(int id, String passkey) {
		Editor editor = hiber.load(Editor.class, id);
		if (id == editor.getEditor_id() && passkey.equals(editor.getPasskey())) {
			editor.setFlag(true);
			return editor;
		} else {
			editor.setFlag(false);
			return editor;
		}
	}

	@Transactional
	public List<Editor> getListEditor() {
		List<Editor> editor = hiber.loadAll(Editor.class);
		return editor;
	}

	@Transactional
	public List<Categories> getListCategory() {
		List<Categories> categoryList = hiber.loadAll(Categories.class);
		return categoryList;
	}

	public AdminEditor_Repo() {
	}

	@Transactional
	public List<Admin> getListAdmin() {
		List<Admin> adminList = hiber.loadAll(Admin.class);
		return adminList;
	}
}
