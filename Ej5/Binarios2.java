package Ej5;

import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Binarios2 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream entrada = null;

        try {
            fis = new FileInputStream("C:\\Ojito\\Prueba2.dat");
            entrada = new DataInputStream(fis);

            int numero;
            int mayor = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            int suma = 0;

            while (entrada.available() > 0) {
                numero = entrada.readInt();
                System.out.println("Número leído: " + numero);

                mayor = Math.max(mayor, numero);
                menor = Math.min(numero, menor);
                suma += numero;
            }

            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
            System.out.println("La suma de los números es: " + suma);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}