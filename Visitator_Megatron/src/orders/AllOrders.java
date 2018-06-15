package orders;

import java.util.ArrayList;
import java.util.List;

import app.RoundingDoubles;
import app.VisitorPatternDemo;
import file.writing.SaveToFile;
import interfaces.ComputerPart;
import interfaces.ComputerPartVisitor;
import interfaces.OrderInterface;

public class AllOrders implements ComputerPart {
	
	private static int totalItemsCount;
	private static double bruttoTotal;
	private static double nettoTotal;
	private static double taxTotal;
	public static ArrayList<OrderInterface> allOrderInstances = new ArrayList<OrderInterface>();
	public static ArrayList<ComputerPart> allOrders = new ArrayList<ComputerPart>();
	private static List <String> allCodes = new ArrayList<String>();

/// Dodajemy nowy Order do listyy orderów	
	public static void addOrderToAllOrders(ComputerPart part) {
		
		if (allCodes.contains(part.getCode())) {
			int position_In_allCodes = allCodes.indexOf(part.getCode());
			allOrders.get(position_In_allCodes).iterateCount();
		}
		else if (!allCodes.contains(part.getCode()) ) {
		//	System.out.println("Czy *allCodes* zawiera ten CODE: " + part.getCode() +" ??: " + allCodes.contains(part.getCode()) + " , Pod indexem:  "+ allCodes.indexOf(part.getCode()) +" -> Dodajemy nowa pozycje w allOrders");
			allOrders.add(part);
			allCodes.add(part.getCode());
			part.iterateCount();
		}		
	}
/// £opatologicznie wyœwietla wszystkie ordery i ich pola <<<<allOrderInstances>>>>>
	public static void PrintAllOrdersInstances(){
		for (OrderInterface cp : allOrderInstances) {
			System.out.println("|Nazwa order: "+ cp.getOrderName() + " |Miasto dostawy: " + cp.getCity());
		}
	}
	
	
	
	public  String toString() {
				for (ComputerPart cp : allOrders) {
					return	cp.toString() + cp.getClass().getSimpleName();
				}
				return null;		
	}


/// £opatologicznie wyœwietla wszystkie ordery i ich pola <<<<allOrders>>>>>	
	public static void PrintAllOrders(){

		for (ComputerPart cp : allOrders) {
			System.out.println( cp.toString() + cp.getClass().getSimpleName());
		//	bruttoTotal += cp.getGrossPrice();
		//	nettoTotal += cp.getNettoPrice();
		//	totalItemsCount += cp.getCount();
		//	taxTotal += cp.getTaxValue(); 
		}
		System.out.println("\n|Suma Netto: " + RoundingDoubles.round(nettoTotal, 2) + " |Suma Brutto: " + RoundingDoubles.round(bruttoTotal, 2) + " |Suma podatku: " +RoundingDoubles.round(taxTotal, 2) + " |Iloœæ przedmiotów: " + totalItemsCount);
		System.out.println("\nNajczêœciej Kupowane przedmioty to: ....");
		System.out.println(ProductSoldBest_or_Worst("Best"));
		System.out.println("\nNajrzadziej Kupowane przedmioty to: ....");
		System.out.println(ProductSoldBest_or_Worst("Worst"));
		System.out.println("\nNajwiecej dostaw do miasta: ...." );
		System.out.println(OrderToCityBest_or_Worst("Best"));
		System.out.println("\nNajmniej dostaw do miasta: ...." );
		System.out.println(OrderToCityBest_or_Worst("Worst"));
	}
	
	
	//// KLASA ZWRACA STRINGA
	// W zale¿noœci od argumentu "Best",lub "Worst" wyœwietla Najczesciej kupowany Produkt lub najrzadziej kupowany produkt <<allOrders>> & <<allCodes>>
		public static String ProductSoldBest_or_Worst (String mostORworst) {
				int ileWynosiNajwiekszyCount = 0;
				int ileWynosiNajgorszyCount = 99999999;
		
			for (String str : allCodes) {
					
				if (mostORworst.equals("Best"))	{	
					if (HowManyTimes(str) > ileWynosiNajwiekszyCount) {
						ileWynosiNajwiekszyCount = HowManyTimes(str);
					}
				}
				
				else if(mostORworst.equals("Worst"))
					
					if (HowManyTimes(str) < ileWynosiNajgorszyCount) {
						ileWynosiNajgorszyCount = HowManyTimes(str);
					}
			}
		
			for(ComputerPart cp : allOrders) {
				if (cp.getCount() == ileWynosiNajwiekszyCount) {
					return "\n|KOD: " + cp.getCode() +" |Ile razy Kupiono:  "+ cp.getCount();
				}
				else if (cp.getCount() == ileWynosiNajgorszyCount) {
					return "\n|KOD: " + cp.getCode() +" |Ile razy Kupiono:  "+ cp.getCount();
				}	 
			}
			return null;
		} // ENDOF ProductSoldBest_or_Worst Method

	
	// W zale¿noœci od argumentu "Best",lub "Wors" wyœwietla Miasto do którego najczesciej lub najrzadziej wysy³amy Ordery <<allOrders>> & <<allCities>>		
		public static String OrderToCityBest_or_Worst (String mostORworst) {
		  ArrayList <String> forbiddenCities = new ArrayList<String>();
		  ArrayList<String> cities = new ArrayList<String>();
		  int MiastoNajczesciej = 0;
		  int MiastoNajrzadziej = 100;
				
/* Zapisujemy do tablicy nazwy nie powtarzajcacyh sie miast */
		for (OrderInterface cp : allOrderInstances) {
			//System.out.println("Jakie miasto: "+ cp.getCity() + " .|Ile razy: "+HowManyTimes2(cp.getCity()));
					
			if (!cities.contains(cp.getCity())) {
				cities.add(cp.getCity());
			}
		}

		for (String city : cities) {
					
			if (mostORworst.equals("Best"))	{	
				if (HowManyTimes2(city) > MiastoNajczesciej) {
					MiastoNajczesciej = HowManyTimes2(city);
					//System.out.println("aktual .Najczesciej!!: " + MiastoNajczesciej);
				}
			}
					
			else if(mostORworst.equals("Worst"))
						
			if (HowManyTimes2(city) < MiastoNajrzadziej) {
				MiastoNajrzadziej = HowManyTimes2(city);
				//System.out.println("aktual. Najrzadziej!!: " + MiastoNajrzadziej);
				}
		}
				
				String most = "\n";
				String least = "";
				for(OrderInterface cp : allOrderInstances) {
					
					// Tu trzeba ograniczyc wyswietlane miasta przez lokowainw ich w sztucznej liœcie Forbidden ( miast zakazanych do wyswietlania ponownie)
					if (HowManyTimes2(cp.getCity()) == MiastoNajczesciej && !forbiddenCities.contains(cp.getCity()) ) {
						forbiddenCities.add(cp.getCity());
						most += "|Miato: " + cp.getCity() +" |Ile razy dostawa:  "+ HowManyTimes2(cp.getCity()) + "\n";
						
					}
					else if (HowManyTimes2(cp.getCity()) == MiastoNajrzadziej) {
						least += "|Miato: " + cp.getCity() +" |Ile razy dostawa:  "+ HowManyTimes2(cp.getCity()) + "\n";
					}	 
				}
				return  most + least;
					
		} // ENDOF OrderToCityBest_or_Worst


// Ile razy zosta³ kupiony dany <<przedmiot>>
	public static int HowManyTimes(String code) {
		int count=0;
		for (ComputerPart cp : allOrders) {
			if (cp.getCode().equals(code)) {
			count += cp.getCount();	
			}
		}
		return count;
	}

// Ile razy wys³ano towar do tego <<miasta>>
	public static int HowManyTimes2(String city) {
		int count=0;
		for (OrderInterface cp : allOrderInstances) {
			if (cp.getCity().equals(city)) {
			count += 1;	
			}
		}
		return count;
	}
	
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
	   for (ComputerPart cp : allOrders) {
	      cp.accept(computerPartVisitor);
	   }
	   computerPartVisitor.visit(this);
	   
		for (ComputerPart cp : allOrders) {
			bruttoTotal += cp.getGrossPrice();
			nettoTotal += cp.getNettoPrice();
			totalItemsCount += cp.getCount();
			taxTotal += cp.getTaxValue(); 
		}
		
	   String x = "WSZYSTKIE ZAMÓWIENIA --> |Suma Netto: " + RoundingDoubles.round(nettoTotal, 2) + "|Suma Brutto: " + RoundingDoubles.round(bruttoTotal, 2) + " |Suma Podatku: " + RoundingDoubles.round(taxTotal, 2) + " |Iloœæ przedmiotów: " + totalItemsCount + "\n\n";
	   String y = "Najczêœciej Kupowane przedmioty to: ...."   + 
			   		ProductSoldBest_or_Worst("Best")  +  
			   		"\n\nNajrzadziej Kupowane przedmioty to: ...." + 
			   		ProductSoldBest_or_Worst("Worst")  + 
			   		"\n\nNajwiecej dostaw do miasta: ...." + 
			   		OrderToCityBest_or_Worst("Best")  +
			   		"Najmniej dostaw do miasta: ...." +
			   		OrderToCityBest_or_Worst("Worst")  
			   		; 
	   SaveToFile.Save(x);
	   SaveToFile.Save(y); 
	}
	
	
	/////// SMIECI
	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void iterateCount() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getNettoPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getGrossPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getTaxValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ComputerPart clone() {
		// TODO Auto-generated method stub
		return null;
	}
}