package xom.shop.persist;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Bucket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String bucketId;

	Set<Integer> ProductsSet;

	public String getBucketId() {
		return bucketId;
	}

	public void setBucketId(String bucketId) {
		this.bucketId = bucketId;
	}

	public Set<Integer> getListProduct() {
		return getListProduct();
	}

	public void setListProduct(Set<Integer> ProductsSet) {
		this.ProductsSet = ProductsSet;
	}

	public Bucket(String bucketId, Set<Integer> ProductsSet) {
		super();
		this.bucketId = bucketId;
		this.ProductsSet = ProductsSet;
	}

	@Override
	public String toString() {
		return "Bucket [bucketId=" + bucketId + ", listProduct=" + ProductsSet + "]";
	}

	public Bucket() {
		System.out.println("this is bucket constructor");
	}

}
