package interfaces;

import java.util.ArrayList;

import orders.Order;

public interface CustomerInterface {  // podobny do ComputerPart.interface
	public void accept(CustomerVisitor customerVisitor);
	
	public String getName();
	public String getSurname();
	public String getGroup();
	public String getCity();
	public ArrayList<Order> getOrders();
	public double getDiscount();
}
