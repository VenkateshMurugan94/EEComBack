package Com.niit.EComBack.DAO;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Com.niit.EComBack.model.UserCredential;
import Com.niit.EComBack.model.UserDetail;


@Repository
@Transactional
public class UserDAOImp implements UserDAO {
	
	@Autowired
	 SessionFactory sessionFactory;
	
	
	 public boolean createUser(UserDetail userDetail) {
		
		  try {
				
			  UserCredential uc=new UserCredential();
			  uc.setEmailId(userDetail.getEmailId());
			  uc.setPassword(userDetail.getPassword());
			  uc.setRole("ROLE_USER");
			  
				sessionFactory.getCurrentSession().saveOrUpdate(userDetail);
				sessionFactory.getCurrentSession().saveOrUpdate(uc);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
	 }
	 
	 public UserDetail userDetail(String emailId) {
		 
		 try {
				
				
				return(UserDetail)sessionFactory.getCurrentSession().createQuery("from UserDetail where emailId='"+emailId+"'").uniqueResult();
				
				
			}
			catch(Exception e)
			{
				return null;
			}
	}

}
