package parts;

import file.writing.SaveToFile;
import interfaces.ComputerPart;
import interfaces.ComputerPartVisitor;

public class Keyboard extends Part implements ComputerPart,Cloneable {

	   public Keyboard(String code, String name, double price) {
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
	  public Keyboard clone() {
	    try {
	      return (Keyboard) super.clone();
	    } catch (CloneNotSupportedException e) {
	      System.out.println(this.getClass().getName() + " nie implementuje Cloneable...");
	      return null;
	    }
	  }
	  
	}