package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;
import java.lang.String;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteCorporativo extends Cliente {

    // TODO completar
    public String CORPORATIVO = "corporativo";
    public int GRANDE = 1;
    public int MEDIANA = 2;
    public int PEQUENA = 3;
    private java.lang.String nombreEmpresa;
    private int tamanoEmpresa;

    
public ClienteCorporativo (java.lang.String nombreEmpresa, int tamano) {
    	this.nombreEmpresa = nombreEmpresa;
    	this.tamanoEmpresa = tamano;
}
    
    
public java.lang.String getNombreEmpresa() {
	return nombreEmpresa;
}




public int getTamanoEmpresa() {
	return tamanoEmpresa;
}




	/**
     * Crea un nuevo objeto de tipo a partir de un objeto JSON.
     * 
     * El objeto JSON debe tener dos atributos: nombreEmpresa (una cadena) y tamanoEmpresa (un número).
     * @param cliente El objeto JSON que contiene la información
     * @return El nuevo objeto inicializado con la información
     */
    public static ClienteCorporativo cargarDesdeJSON( JSONObject cliente )
    {
        String nombreEmpresa = cliente.getString( "nombreEmpresa" );
        int tam = cliente.getInt( "tamanoEmpresa" );
        return new ClienteCorporativo( nombreEmpresa, tam );
    }

    /**
     * Salva este objeto de tipo ClienteCorporativo dentro de un objeto JSONObject para que ese objeto se almacene en un archivo
     * @return El objeto JSON con toda la información del cliente corporativo
     */
    public JSONObject salvarEnJSON( )
    {
        JSONObject jobject = new JSONObject( );
        jobject.put( "nombreEmpresa", this.nombreEmpresa );
        jobject.put( "tamanoEmpresa", this.tamanoEmpresa );
        jobject.put( "tipo", CORPORATIVO );
        return jobject;
    }
}

