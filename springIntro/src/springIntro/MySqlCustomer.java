package springIntro;

public class MySqlCustomer implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("MySql Veri Tabanına Eklendi");		
	}
	
}
