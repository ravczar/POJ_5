package interfaces;

import customer.GoodCustomer;
import customer.StandardCustomer;
import customer.VipCustomer;
import customer.group.Group;


public interface CustomerVisitor {
	public void visit(Group group);

	public void visit(StandardCustomer standardCustomer);
	public void visit(GoodCustomer goodCustomer);
	public void visit(VipCustomer vipCustomer);
	
}
