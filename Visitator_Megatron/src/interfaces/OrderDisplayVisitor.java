package interfaces;

import orders.Order;

public class OrderDisplayVisitor implements OrderVisitor {

	   @Override
	   public void visit(Order order) {
		  System.out.println("*****************************************");
	      System.out.println("|Displaying " + order.getClass().getSimpleName() + " : " );
	      System.out.println("------------------------------------------");
	  
	   }
/*
	@Override
	public void visit(AllOrders orders) {
		  System.out.println("*****************************************");
	      System.out.println("|Displaying " + orders.getClass().getSimpleName() + " : " );
	      System.out.println("------------------------------------------");
		
	}
*/
}
