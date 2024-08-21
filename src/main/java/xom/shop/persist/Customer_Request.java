package xom.shop.persist;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer_Request {
	@Id
	int request_id;
	String description;
	String status;
	/*
	 * 2 user_id INTEGER 10 REFERENCES users(user_id) 3 category_id INTEGER 10
	 * REFERENCES categories(category_id) DEFAULT 'Pending' CHECK (status IN
	 * ('Pending', 'Approved,Rejected
	 */

	public int getRequest_id() {
		return request_id;
	}

	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Customer_Request [request_id=" + request_id + ", description=" + description + ", status=" + status
				+ "]";
	}

	public Customer_Request() {
		System.out.println("This is Customer_Request constructor");
	}

}
