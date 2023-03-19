package springIntro;

public class CustomerManager {
	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}
	void add() {
		customerDal.add();
	}
}
