package xom.shop.persist;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	int product_id;
	String product_name;
	String description;
	 String image; 
	float  price;
	 int  count;
	 
	 

	 
	 
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product() {
		System.out.println("This is Product controller");
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", description=" + description
				+ ", image=" + image + ", price=" + price + ", count=" + count + "]";
	}
	public Product(int product_id, String product_name, String description, String image, float price, int count) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.description = description;
		this.image = image;
		this.price = price;
		this.count = count;
	}

	
	

}
