package customer;

import interfaces.CustomerInterface;
import interfaces.CustomerVisitor;

public class VipCustomer extends Customer implements CustomerInterface {

	public VipCustomer(String name, String surname, String city) {
		super(name, surname, city);
		this.group = "VIP";
		applyDiscount();
	}
	
	@Override
	   public void accept(CustomerVisitor customerVisitor) {
	      customerVisitor.visit(this);
	     // System.out.println(toString()); // Nie chcemy by teraz by³o wyœwietlane
	     
	   }
	
	
}
