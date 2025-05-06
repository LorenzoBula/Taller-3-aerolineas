package serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import mundo.Cancion;
import mundo.Discotienda;

public class Deserializador {


	public Deserializador() {

	}

	public ArrayList<Cancion> leerArchivo() {
		ArrayList<Cancion> canciones = null;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("./data/cancionesSerializadas.dat")));
			canciones = (ArrayList<Cancion>) ois.readObject();
			ois.close();
		}
			
		catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return canciones;
	}
	
	public void imprimrCanciones(ArrayList<Cancion> canciones) {
		for (Cancion cancion : canciones) {
			System.out.println(cancion.getDuracion_minutos()+":"+cancion.getDuracion_segundos()+"/"+cancion.getNombre());
		}
	}

	public static void main(String[] args) {
		Deserializador d = new Deserializador();
		ArrayList<Cancion> canciones = d.leerArchivo();
		d.imprimrCanciones(canciones);
		
	}


}







