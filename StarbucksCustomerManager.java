import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class StarbucksCustomerManager extends BaseCustomerManager{
	@Override
	public void save(Customer customer) {
		System.out.println("Starbucks müþteri kaydedildi: "+customer.FirstName+" "+customer.LastName);
		BaseCustomerManager Starbuckscustomer= new BaseCustomerManager();
		if(Starbuckscustomer.CheckIfRealPerson(customer)) {
		
			System.out.println("Müþteri onaylandý");
			
		}
		else {
			System.out.println("müþteri onaylanmadý");
		}
	
	}

}
