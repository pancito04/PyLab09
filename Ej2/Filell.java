package Ej2;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Filell {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		PrintWriter salida = null;
		try {
			salida = new PrintWriter("C:\\Ojito\\OtroTexto.txt");
			String cadena;
			System.out.println("Introduce texto. Para acabar introduce la cadena FIN");
			cadena = sc.nextLine();
			while (!cadena.equalsIgnoreCase("FIN")) {
				salida.println(cadena);
				cadena = sc.nextLine();
			}
			salida.flush();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			salida.close();
		}
	}
}
