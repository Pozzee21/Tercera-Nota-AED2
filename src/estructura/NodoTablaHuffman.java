package estructura;

public class NodoTablaHuffman {
	//	Variables
	private NodoTablaHuffman siguiente;
	private byte dato;
	private String byteAcotado;
	private int ocurrencia;
	
	//	Constructor
	public NodoTablaHuffman(byte dato, String byteAcotado, int ocurrencia, NodoTablaHuffman siguiente) {
		
		this.dato=dato;
		this.byteAcotado=byteAcotado;
		this.ocurrencia=ocurrencia;
		this.siguiente=siguiente;
	}
	
	//	Geters and Seters
	public NodoTablaHuffman getSiguiente() {
		return siguiente;
	}

	public byte getDato() {
		return dato;
	}

	public String getByteAcotado() {
		return byteAcotado;
	}

	public int getOcurrencia() {
		return ocurrencia;
	}


}
