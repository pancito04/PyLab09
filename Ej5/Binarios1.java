package Ej5;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Binarios1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
	
		DataOutputStream salida = null;
		int n;
		try {
			fos = new FileOutputStream("C:\\Ojito\\Prueba2.dat");
			salida = new DataOutputStream(fos);
			System.out.println("Introduce numero entero -1 para acabar: ");
			n = sc.nextInt();
			while (n != -1) {
				salida.writeInt(n);
				System.out.println("Introduce numero entero. -1 para acabar: ");
				n = sc.nextInt();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (salida != null) {
					salida.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
