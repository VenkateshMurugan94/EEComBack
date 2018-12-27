package Com.niit.EComBack.DAO;

import java.util.List;

import Com.niit.EComBack.model.MyOrder;

public interface OrderDAO {
	
	public boolean Placeorder(MyOrder order);
	public List<MyOrder>ViewAllOrder(int cartid);
	public MyOrder ViewOneOrder(String orderid);

}
