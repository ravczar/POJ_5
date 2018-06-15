package parts;

import app.RoundingDoubles;

public abstract class Part{
	
	protected String code;
	protected String name;
	protected double price;
	protected int count;
	protected double tax = TAX_23;
	
	public static final double TAX_5 = 0.05;
	public static final double TAX_8 = 0.08;
	public static final double TAX_23 = 0.23;
	
	
	public Part(String code, String name, double price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void iterateCount() {
		count += 1;
	}
	public void raiseCount(int ile) {
		count +=ile;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	// Tworzymy nowe metody do liczenia kwot nett/gross oraz Vat amount.
	public double getNettoPrice() {
		return RoundingDoubles.round(getPrice() * count, 2);
	}
	
	public double getGrossPrice() {
		return RoundingDoubles.round(getNettoPrice() * (1 + tax),2);
	}
	
	public double getTaxValue() {
		return RoundingDoubles.round(getGrossPrice() - getNettoPrice(), 2);
	}
	
	
	@Override
	public String toString() {
	 
		return 
			"|NAZWA: " + name + "\t" +
			" |KOD: " + code + "\t" +
			" |ILOŒÆ: " + count + "\t" +
			" |CENA 1PC: " + price + "\t" + 
			" |NETTO: " + getNettoPrice() + "\t" +
			" |BRUTTO: " + getGrossPrice() + "\t" +
			" |St.VAT: " + getTax() + "\t" +
			" |Podatek: " + getTaxValue() + "\t|";
	}
	
	
}
