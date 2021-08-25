public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		BaseCustomerManager base=new StarbucksCustomerManager(new MernisServiceAdapter());
		base.Save(new Customer(1,"Hilal","Deniz",1999,1234567890));
	
	    System.out.println("x");
	
	}

}
