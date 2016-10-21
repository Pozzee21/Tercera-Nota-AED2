package estructura;

public class Lista implements ILista{
	Nodo primero;
	int tama�o = 0;

	public void insertar(byte info){
		if(primero== null){
			primero = new Nodo(info, null);
			tama�o++;
		}else{
			Nodo aux = primero;
			while(aux!= null){
				if(aux.getInfo().getDato()== info){
					aux.getInfo().setOcurrencia(aux.getInfo().getOcurrencia()+1);
					break;
				}else if (aux.getRef()== null){
					aux.setRef(new Nodo(info, null));
					tama�o++;
					break;
				}
				aux = aux.getRef();
			}
		}
		
	}
	public void reordenar(){
		Lista listaAux = new Lista();
		Nodo aux = primero;

		while(aux != null){
			listaAux.insertarReordenar(aux.getInfo());
			aux = aux.getRef();

		}

		primero = listaAux.getPrimero();

	}
	
	
	
	public int getTama�o() {
		return tama�o;
	}
	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
	public Nodo getPrimero() {
		return this.primero;
	}

	public void setPrimero(Nodo primero) {
		this.primero = primero;
	}

	public void insertarReordenar(NodoHuffman nodo){
		if(primero== null){
			primero = new Nodo(nodo, null);
		}else if(nodo.getOcurrencia() < primero.getInfo().getOcurrencia()){
				Nodo aux = primero;
				primero = new Nodo(nodo, aux);
		}else if(primero.getRef() == null && nodo.getOcurrencia() >= primero.getInfo().getOcurrencia()){
				primero.setRef(new Nodo(nodo, null));
		}else{
			Nodo auxAnterior = primero, aux = primero.getRef();
			while(aux!= null){

				if(nodo.getOcurrencia() < aux.getInfo().getOcurrencia()){
					auxAnterior.setRef(new Nodo(nodo, aux));
					break;
				}else if(aux.getRef() == null){
					aux.setRef(new Nodo(nodo, null));
					break;
				}
				auxAnterior = aux;
				aux = aux.getRef();
			}
		}
		
	}
	
	public NodoHuffman get(int index){
		int contador= 0;
		Nodo aux = primero;
		while(aux != null){
			if(index == contador){
				return aux.getInfo();
			}
			aux = aux.getRef();
			contador++;
		}
		return aux.getInfo();
	}
	
	public void mostrar(){
		Nodo aux = primero;
		while (aux!=null){
			char asdf = (char) aux.getInfo().getDato().intValue();
			System.out.println("dato: " + asdf +", ocurrencia: "+aux.getInfo().getOcurrencia());
			aux = aux.getRef();
		}
	}

	public NodoHuffman extraerPrimero() {
		NodoHuffman aux = primero.getInfo();
		primero = primero.getRef();
		return aux;
	}

}
