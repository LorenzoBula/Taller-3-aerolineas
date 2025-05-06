package archivosPlanos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import mundo.Cancion;

public class Lector {

	public Lector() {
		
	}
	
	public ArrayList<Cancion> leerCanciones(){
		ArrayList<Cancion> rta = new ArrayList<Cancion>();
		try {
			BufferedReader lector = new BufferedReader(new FileReader(new File("./data/cancionesGuardadas.txt")));
			
			String linea = lector.readLine();
			while(linea!=null) {
				System.out.println(linea);
				
				// A-B-C -> SPLIT("") = [A] [B] [C]
				// Soñé-Zoe-3:10 ["Soñé"] ["Zoe"] ["3:10"]
				String[] datos = linea.split("-");
				String[] datosDuracion = datos[2].split(":");
				String artista = datos[1];
				String cancion = datos[0];
				int duracionMins = Integer.parseInt(datosDuracion[0]);
				int duracionSegs = Integer.parseInt(datosDuracion[1]);
				Cancion c = new Cancion(duracionMins, duracionSegs, cancion, artista);
				rta.add(c);
				linea = lector.readLine();
			}
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return rta;
	}

	public void imprimrCanciones(ArrayList<Cancion> canciones) {
		for (Cancion cancion : canciones) {
			System.out.println(cancion.getDuracion_minutos()+":"+cancion.getDuracion_segundos()+"/"+cancion.getNombre());
		}
	}
	
	public static void main(String[] args) {
		Lector l = new Lector();
		l.imprimrCanciones(l.leerCanciones());
	}
}
