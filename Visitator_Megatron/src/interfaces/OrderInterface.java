package interfaces;

import java.time.LocalDate;

public interface OrderInterface {
	public void accept(OrderVisitor orderVisitor);
	
	public String getOrderName();
	public String getCity();
	public LocalDate getOrderDate();
	public double getTotalTax();
	public double getTotalGross();
	public double getTotalNett();
	public int getTotalCount();
}
