package Com.niit.EComBack.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Com.niit.EComBack.model.Product;

@Repository
@Transactional
public class ProductDAOImp implements ProductDAO {

	@Autowired
	SessionFactory sessionfactory;
	
	public boolean CreateProduct(Product product) {

		try {
			
			sessionfactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
		
	}

	public boolean UpdateProduct(Product product) {
		
		try {
			
			sessionfactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean DeleteProduct(Product product) {
		
		try {
			
			sessionfactory.getCurrentSession().delete(product);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public List<Product> ViewAllProduct() {
		try {
			
			return sessionfactory.getCurrentSession().createQuery("from Product").list();
			
		}
		catch(Exception e)
		{
			return null;
		}
		
		
	}

	public Product ViewOneProduct(String productName) {
		
		try {
			
			
			return(Product)sessionfactory.getCurrentSession().createQuery("from Product where productName='"+productName+"'").uniqueResult();
			
			
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
}
