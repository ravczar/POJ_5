package app;

import java.io.IOException;
import java.time.LocalDate;
import customer.GoodCustomer;
import customer.StandardCustomer;
import customer.VipCustomer;
import customer.group.GoodGroup;
import customer.group.StandardGroup;
import customer.group.VipGroup;
import interfaces.ComputerPart;
import interfaces.ComputerPartDisplayVisitor;
import interfaces.CustomerDisplayVisitor;
import interfaces.CustomerInterface;
import orders.AllOrders;
import orders.Order;

public class VisitorPatternDemo {
	/* https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm */
	/* http://edu.pjwstk.edu.pl/wyklady/zap/scb/W6/W6.htm */ 
	/* https://javastart.pl/baza-wiedzy/darmowy-kurs-java/efektywne-programowanie/plytkie-i-glebokie-kopiowanie-klonowanie-obiektow */
	public static void main(String[] args) throws IOException {
		
		// Tworzymy zamówienia i u¿ywamy generatora by zapluæ je itemami. Itemy siê nie powtarzaj¹ na pozycjach tylko s¹ iterowane (Patrz OrderGenerator).
		 Order order1 = new Order("order1" , "Gdañsk");
		 ComputerPart computer1 = order1;
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 28), order1, 20);
	     computer1.accept(new ComputerPartDisplayVisitor());
      
		 Order order2 = new Order("order2", "Londyn");
		 ComputerPart computer2 = order2; 
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 15), order2, 20);
		 computer2.accept(new ComputerPartDisplayVisitor());
 
		 Order order3 = new Order("order3", "Pary¿");
		 ComputerPart computer3 = order3;
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 10), order3, 18);
		 computer3.accept(new ComputerPartDisplayVisitor());
		
		 Order order4 = new Order("order4", "Berlin"); 
		 ComputerPart computer4 = order4; 
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 24), order4, 10);
	     computer4.accept(new ComputerPartDisplayVisitor());
	     
		 Order order5 = new Order("order5", "Gdañsk");
		 ComputerPart computer5 = order5; 
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 14), order5, 22);
		 computer5.accept(new ComputerPartDisplayVisitor());
	     
		 Order order6 = new Order("order6", "Lublin");
		 ComputerPart computer6 = order6;
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 4), order6, 15);
		 computer6.accept(new ComputerPartDisplayVisitor());

		 Order order7 = new Order("order7", "Kraków"); 
		 ComputerPart computer7 = order7; 
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 18), order7, 12);
	     computer7.accept(new ComputerPartDisplayVisitor());
	     
		 Order order8 = new Order("order8", "Gdañsk");
		 ComputerPart computer8 = order8; 
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 8), order8, 9);
		 computer8.accept(new ComputerPartDisplayVisitor());
	     
		 Order order9 = new Order("order9", "S³upsk");
		 ComputerPart computer9 = order9;
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 2), order9, 11);
		 computer9.accept(new ComputerPartDisplayVisitor());
	
		 Order order10 = new Order("order10", "Stetin"); 
		 ComputerPart computer10 = order10; 
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 14), order10, 28);
	     computer10.accept(new ComputerPartDisplayVisitor());
	     
		 Order order11 = new Order("order11", "Gdynia");
		 ComputerPart computer11 = order11; 
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 3), order11, 14);
		 computer11.accept(new ComputerPartDisplayVisitor());
	     
		 Order order12 = new Order("order12", "Sopot");
		 ComputerPart computer12 = order12;
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 1), order12, 11);
		 computer12.accept(new ComputerPartDisplayVisitor());
  
		 Order order13 = new Order("order13", "Sopot");
		 ComputerPart computer13 = order13;
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 2), order13, 17);
		 computer13.accept(new ComputerPartDisplayVisitor());
  
		 Order order14 = new Order("order14", "Stetin");
		 ComputerPart computer14 = order14;
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 3), order14, 14);
		 computer14.accept(new ComputerPartDisplayVisitor());
  
		 Order order15 = new Order("order15", "Berlin");
		 ComputerPart computer15 = order15;
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 6), order15, 9);
		 computer15.accept(new ComputerPartDisplayVisitor());
  
		 Order order16 = new Order("order16", "Kraków");
		 ComputerPart computer16 = order16;
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 1), order16, 21);
		 computer16.accept(new ComputerPartDisplayVisitor());
  
		 Order order17 = new Order("order17", "Gdañsk");
		 ComputerPart computer17 = order17;
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 11), order17, 5);
		 computer17.accept(new ComputerPartDisplayVisitor());
  	
		 Order order18 = new Order("order18", "Gdynia");
		 ComputerPart computer18 = order18;
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 22), order18, 12);
		 computer18.accept(new ComputerPartDisplayVisitor());
  
		 Order order19 = new Order("order19", "Gdynia");
		 ComputerPart computer19 = order19;
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 13), order19, 17);
		 computer19.accept(new ComputerPartDisplayVisitor());
  
		 Order order20 = new Order("order20", "Gdynia");
		 ComputerPart computer20 = order20;
		 OrderGenerator.GenerateOrder(LocalDate.of(2018, 5, 29), order20, 15);
		 computer20.accept(new ComputerPartDisplayVisitor());
		 
			AllOrders komplet = new AllOrders();
			ComputerPart computer0 = komplet;
			computer0.accept(new ComputerPartDisplayVisitor());
			

			StandardCustomer standard1 = new StandardCustomer("Roman", "Erotoman", "Gdansk");
			StandardCustomer standard2 = new StandardCustomer("Bart", "Ryksiarz", "Gdynia");
			StandardCustomer standard3 = new StandardCustomer("Marek", "Rudimental", "Sopot");
			GoodCustomer good1 = new GoodCustomer("Anna", "Zadymna", "Wars");
			GoodCustomer good2 = new GoodCustomer("Ala", "Farciarz", "Lêbork");
			GoodCustomer good3 = new GoodCustomer("Kasia", "Koslawa", "Rumia");
			VipCustomer vip1 = new VipCustomer("Marek", "Siergiej", "Gdynia");
			VipCustomer vip2 = new VipCustomer("Tomek", "Kaprysny", "Gdansk");
			VipCustomer vip3 = new VipCustomer("Elon", "Zazdrosny", "Gdansk"); 
		 
			standard1.addOrder(order1);
			standard2.addOrder(order2);
			standard3.addOrder(order3);
			good1.addOrder(order4);
			good1.addOrder(order5);	
			good2.addOrder(order6);
			good2.addOrder(order7);
			good3.addOrder(order8);
			good3.addOrder(order9);
			vip1.addOrder(order10);
			vip1.addOrder(order11);
			vip1.addOrder(order12);
			vip2.addOrder(order13);
			vip2.addOrder(order14);
			vip2.addOrder(order15);
			vip3.addOrder(order16);
			vip3.addOrder(order17);
			vip3.addOrder(order18);
			vip3.addOrder(order19);
			vip3.addOrder(order20);
			
			StandardGroup standards = new StandardGroup("STDRD");
			CustomerInterface customer1 = standards;
			standards.addGroupMember(standard1);
			standards.addGroupMember(standard2);
			standards.addGroupMember(standard3);
			customer1.accept(new CustomerDisplayVisitor());
   
			GoodGroup goods = new GoodGroup("GOOD");
			CustomerInterface customer2 = goods;
			goods.addGroupMember(good1);
			goods.addGroupMember(good2);
			goods.addGroupMember(good3);
			customer2.accept(new CustomerDisplayVisitor());
			
			VipGroup vips = new VipGroup("VIP");
			CustomerInterface customer3 = vips;
			vips.addGroupMember(vip1);
			vips.addGroupMember(vip2);
			vips.addGroupMember(vip3);
			customer3.accept(new CustomerDisplayVisitor());
			
			AllOrders.PrintAllOrders();

	   }
	
	}
