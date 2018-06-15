package customer;

import interfaces.CustomerInterface;
import interfaces.CustomerVisitor;

public class StandardCustomer extends Customer implements CustomerInterface{

	public StandardCustomer(String name, String surname, String city) {
		super(name, surname, city);
		this.group = "STDRD";
		applyDiscount();
	}
	
	@Override
	   public void accept(CustomerVisitor customerVisitor) {
	      customerVisitor.visit(this);
	      //System.out.println(toString());
	   }
	
}
