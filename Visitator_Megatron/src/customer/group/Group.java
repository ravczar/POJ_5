package customer.group;

import java.util.ArrayList;

import interfaces.CustomerInterface;
import interfaces.CustomerVisitor;

public abstract class Group {
	protected String name;
	protected int count;
	
	protected static  ArrayList <CustomerInterface> groupMember = new ArrayList<CustomerInterface>();
	protected static ArrayList <String> cities = new ArrayList<String>();
	
	public Group(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public ArrayList<CustomerInterface> getGroupMember() {
		return groupMember;
	}
	public void addGroupMember(CustomerInterface GroupMember) {
		groupMember.add(GroupMember);
		this.count += 1;
	}
	
	// Ile zlecen jest do wybranego miasta w danej grupie (z atrybutu).
	public static int HowManyTimes(String city) {
		int count=0;
		for (CustomerInterface cp : groupMember) {
			if (cp.getCity().equals(city)) {
			count += 1;	
			}
		}
		return count;
	}
	
	public void PrintGroupMembers(String GroupName) {
		System.out.println("**************************************************************************************************************************");
		System.out.println("||NAZWA GRUPY \t|" + "|IMIE \t\t|" + "|NAZWISKO \t|" + "|TYP KLIENTA \t\t|" + "|ZAMÓWIENIA \t|" + "|ZNI¯KA \t|" + "|MIASTO \t||" );
		System.out.println("**************************************************************************************************************************");
		for (CustomerInterface customer : groupMember) {
	
		if( GroupName == customer.getGroup()) {

			System.out.println(
					"||"+
					customer.getGroup() + "\t\t||" +
					customer.getName()+ "\t\t||" +
					customer.getSurname()+ "\t||" +
					customer.getGroup() + "\t\t\t||" +
					customer.getOrders().size() + "\t\t||" +
					customer.getDiscount() *100 + "%\t\t|" +
					customer.getCity() + "\t\t||" 
					);
		}
		}
		System.out.println("**************************************************************************************************************************\n");
		
	}
	
	   //@Override
	   public void accept(CustomerVisitor customerVisitor) {
	      for (CustomerInterface cp : groupMember) {
	    	  cp.accept(customerVisitor);
	    	  // System.out.println(cp.toString()); // wyswietla zawartosc toString wszystkich danych
	      }
	      // Ta czêœæ odnosi siê ju¿ do samego Group'a.
	      customerVisitor.visit(this);
	      PrintGroupMembers(this.name);  
	      }
	
	
}
