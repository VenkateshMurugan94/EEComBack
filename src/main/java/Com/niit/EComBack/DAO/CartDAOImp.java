package Com.niit.EComBack.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Com.niit.EComBack.model.Cart;
import Com.niit.EComBack.model.Category;


@Repository("CartDAO")
@Transactional
public class CartDAOImp implements CartDAO {
	
	@Autowired
	SessionFactory sessionfactory;

			public boolean CreateCart(Cart cart) {

			try {
				
				sessionfactory.getCurrentSession().save(cart);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
			
			
		}

			public boolean UpdateCart(Cart cart) {
			
			try {
				
				sessionfactory.getCurrentSession().update(cart);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}

			public boolean DeleteCart(Cart cart) {
			
			try {
				
				sessionfactory.getCurrentSession().delete(cart);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}

		
			public List<Cart>ViewAllCart(int cartId) {
			try {
				
				return sessionfactory.getCurrentSession().createQuery("from Cart").list();	
			}
			catch(Exception e)
			{
				System.out.println("2");
				return new ArrayList<Cart>();
			}
			
			
		}

			public Cart ViewOneCart(int dummyId) {
			
			try {
				return(Cart)sessionfactory.getCurrentSession().createQuery("from Cart where dummyId='"+dummyId+"'").uniqueResult();
			}
			catch(Exception e)
			{
				return null;
			}
			
		}

}
