package customer;

import interfaces.CustomerInterface;
import interfaces.CustomerVisitor;

public class GoodCustomer extends Customer implements CustomerInterface {

	public GoodCustomer(String name, String surname, String city) {
		super(name, surname, city);
		this.group = "GOOD";
		applyDiscount();
	}
	
	@Override
	   public void accept(CustomerVisitor customerVisitor) {
	      customerVisitor.visit(this);
	      //System.out.println(toString());
	   }
	
}
