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
//import org.springframework.test.context.TestExecutionListeners;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import Com.niit.EComBack.DAO.CategoryDAO;
//import Com.niit.EComBack.DAO.ProductDAO;
//import Com.niit.EComBack.model.Category;
//import Com.niit.EComBack.model.Product;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=DBConfig.class)
//public class ProductDAOTest {
//
//	@Autowired
//	ProductDAO productDAO;
//	Product p=new Product();
//	
//	@Before
//	public void setUp() throws Exception {
//		
//		p.setProductName("Vegetables");
//		p.setProductDesc("It is a Vegetables");
//		p.setProductPrice(100);
//		p.setProductQuantity(5);
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		
//		productDAO.DeleteProduct(p);
//	}
//
//	@Test
//	public void test() {
//		
//		assertEquals("Testing Pass",productDAO.CreateProduct(p));
//		
//		productDAO.CreateProduct(p);
//		List<Product>list=productDAO.ViewAllProduct();
//		Product p=productDAO.ViewOneProduct("Vegetables");
//		assertTrue("Success",list.size()>0);
//		assertTrue("Success",p!=null);
//		p.setProductName("Fresh Vegetables");
//		productDAO.UpdateProduct(p);
//		Product p1=productDAO.ViewOneProduct("Fresh Vegetables");
//		assertTrue("success",p1.getProductName()=="Fresh Vegetables");
//		fail("Not yet implemented");
//	}
//
//}
