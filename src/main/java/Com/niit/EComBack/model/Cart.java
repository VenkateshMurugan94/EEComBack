package Com.niit.EComBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dummyId;
	
	@Column(nullable = false)
	private int cartId;
	
	@Column(nullable = false)
	private int productId;
	
	@Column(nullable = false)
	private String productName;

	@Column(nullable = false)
	private float productPrice;

	@Column(nullable = false)
	private int productQuantity;
	
	@Column(nullable = false)
	private float subTotal;
	
	

	public int getDummyId() {
		return dummyId;
	}

	public void setDummyId(int dummyId) {
		this.dummyId = dummyId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}

	
	
	
	

}
