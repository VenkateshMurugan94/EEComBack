package Com.niit.EComBack.DAO;

import java.util.List;

import Com.niit.EComBack.model.Cart;
import Com.niit.EComBack.model.Category;

public interface CartDAO {
	
	public boolean CreateCart(Cart cart);
	public boolean UpdateCart(Cart cart);
	public boolean DeleteCart(Cart cart);
	public List<Cart>ViewAllCart(int cartId);
	public Cart ViewOneCart(int dummyId);

}
