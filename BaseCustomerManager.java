
public class BaseCustomerManager implements CustomerService, CustomerCheckService{
	@Override
	public void save(Customer customer) {
		System.out.println("M��teri kaydedildi: "+customer.FirstName+" "+customer.LastName);

	}
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

	

}
