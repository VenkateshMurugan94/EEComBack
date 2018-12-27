package Com.niit.EComBack.DAO;

import Com.niit.EComBack.model.UserDetail;

public interface UserDAO {
	
	public boolean createUser(UserDetail userDetail);
	 public UserDetail userDetail(String emailId);

}
