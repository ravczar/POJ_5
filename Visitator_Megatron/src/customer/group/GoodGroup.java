package customer.group;

import java.util.ArrayList;

import interfaces.CustomerInterface;
import orders.Order;

public class GoodGroup extends Group implements CustomerInterface{

	public GoodGroup(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Order> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
