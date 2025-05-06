package serializacion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import mundo.Cancion;
import mundo.Discotienda;

public class Serializador {

	public Serializador() {
		
	}

	public void escribirArchivo(ArrayList<Cancion> canciones) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("./data/cancionesSerializadas.dat")));
			out.writeObject(canciones);
			out.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Serializador s = new Serializador();
		Discotienda disco = new Discotienda();
		s.escribirArchivo(disco.getCanciones());
				
	}
	
}













