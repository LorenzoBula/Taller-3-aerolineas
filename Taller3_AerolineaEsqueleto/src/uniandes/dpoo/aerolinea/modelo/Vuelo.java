package uniandes.dpoo.aerolinea.modelo;


import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;

public class Vuelo {

	private String fecha;
	private Avion avion;
	private Ruta ruta;
	private Map<String, Tiquete> tiquetes;
	
	
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		this.ruta = ruta;
		this.fecha = fecha;
		this.avion = avion;
		this.tiquetes = new HashMap<String, tiquete>();
	}
	
	public Ruta getRuta() {
		return ruta;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public Avion getAvion() {
		return avion;
	}
	
	public ArrayList<Tiquete> getTiquetes(){
		ArrayList<Tiquete> listTiquetes = new ArrayList<Tiquete>();
		for(String element : this.tiquetes.keySet()) {
			listTiquetes.addLast(this.tiquetes.get(element));
		}
		return listTiquetes;
	}
	
	
}
