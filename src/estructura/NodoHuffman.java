package estructura;

public class NodoHuffman {
	
	Byte dato;
	NodoHuffman izq;
	NodoHuffman der;
	int ocurrencia;
	
	public NodoHuffman(Byte info) {
		this.dato = info;
		this.ocurrencia = 1;
	}
	public Byte getDato() {
		return dato;
	}
	public void setDato(Byte dato) {
		this.dato = dato;
	}
	public NodoHuffman getIzq() {
		return izq;
	}
	public void setIzq(NodoHuffman izq) {
		this.izq = izq;
	}
	public NodoHuffman getDer() {
		return der;
	}
	public void setDer(NodoHuffman der) {
		this.der = der;
	}
	public int getOcurrencia() {
		return ocurrencia;
	}
	public void setOcurrencia(int ocurrencia) {
		this.ocurrencia = ocurrencia;
	}
	
	
}

