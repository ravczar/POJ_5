package interfaces;

import orders.AllOrders;
import orders.Order;
import parts.CentralUnit;
import parts.GraphicsCard;
import parts.Keyboard;
import parts.Monitor;
import parts.Motherboard;
import parts.Mouse;
import parts.Printer;
import parts.SoundCard;
import parts.WiFiCard;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
		
	   @Override
	   public void visit(Order order) {
		  System.out.println("*****************************************");
	      System.out.println("|Displaying " + order.getClass().getSimpleName() + " : " );
	      System.out.println("------------------------------------------");
	   }
		@Override
		public void visit(AllOrders allOrders) {
			   System.out.println("*****************************************");
			   System.out.println("|Displaying " + allOrders.getClass().getSimpleName() + " : " );
			   System.out.println("------------------------------------------");
		}
  
	   @Override
	   public void visit(Mouse mouse) {
		   	System.out.println("*****************************************");
		   	System.out.println("|Displaying " + mouse.getClass().getSimpleName() + " : " );
	        System.out.println("------------------------------------------"); 
	   }

	   @Override
	   public void visit(Keyboard keyboard) {
	       System.out.println("*****************************************");
	       System.out.println("|Displaying " + keyboard.getClass().getSimpleName() + " : " );
		   System.out.println("------------------------------------------");
	   }

	   @Override
	   public void visit(Monitor monitor) {
		   System.out.println("*****************************************");
		   System.out.println("|Displaying " + monitor.getClass().getSimpleName() + " : " );
		   System.out.println("------------------------------------------");
	   }
	   
	   @Override
	   public void visit(Printer printer) {
		   System.out.println("*****************************************");
		   System.out.println("|Displaying " + printer.getClass().getSimpleName() + " : " );
		   System.out.println("------------------------------------------");
	   }
	   
	   @Override
	   public void visit(CentralUnit centralUnit) {
		   System.out.println("*****************************************");
		   System.out.println("|Displaying " + centralUnit.getClass().getSimpleName() + " : " );
		   System.out.println("------------------------------------------");
	   }
	   
	   @Override
	   public void visit(GraphicsCard graphicsCard) {
		   System.out.println("*****************************************");
		   System.out.println("|Displaying " + graphicsCard.getClass().getSimpleName() + " : " );
		   System.out.println("------------------------------------------");
	   }
	   
	   @Override
	   public void visit(SoundCard soundCard) {
		   System.out.println("*****************************************");
		   System.out.println("|Displaying " + soundCard.getClass().getSimpleName() + " : " );
		   System.out.println("------------------------------------------");
	   }
	   
	   @Override
	   public void visit(WiFiCard wifiCard) {
		   System.out.println("*****************************************");
		   System.out.println("|Displaying " + wifiCard.getClass().getSimpleName() + " : " );
		   System.out.println("------------------------------------------");
	   }
	   
	   
	   @Override
	   public void visit(Motherboard motherboard) {
		   System.out.println("*****************************************");
		   System.out.println("|Displaying " + motherboard.getClass().getSimpleName() + " : " );
		   System.out.println("------------------------------------------");
	   }

	}