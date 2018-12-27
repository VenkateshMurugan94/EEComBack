package Com.niit.EComBack.DAO;

import java.util.List;

import Com.niit.EComBack.model.Address;

public interface AddressDAO {
	
	public boolean CreateAddress(Address address);
	public boolean UpdateAddress(Address address);
	public boolean DeleteAddress(int id);
	public List<Address>ViewAllAddress(int cartid);
	public Address ViewOneAddress(int addressid);

}
