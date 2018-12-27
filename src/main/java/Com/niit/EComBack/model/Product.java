package Com.niit.EComBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;

	@Column(nullable = false, unique = true)
	@NotEmpty(message = "name cannot be blank")
	private String productName;

	@Column(nullable = false)
	@NotEmpty(message = "name cannot be blank")
	private String productDesc;

	@Column(nullable = false)
	@Min(value = 6, message = "price must be greater than 5")
	private float productPrice;

	@Column(nullable = false)
	@Min(value = 3, message = "quantity must be greater than 2")
	private int productQuantity;

	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Category catogery;
	
	@Transient
	MultipartFile pimage;

	public MultipartFile getPimage() {
		return pimage;
	}

	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
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

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
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

	public Category getCatogery() {
		return catogery;
	}

	public void setCatogery(Category catogery) {
		this.catogery = catogery;
	}

}
