package estructura;

public class Nodo {

	NodoHuffman info;
	Nodo ref;

	public Nodo(byte info, Nodo ref) {
		this.info = new  NodoHuffman(info);
		this.ref = ref;
	}
	public Nodo(NodoHuffman info,Nodo ref){
		this.info = info;
		this.ref = ref;
	}

	public NodoHuffman getInfo() {
		return info;
	}

	public void setInfo(NodoHuffman info) {
		this.info = info;
	}

	public Nodo getRef() {
		return ref;
	}

	public void setRef(Nodo ref) {
		this.ref = ref;
	}

}