package uniandes.dpoo.aerolinea.modelo.cliente;

import java.lang.String; 

public class ClienteNatural extends Cliente{

public String NATURAL = "Natural";
private java.lang.String nombre;
	
	
public ClienteNatural(java.lang.String nombre) {
	super();
	this.nombre = nombre;
}

public String getTipoCliente() {
	return NATURAL;
}

public String getIdentificador() {
	return nombre;
}
}
