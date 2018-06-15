package customer;

import java.util.ArrayList;

import orders.Order;

public abstract class Customer {
	protected String name;
	protected String surname;
	protected String city;
	protected String group;
	protected double discount;
	
	protected ArrayList<Order> orders = new ArrayList<Order>();
	
	public Customer(String name, String surname , String city) {
		super();
		this.name = name;
		this.surname = surname;
		this.city = city; 
		this.group = "";
		applyDiscount ();
	}
	
	protected void applyDiscount () {
		if (this.group.equals("VIP"))
			setDiscount(0.1);
		
		else if(this.group.equals("GOOD")) 
			setDiscount(0.05);
		
		else if (this.group.equals("STDRD"))
			setDiscount(0);
		
		else
			setDiscount(0);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public ArrayList<Order> getOrders() {
		return orders;
	}
	public void addOrder(Order order) {
		orders.add(order);
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
	   
		return 
			"|IMIE \t\t|" +"NAZWIKO \t|" + "MIASTO \t|" + "GRUPA \t|" + "ZNI¯KA \t|" + "ZAMÓWIENIA \t|\n" +
			 "|" +
			 name + "\t\t|" +
			 surname + "\t|" +
			 city + "\t\t|" +
			 group + "\t|" + 
			 discount*100 + "%\t\t|" +
			 orders.size() + "\t\t|"
			 ;
	}
	
}
