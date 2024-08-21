package xom.shop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import xom.shop.persist.Admin;
import xom.shop.persist.Editor;

@Repository()
public class AdminEditor_Repo {

	@Autowired
	HibernateTemplate hiber;

	public Admin getAdmin(int id, String password) {
	Admin admin=hiber.get(Admin.class, id);
	return	admin;
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
		System.out.println("List of Editors-->"+editor);
		return editor;
	}


	public AdminEditor_Repo() {
		System.out.println("this is AdminEditor_Repo");
	}

	@Transactional
	public List<Admin> getListAdmin() {
		List<Admin> adminList = hiber.loadAll(Admin.class);
		System.out.println("List of Editors-->"+adminList);
		return adminList;
	}
}
