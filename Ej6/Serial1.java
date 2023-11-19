package Ej6;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Serial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		Persona p;
		try {
			fos = new FileOutputStream("C:\\Ojito\\SerialObj.dat") ;
			salida = new ObjectOutputStream(fos);
			p = new Persona("12345678A", "Lucas Gonzales", 30);
			salida.writeObject(p);
			p = new Persona("98765432B", "Carletto Ancelotti", 28);
			salida.writeObject(p);
			p = new Persona("78234212Z", "Maria Zapata", 35);
			salida.writeObject(p);
		} catch (FileNotFoundException e) {
			System.out.println("1. " + e.getMessage());
		} catch (IOException e) {
			System.out.println("2. " + e.getMessage());
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
				if(salida != null) {
					salida.close();
				}
			}catch (IOException e) {
				System.out.println("3. " + e.getMessage());
			}
		}
	}

}
