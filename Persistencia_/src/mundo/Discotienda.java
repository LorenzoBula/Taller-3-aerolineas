package mundo;

import java.util.ArrayList;

public class Discotienda {

	private ArrayList<Cancion> canciones;
	
	public Discotienda () {
		canciones = new ArrayList<Cancion>();
		crearCanciones();
	}
	
	public void crearCanciones() {
		Cancion uno = new Cancion(3,40,"A blanco y negro", "Silvestre Dangond"); 
		Cancion dos = new Cancion(3,20,"Loco", "Zoe");
		Cancion tres = new Cancion (3, 10,"Amber", "Dei v");
		Cancion cuatro = new Cancion (4, 10, "Dummy", "Portugal the man");
		canciones.add(uno);
		canciones.add(dos);
		canciones.add(tres);
		canciones.add(cuatro);
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}
	
	
	
}
