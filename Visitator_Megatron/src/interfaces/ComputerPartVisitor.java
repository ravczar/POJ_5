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

public interface ComputerPartVisitor {
	public void visit(Order order);
	public void visit(AllOrders allOrders);
	

	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
	public void visit(Printer printer);
	public void visit(CentralUnit centralUnit);
	public void visit(GraphicsCard graphicsCard);
	public void visit(SoundCard soundCard);
	public void visit(WiFiCard wiFiCard);
	public void visit(Motherboard motherboard);
	
}