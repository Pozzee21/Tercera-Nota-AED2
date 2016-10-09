package estructura;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Codificador {

	private int contador=0;
	private byte byteNuevo=0;
	private String ruta;
	private RandomAccessFile codificado,original;

	public Codificador(RandomAccessFile original,String ruta){

		this.original=original;
		this.ruta= ruta;
		crearArchivo();

	}

	public void codificar( ITablaHuffman th){

		try{
			byte aux;
			while((aux=original.readByte())!=-1){

				String byteComprimido=th.buscar(aux);
				escribirBytes(byteComprimido);
			}

		}catch(Exception e){
			System.out.println(e);
		}
	}

	public void escribirCabecera(){
		try {
			//c21.
			codificado.write('c');
			codificado.write('2');
			codificado.write('1');
			//extensión archivo original.
			String extension=ruta.substring(ruta.length()-3);
			System.out.println(extension);
			for (int i =0;i<extension.length();i++){
				codificado.write(extension.charAt(i));
			}
			//tamaño del archivo original.
			codificado.write((int)original.length());
			
		} catch (IOException e) {
			System.err.println(e);
		}
		
	}
	public void crearArchivo(){
		try{
			String rutaNueva=ruta.substring(0, ruta.length()-4)+".c21";
			codificado= new RandomAccessFile(new File(rutaNueva), "rw");

		}catch(Exception e){
			System.err.println(e);
		}
	}

	public void escribirBytes(String byteComprimido){

		for (int i=0; i<byteComprimido.length();i++){

			if(byteComprimido.charAt(i)==1){

				switch(contador){
				case 0:
					byteNuevo=(byte) (byteNuevo & 0x80);
					break;
				case 1:
					byteNuevo=(byte) (byteNuevo & 0x40);
					break;
				case 2:
					byteNuevo=(byte) (byteNuevo & 0x20);
					break;
				case 3:
					byteNuevo=(byte) (byteNuevo & 0x10);
					break;
				case 4:
					byteNuevo=(byte) (byteNuevo & 0x8);
					break;
				case 5:
					byteNuevo=(byte) (byteNuevo & 0x4);
					break;
				case 6:
					byteNuevo=(byte) (byteNuevo & 0x2);
					break;
				case 7:
					byteNuevo=(byte) (byteNuevo & 0x1);
					break;
				}
			}
		}
		contador++;
		if (contador==8){
			try{

				codificado.write(byteNuevo);
				contador=0;
				byteNuevo=0;
			}catch(Exception e){
				System.err.println(e);
			}

		}


	}


}
