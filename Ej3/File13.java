package Ej3;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class File13 {
	public static void main( String[]args) {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Ojito\\OtroTexto.txt");
			BufferedReader entrada = new BufferedReader(fr);
			String cadena = entrada.readLine();
			while (cadena != null) {
				System.out.println(cadena);
				cadena = entrada.readLine();
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(fr != null) {
					fr.close();
				}
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
