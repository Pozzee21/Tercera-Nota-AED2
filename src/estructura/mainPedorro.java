package estructura;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class mainPedorro {

	public static void main(String[] args) {

		try {
			Codificador codificador= new Codificador(new RandomAccessFile("C:/Users/Daiko/Desktop/gaston puto.txt", "rw"),"C:/Users/Daiko/Desktop/gaston puto.txt" );
			codificador.escribirCabecera();
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
