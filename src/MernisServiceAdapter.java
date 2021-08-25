import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub;

public class MernisServiceAdapter implements IPersonCheckService {

	public Boolean CheckIfRealPerson(Customer customer) throws RemoteException
	{
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(customer.nationalityId, customer.firstName, customer.lastName,customer.dateOfBirth);
	}
	
}
