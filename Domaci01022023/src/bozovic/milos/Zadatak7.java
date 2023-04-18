package bozovic.milos;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Zadatak7 {

	public static void main(String[] args) throws IOException{
		
		//kreiramo klasu koja omogućava povezivanje tastature sa tokom
		DataInputStream d = new DataInputStream(System.in);

		//kreiramo klasu koju ćemo povezati sa fajlom
		FileOutputStream f = new FileOutputStream("domaci.txt");
		
		char ch;
		while((ch = (char) d.read()) != '$') {
			f.write(ch);
		}
		f.close();
	}

}
