package propiedades;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import mundo.Cancion;

public class Propiedades {

	public Propiedades() {
		try {
			cargarCanciones();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void cargarCanciones() throws IOException{
		

//		
		Properties p = new Properties();
		File archivoACargar = new File("./data/canciones.properties");
		FileInputStream fis = new FileInputStream(archivoACargar);
		p.load(fis);
		fis.close();
		String cancion = p.getProperty("Cancion4");
		
		String [] datosCancion = cancion.split("-");
		
		int minutos = Integer.parseInt(datosCancion[2]);
		int segundos = Integer.parseInt(datosCancion[3]);
		
		Cancion c = new Cancion( minutos, segundos, datosCancion[0], datosCancion[1]);
		System.out.println(c.getNombre()+" - "+c.getArtista());

		
		
	}
	
	
	public static void main(String[] args) {
		new Propiedades();

	}

}











