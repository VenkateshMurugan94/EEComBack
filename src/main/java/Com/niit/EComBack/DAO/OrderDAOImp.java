package Com.niit.EComBack.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Com.niit.EComBack.model.MyOrder;

@Repository("OrderDAO")
@Transactional
public class OrderDAOImp implements OrderDAO {
	
	@Autowired
	SessionFactory sessionfactory;

			public boolean Placeorder(MyOrder order) {

			try {
				
				sessionfactory.getCurrentSession().save(order);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
			
			
			}

		
			public List<MyOrder>ViewAllOrder(int cartid) {
			try {
				
				return sessionfactory.getCurrentSession().createQuery("from MyOrder where cartid="+cartid).list();
			}
			catch(Exception e)
			{
				return new ArrayList<MyOrder>();
			}
			
			
		}

			public MyOrder ViewOneOrder(String orderid) {
			
			try {
				
				MyOrder order=(MyOrder)sessionfactory.getCurrentSession().createQuery("from MyOrder where orderid='"+orderid+"'").uniqueResult();
				return order;
			}
			catch(Exception e)
			{
				return null;
			}
			
		}
	
	

}
