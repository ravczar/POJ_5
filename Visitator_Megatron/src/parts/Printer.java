package parts;

import file.writing.SaveToFile;
import interfaces.ComputerPart;
import interfaces.ComputerPartVisitor;

public class Printer extends Part implements ComputerPart,Cloneable {
	
	   public Printer(String code, String name, double price) {
		super(code, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	      System.out.println(toString());
	      SaveToFile.Save(toString());
	   }
	
	  @Override
	  public Printer clone() {
	    try {
	      return (Printer) super.clone();
	    } catch (CloneNotSupportedException e) {
	      System.out.println(this.getClass().getName() + " nie implementuje Cloneable...");
	      return null;
	    }
	  }

	
	}