
public class NeroCustomerManager extends BaseCustomerManager{
	@Override
	public void save(Customer customer) {
		System.out.println("Nero m��teri kaydedildi: "+customer.FirstName+" "+customer.LastName);
		
	}

}
