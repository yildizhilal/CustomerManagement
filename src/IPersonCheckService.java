import java.rmi.RemoteException;

public interface IPersonCheckService {

  public  Boolean CheckIfRealPerson(Customer customer) throws RemoteException;
	
}
