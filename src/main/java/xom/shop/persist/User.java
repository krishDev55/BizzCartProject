package xom.shop.persist;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	/* @GeneratedValue(strategy=GenerationType.SEQUENCE) */
	@Id()
	int user_id;
	String username;
	String email;
	String birth_d;
	
	public String getBirth_d() {
		return birth_d;
	}

	public void setBirth_d(String birth_d) {
		this.birth_d = birth_d;
	}

	String password;
	long mobile_no;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", email=" + email + ", birth_d=" + birth_d
				+ ", password=" + password + ", mobile_no=" + mobile_no + "]";
	}

	public User() {
		System.out.println("This is User controller");
	}

}
