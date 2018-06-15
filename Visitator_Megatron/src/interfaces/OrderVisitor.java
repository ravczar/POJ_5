package interfaces;

import orders.Order;

public interface OrderVisitor {
	public void visit(Order order);
	//public void visit(AllOrders orders);
}
