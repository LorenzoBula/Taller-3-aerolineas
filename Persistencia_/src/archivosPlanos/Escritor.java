package archivosPlanos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import mundo.Cancion;
import mundo.Discotienda;

public class Escritor {



	public Escritor() {

	}

	public void escribirCanciones(ArrayList<Cancion> canciones) {

		try {
			PrintWriter escritor = new PrintWriter(new File("./data/canciones.txt"));
			for (Cancion cancion : canciones) {
				escritor.println(cancion.getArtista()+"--"+cancion.getNombre()+"--"+cancion.getDuracion_minutos()+":"+cancion.getDuracion_segundos());
			}
			escritor.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void escribirArchivoBasico() {
		try {

			File carpeta = new File("./data/");
			if(!carpeta.exists()) {
				carpeta.mkdirs();
			}

			PrintWriter pw = new PrintWriter(new File("./data/ejemplo.txt"));
			pw.println("Cualquier cosa");
			pw.println("Ya se entregó 30%");
			pw.println("EL otro viernes hay retiros");
			pw.println("Hasta las 6:00 p.m.");
			pw.close();

		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		Escritor e = new Escritor();
		//e.escribirArchivoBasico();
		Discotienda disco = new Discotienda();
		e.escribirCanciones(disco.getCanciones());
	}

}


















