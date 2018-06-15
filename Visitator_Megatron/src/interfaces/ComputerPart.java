package interfaces;

public interface ComputerPart {
	   public void accept(ComputerPartVisitor computerPartVisitor);
	   
	   	public String getCode();	
	   	public void iterateCount();
	   	int getCount();
		public double getNettoPrice();
		public double getGrossPrice();
		public double getTaxValue();
		public ComputerPart clone();
	
	}