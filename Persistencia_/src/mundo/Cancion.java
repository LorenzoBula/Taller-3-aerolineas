package mundo;

import java.io.Serializable;

public class Cancion implements Serializable {

	private int duracion_minutos;
	private int duracion_segundos;
	private String nombre;
	private String artista;
	
	public Cancion(int duracion_minutos, int duracion_segundos, String nombre, String artista) {
		this.duracion_minutos = duracion_minutos;
		this.duracion_segundos = duracion_segundos;
		this.nombre = nombre;
		this.artista = artista;
	}
	
	public int getDuracion_minutos() {
		return duracion_minutos;
	}
	public void setDuracion_minutos(int duracion_minutos) {
		this.duracion_minutos = duracion_minutos;
	}
	public int getDuracion_segundos() {
		return duracion_segundos;
	}
	public void setDuracion_segundos(int duracion_segundos) {
		this.duracion_segundos = duracion_segundos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	
	
	
	
}
