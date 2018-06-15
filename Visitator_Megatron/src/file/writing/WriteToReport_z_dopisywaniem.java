package file.writing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteToReport_z_dopisywaniem {
	public static String filePath = "C:\\Users\\Rafa³Czarnecki\\git\\POJ_4\\Visitator_Megatron\\src\\file\\writing\\raport.txt";
	
	public static void zapisz_do_pliku(String podajCos) throws IOException {
		Writer output = new BufferedWriter(new FileWriter(filePath, true));  
		output.append(podajCos + "\n");
		output.close();
	    }
	

}
