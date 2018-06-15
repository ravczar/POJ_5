package parts;

import file.writing.SaveToFile;
import interfaces.ComputerPart;
import interfaces.ComputerPartVisitor;

public class CentralUnit extends Part implements ComputerPart,Cloneable {

	   public CentralUnit(String code, String name, double price) {
		super(code, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override  // Daje mo¿liwoœæ Odwiedzin
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	      System.out.println(toString());
	      SaveToFile.Save(toString());
	   }

	  @Override // Daje mo¿liwoœæ sklonowania obiektu w opisany nizej sposob
	  public CentralUnit clone() {
	    try {
	      return (CentralUnit) super.clone();
	    } catch (CloneNotSupportedException e) {
	      System.out.println(this.getClass().getName() + " nie implementuje Cloneable...");
	      return null;
	    }
	  }

	
	}