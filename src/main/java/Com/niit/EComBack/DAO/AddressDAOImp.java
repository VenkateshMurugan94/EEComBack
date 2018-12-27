package Com.niit.EComBack.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Com.niit.EComBack.model.Address;

@Repository("AddressDAO")
@Transactional
public class AddressDAOImp implements AddressDAO{
	
	@Autowired
	SessionFactory sessionfactory;

			public boolean CreateAddress(Address address) {

			try {
				
				sessionfactory.getCurrentSession().save(address);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
			
			
		}

			public boolean UpdateAddress(Address address) {
			
			try {
				
				sessionfactory.getCurrentSession().update(address);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}

			public boolean DeleteAddress(int id) {
			
			try {
				
				sessionfactory.getCurrentSession().delete(ViewOneAddress(id));
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}

		
			public List<Address>ViewAllAddress(int cartid) {
			try {
				
				return sessionfactory.getCurrentSession().createQuery("from Address where cartid=" + cartid).list();	
			}
			catch(Exception e)
			{
				System.out.println("2");
				return null;
			}
			
			
		}

			public Address ViewOneAddress(int addressid) {
			
			try {
				return(Address)sessionfactory.getCurrentSession().createQuery("from Address where addressid='"+addressid+"'").uniqueResult();
			}
			catch(Exception e)
			{
				return null;
			}
			
		}
	
	

}
