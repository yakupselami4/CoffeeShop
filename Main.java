
public class Main {

	public static void main(String[] args) {
		
		
		Customer customer= new Customer();
		customer.FirstName="Yakup Selami";
		customer.LastName="�zt�rk";
		customer.id=1;
		customer.DateOfBird="20 Nisan 2000";
		customer.NationalityId="12345678910";
		
		
		
		BaseCustomerManager CustomerLogin= new StarbucksCustomerManager();
		CustomerLogin.CheckIfRealPerson(customer);
		CustomerLogin.save(customer);
		
		

	}

}
