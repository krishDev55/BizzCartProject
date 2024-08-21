package xom.shop.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import xom.shop.persist.User;

@Repository("daorepo")
public class User_Repository {

	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	HibernateTemplate hibernate;
	private List<User> userlist;

	@Transactional
	public void saveUser(User user) {
		hibernate.persist(user);
	}
	
	@Transactional
	public void upadateUser(User user) {
		hibernate.update(user);
	}
	

	
	public User getUser(String username, String password) {
		userlist = hibernate.loadAll(User.class);
		setMonthes();
		for (User user : userlist) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				String date = user.getBirth_d().substring(3, 5);
				Monthes month = map.get(Integer.parseInt(date));
				String[] areg = user.getBirth_d().split(date);
				date = areg[0] + month + areg[1];
				user.setBirth_d(date);

				return user;
			}
		}
		return null;
	}

	public static enum Monthes {
		JAN, FEB, MARCH, APRIL, MAY, JUNE, JULY, AUG, SEP, AUCTO, NEV, DESC
	}

	static Map<Integer, Monthes> map;

	static void setMonthes() {
		map = new HashMap<Integer, Monthes>();
		int i = 1;
		for (Monthes mon : Monthes.values()) {
			map.put(i++, mon);

		}

	}

}
