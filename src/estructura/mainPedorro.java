package estructura;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class mainPedorro {

	public static void main(String[] args) {

		try {
			String ruta = "C:/Users/Gaston/Desktop/gaston puto.txt";
			Codificador codificador= new Codificador(new RandomAccessFile(ruta, "rw"), ruta);//tercer par{ametro es una tabla huffman
			codificador.escribirCabecera();
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
