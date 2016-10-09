package estructura;

public interface ILista {
	
	public void insertar(byte info);
	public void insertarReordenar(NodoHuffman nodo);
	public void reordenar();
	public void mostrar();
	public NodoHuffman extraerPrimero();
	
	public Nodo getPrimero();
}
