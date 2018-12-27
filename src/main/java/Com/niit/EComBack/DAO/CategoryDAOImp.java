package Com.niit.EComBack.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Com.niit.EComBack.model.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImp implements CategoryDAO {
	
	
@Autowired
SessionFactory sessionfactory;

	public boolean CreateCategory(Category category) {

		try {
			
			sessionfactory.getCurrentSession().save(category);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
		
	}

	public boolean UpdateCategory(Category category) {
		
		try {
			
			sessionfactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean DeleteCategory(Category category) {
		
		try {
			
			sessionfactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public List<Category> ViewAllCategory() {
		try {
			
			return sessionfactory.getCurrentSession().createQuery("from Category").list();	
		}
		catch(Exception e)
		{
			System.out.println("2");
			return null;
		}
		
		
	}

	public Category ViewOneCatogory(String categoryName) {
		
		try {
			return(Category)sessionfactory.getCurrentSession().createQuery("from Category where categoryName='"+categoryName+"'").uniqueResult();
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	

}
