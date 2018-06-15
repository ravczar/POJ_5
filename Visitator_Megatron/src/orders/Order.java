package orders;

import java.time.LocalDate;
import java.util.ArrayList;

import app.RoundingDoubles;
import file.writing.SaveToFile;
import interfaces.ComputerPart;
import interfaces.ComputerPartVisitor;
import interfaces.OrderInterface;
import interfaces.OrderVisitor;

public class Order implements ComputerPart, OrderInterface {
		private String orderName;
		private String City;
		private double totalGross;
		private double totalNett;
		private double totalTax;
		private int totalCount;
		private LocalDate orderDate;
		private ArrayList<ComputerPart> parts = new ArrayList<ComputerPart>();
	
	public Order(String orderName, String city) {
			super();
			this.orderName = orderName;
			this.City = city;
		}
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getTotalTax() {
		return totalTax;
	}
	public double getTotalGross() {
		return totalGross;
	}
	public double getTotalNett() {
		return totalNett;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public ArrayList<ComputerPart> getParts() {
		return parts;
	}
	public void addPosition(ComputerPart part) {
		
		if (parts.contains(part) ) {
			part.iterateCount();
		}
		else if (!parts.contains(part) ) {
			parts.add(part);
			part.iterateCount();
		}
		
	}
/// FUNKCJA zwracajaca WSZYSTKIE ELEMENTY z tablicy parts
		public String toString() {
			
					for (ComputerPart cp : parts) {
						
						return	"\n" + cp.toString();
					}
					return null;
			
		}
	
/// Wyœwietlanie Poszczególnych zamówieñ
		public void PrintOrder(){
			for (ComputerPart cp : parts) {
				System.out.println( cp.toString() + cp.getClass().getSimpleName());
				totalGross += cp.getGrossPrice();
				totalNett += cp.getNettoPrice();
				totalCount += cp.getCount();
				totalTax += cp.getTaxValue();
			}
			
			System.out.println("|Nazwa zamówienia: " + this.orderName   + " |Data zamówienia: " + orderDate + " |Suma Netto: " + RoundingDoubles.round(totalNett, 2) + " |Suma Brutto: " + RoundingDoubles.round(totalGross, 2) + " |Suma podatku: " +RoundingDoubles.round(totalTax, 2) + " |Iloœæ przedmiotów: " + totalCount + "\n\n");
		}
	
		@Override
		public void accept(ComputerPartVisitor computerPartVisitor) {
		   for (ComputerPart cp : parts) {
		      cp.accept(computerPartVisitor);

		   }
		   computerPartVisitor.visit(this);
		   PrintOrder();   /// <<WYSWIETLANIE ZAMOWIENIA W KONSOLI>>
		   String x = "|Nazwa zamówienia: " + this.orderName   + " |Data zamówienia: " + orderDate + " |Suma Netto: " + RoundingDoubles.round(totalNett, 2) + " |Suma Brutto: " + RoundingDoubles.round(totalGross, 2) + " |Suma podatku: " +RoundingDoubles.round(totalTax, 2) + " |Iloœæ przedmiotów: " + totalCount + "\n\n";
		   SaveToFile.Save(x);
		}
		
/////////////////+++++ ŒMIECI INTERFEJSOWE ++++++///////////////////////////////
		public int getCount() {
			return 0;
		}
		public double getNettoPrice() {
			return 0;
		}
		public double getGrossPrice() {
			return 0;
		}
		public double getTaxValue() {
			return 0;
		}
		public String getCode() {
			return null;
		}
		public void iterateCount() {
	
		}
		public ComputerPart clone() {
			return null;
			}

		@Override
		public void accept(OrderVisitor orderVisitor) {
				}
		
	}