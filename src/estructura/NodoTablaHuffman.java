package estructura;

public class NodoTablaHuffman {
	//	Variables
	private NodoTablaHuffman siguiente;
	private byte dato;
	private String byteAcotado;
	private int ocurrencia;
	
	//	Constructor
	public NodoTablaHuffman(NodoTablaHuffman siguiente, byte dato, String byteAcotado, int ocurrencia) {
		this.siguiente=siguiente;
		this.dato=dato;
		this.byteAcotado=byteAcotado;
		this.ocurrencia=ocurrencia;
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
