package app;

import java.io.IOException;
import java.time.LocalDate;

import interfaces.ComputerPart;
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

public class OrderGenerator {
	
	public static void GenerateOrder(LocalDate dateOfOrder, Order orderName, int howManyPositions) throws IOException {
		ComputerPart [] item = {
				new Mouse("Log518", "Logitech mx518" , 200.3),
				new Keyboard("Ste123", "Steel series", 300.2),
				new Monitor("LGKD24","LG KD24IPS", 400.7),
				new Printer("HP0666", "HP cosmos", 400.8),
				new CentralUnit("Del300", "Dell x300" , 500.2),
				new SoundCard("Sou123","SoundBlaster", 250.50),
				new SoundCard("FWXXX","FineWorks", 250.50),
				new WiFiCard("Bro123", "Broadlink x", 125.7),
				new Motherboard("Asr110","Asrock h110", 250.8),
				new Mouse("RZR17G", "Razer Nyga" , 300.3),
				new Keyboard("Dll000", "Dell precision", 150.2),
				new Monitor("LGKD27","LG KD27IPS4K", 350.7),
				new Printer("HP0100", "HAWLET PACKARD", 400.8),
				new CentralUnit("Del500", "Dell x500" , 450.2),
				new GraphicsCard("Gef105","GTX 1050ti" , 450.1),
				new SoundCard("Sou345","SB Live!", 200.50),
				new WiFiCard("Cisco111", "Cisco sucks", 150.7),
				new Motherboard("Asr130","Asrock h130", 275.8),
				new Motherboard("Intel12","Intel Pro0", 300.1),
				new CentralUnit("HAP200", "HP 12XYZ" , 500.5)
		}; 
		
		for (int i = 1; i <= howManyPositions; i++) {
			ComputerPart x = item [ (int) (Math.random()* 20)]; // u¿ycie klasy Math by wylosowac skladniki zamowienia
			ComputerPart y = (ComputerPart)x.clone(); // klonujemy C.Part x na C.part y musimy to zrobic, by moc wyswietlac poprawnie poszczegolne Ordery 
			orderName.addPosition(x); // <0,1> * 20 pozycji tablicy 'items' dodajemy do tablicy Danego Orderu (Order1, Order2, Order3)
			AllOrders.addOrderToAllOrders(y);    // dodajemy sklonowane ComputerParts do Sumuj¹cej zamówienia tablicy AllOrder
			
		}
		orderName.setOrderDate(dateOfOrder); // ustawi datê dodania zamówienia, z atrubutów metody
		AllOrders.allOrderInstances.add(orderName); // dodaje Ca³y order, a nie tylko pozycje, do Tablicy w klasie <<AllOrders.allOrderInstances>>
}
}