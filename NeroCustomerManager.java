
public class NeroCustomerManager extends BaseCustomerManager{
	@Override
	public void save(Customer customer) {
		System.out.println("Nero müþteri kaydedildi: "+customer.FirstName+" "+customer.LastName);
		
	}

}
