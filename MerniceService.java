import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class MerniceService implements CustomerCheckService{
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap KPSClient= new KPSPublicSoap() {
			
			@Override
			public boolean TCKimlikNoDogrula(long TCKimlikNo, String ad, String soyad, int dogumYili) throws RemoteException {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		return true;

	}

	

}
