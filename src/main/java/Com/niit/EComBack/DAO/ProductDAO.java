package Com.niit.EComBack.DAO;

import java.util.List;
import Com.niit.EComBack.model.Product;

public interface ProductDAO {
	
	public boolean CreateProduct(Product product);
	public boolean UpdateProduct(Product product);
	public boolean DeleteProduct(Product product);
	public List<Product>ViewAllProduct();
	public Product ViewOneProduct(String productName);

}
