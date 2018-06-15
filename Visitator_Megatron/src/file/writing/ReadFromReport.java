package file.writing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromReport {
	//public static int number = 0;
	public static String tekstZPliku = null;
	
	public static void Read() throws IOException {
			String filePath = "C:\\Users\\Rafa³Czarnecki\\git\\POJ_4\\Visitator_Megatron\\src\\file\\writing\\raport.txt";

					BufferedReader fileReader = null;

					try {
					    fileReader = new BufferedReader(new FileReader(filePath));
					    String stringFromFile = fileReader.readLine();
					  //  number = Integer.parseInt(numberAsString);
					    tekstZPliku = stringFromFile;
					} finally {
					    if (fileReader != null) {
					        fileReader.close();
					        System.out.println("Plik do odczytu zamknieto");
					    }
					}
}

}