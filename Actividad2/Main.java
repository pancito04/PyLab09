package Actividad2;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		String cad;
		try(PrintWriter salida = new PrintWriter("C:\\Ojito\\OtroTexto3.txt")){
			System.out.println("Introduce texto. Para acabar introduce la cadena FIN");
			cad = sc.nextLine();
			while(!cad.equalsIgnoreCase("FIN")) {
				salida.println(cad);
				cad = sc.nextLine();
			}
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
