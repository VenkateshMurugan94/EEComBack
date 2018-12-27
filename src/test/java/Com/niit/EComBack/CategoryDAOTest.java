//package Com.niit.EComBack;
//
//import static org.junit.Assert.*;
//
//import java.util.List;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import Com.niit.EComBack.DAO.CategoryDAO;
//import Com.niit.EComBack.DAO.CategoryDAOImp;
//import Com.niit.EComBack.model.Category;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=DBConfig.class)
//public class CategoryDAOTest {
//
//	@Autowired
//	CategoryDAO CategoryDAO;
//	Category c=new Category();
//	@Before
//	public void setUp() throws Exception {
//		
//		c.setCategoryName("Vegetables1");
//		c.setCategoryDesc("It is a Vegetables");
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		
//		CategoryDAO.DeleteCategory(c);
//	}
//
//	@Test
//	public void test() {
//		
//		assertEquals("Testing Pass",CategoryDAO.CreateCategory(c));
//		
//		CategoryDAO.CreateCategory(c);
//		List<Category>list=CategoryDAO.ViewAllCategory();
//		Category c=CategoryDAO.ViewOneCatogory("Vegetables1");
//		assertTrue("Success",list.size()>0);
//		assertTrue("Success",c!=null);
//		c.setCategoryName("Fresh Vegetables");
//		CategoryDAO.UpdateCategory(c);
//		Category c1=CategoryDAO.ViewOneCatogory("Fresh Vegetables");
//		assertTrue("success",c1.getCategoryName()=="Fresh Vegetables");
//		
//	}
//
//}
