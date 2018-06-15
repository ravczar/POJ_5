package parts;

import file.writing.SaveToFile;
import interfaces.ComputerPart;
import interfaces.ComputerPartVisitor;

public class Mouse extends Part implements ComputerPart,Cloneable{
	
	   public Mouse(String code, String name, double price) {
		super(code, name, price);
		// TODO Auto-generated constructor stub
	}
	
	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	      // setTax(TAX_5); Tu mo¿emy zmienic VAT, ale akcesoria komputerowe maj¹ 23% w PL
	      System.out.println(toString());
	      SaveToFile.Save(toString());
	   }

		  @Override
		  public Mouse clone() {
		    try {
		      return (Mouse) super.clone();
		    } catch (CloneNotSupportedException e) {
		      System.out.println(this.getClass().getName() + " nie implementuje Cloneable...");
		      return null;
		    }
		  }
	   
	}