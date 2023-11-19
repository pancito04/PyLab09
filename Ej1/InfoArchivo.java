package Ej1;
import java.io.File;
public class InfoArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
			for(int i =0 ;i < args.length; i++) {
				File f = new File(args[i]);
				System.out.println("Nombre: " + f.getName());
				System.out.println("Ruta:" + f.getPath());
				if (f.exists()) {
					System.out.println("Archivo existe");
					System.out.println((f.canRead() ? " Y se puede leer" : ""));
					System.out.println((f.canWrite() ? " Y se puede escribir" : ""));
					System.out.println(".");
					System.out.println("La longitud del archivo es " + f.length() + " bytes");
				}else {
					System.out.println("El archivo no existe");
				}
			}
		}else {
			System.out.println("Debe indicar un archivo.");
		}
	}

}
