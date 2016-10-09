package estructura;

public class mainPedorro {

	public static void main(String[] args) {
		LectorArchivo leer= new LectorArchivo("C:/Users/Martin/Desktop/THETRUTH.txt");
		leer.leerArchivo();
		
		
		ArbolHuffman arbol = new ArbolHuffman(leer.getLista());
		
		arbol.mostrar();
		
	}

}
