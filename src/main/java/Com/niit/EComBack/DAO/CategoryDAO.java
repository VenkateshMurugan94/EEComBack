package Com.niit.EComBack.DAO;

import Com.niit.EComBack.model.Category;
import java.util.List;


public interface CategoryDAO {
	
	public boolean CreateCategory(Category category);
	public boolean UpdateCategory(Category category);
	public boolean DeleteCategory(Category category);
	public List<Category>ViewAllCategory();
	public Category ViewOneCatogory(String categoryName);
	
}
