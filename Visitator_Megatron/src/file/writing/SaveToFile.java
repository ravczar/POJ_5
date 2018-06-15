package file.writing;

import java.io.IOException;

public class SaveToFile {

	
	public static void Save(String string) {
		      /*  OD TEGO MIEJSCA ZAPIS DO PLIKU REPORT.txt */
		      try {
				WriteToReport_z_dopisywaniem.zapisz_do_pliku(string);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      /* KONIEC ZAPISU DO REPORT.TXT */
		}
	}

