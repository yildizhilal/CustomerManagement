import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager{

	IPersonCheckService _customerCheckService;
	
	public StarbucksCustomerManager(IPersonCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}

	public void Save(Customer customer)
	{
		try {
			if(_customerCheckService.CheckIfRealPerson(customer))
			{

				Save(customer);
			}
			else {
				System.out.println("Hata");
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
