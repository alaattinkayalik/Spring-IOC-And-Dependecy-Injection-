package springIntro;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomer());
		customerManager.add();
			
		
	}

}
