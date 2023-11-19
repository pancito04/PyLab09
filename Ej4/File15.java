package Ej4;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class File15 {

	public static void main(String[] args) {
		File f = new File("C:\\Ojito\\OtroTexto2.txt");
		int numero, suma = 0, cont = 0;
		int numPares[] = new int[10], numImpares[] = new int[10] ,numPrimos[] = new int[10] ,numNoPrimos[] = new int[10];
		Scanner entrada = null;
		try {
			entrada = new Scanner(f);
			while (entrada.hasNextInt()) {
				String primo, parImpar;
				boolean esPrimo = true;
				numero = entrada.nextInt();
				if (numero <= 1) {
				    esPrimo = false;
				} else {
				    for (int i = 2; i <= Math.sqrt(numero); i++) {
				        if (numero % i == 0) {
				            esPrimo = false;
				            break;
				        }
				    }
				}
				if (esPrimo) {
					numPrimos[cont] = numero;
				    primo = " es primo ";
				} else {
					numNoPrimos[cont] = numero;
					primo = " no es primo ";
				}
				if (numero % 2 == 0) {
					numPares[cont] = numero;
					parImpar = " y es par";
				}else
					numImpares[cont] = numero;
					parImpar = " y es impar";
				System.out.println(numero + primo + parImpar);
				suma = suma + numero;
				cont++;
			}
			System.out.println("Numeros leidos: " + cont);
			System.out.println("Suma: " + suma);
			System.out.println("Numeros no primos:");
			for (int i = 0; i < numNoPrimos.length; i++) {
				if (numNoPrimos[i] != 0)
					System.out.println(numNoPrimos[i]);
			}
			System.out.println("Numeros Primos: ");
			for (int i = 0; i < numPrimos.length;i++) {
				if(numPrimos[i] != 0)
					System.out.println(numPrimos[i]);
			}
			System.out.println("Numeros Pares");
			for (int i = 0; i < numPares.length; i++) {
				if(numPares[i] != 0)
					System.out.println(numPares[i]);
			}
			System.out.println("Numeros Impares");
			for (int i = 0; i < numImpares.length; i++) {
				if(numImpares[i] != 0)
					System.out.println(numImpares[i]);
			}
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			entrada.close();
		}
	}

}
