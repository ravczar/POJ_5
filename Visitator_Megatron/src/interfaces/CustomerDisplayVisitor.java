package interfaces;

import customer.GoodCustomer;
import customer.StandardCustomer;
import customer.VipCustomer;
import customer.group.Group;

public class CustomerDisplayVisitor implements CustomerVisitor {
		
	
   
	   @Override
	   public void visit(StandardCustomer standardCustomer) {
		  System.out.println("*****************************************************************************************");
		  System.out.println("|Displaying " + standardCustomer.getClass().getSimpleName() + " : " );
	      System.out.println("-----------------------------------------------------------------------------------------");
	   }

	   @Override
	   public void visit(GoodCustomer goodCustomer) {
		  System.out.println("*****************************************************************************************");
		  System.out.println("|Displaying " + goodCustomer.getClass().getSimpleName() + " : " );
		  System.out.println("-----------------------------------------------------------------------------------------");
	   }

	   @Override
	   public void visit(VipCustomer vipCustomer) {
		   System.out.println("*****************************************************************************************");
		   System.out.println("|Displaying " + vipCustomer.getClass().getSimpleName() + " : " );
		   System.out.println("-----------------------------------------------------------------------------------------");
	   }

	@Override
	public void visit(Group group) {
		  System.out.println("*****************************************************************************************");
		  System.out.println("|Displaying " + group.getClass().getSimpleName() + " : " );
	      System.out.println("-----------------------------------------------------------------------------------------");
	}
	   
	
	}