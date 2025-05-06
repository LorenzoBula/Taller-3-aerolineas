package uniandes.dpoo.hamburguesas.mundo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import uniandes.dpoo.hamburguesas.mundo.*;
import org.junit.jupiter.api.Test;
import uniandes.dpoo.hamburguesas.excepciones.*;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;

class RestauranteTest {

	private Restaurante restaurante;
	private File archivoIngredientes;
	private File archivoMenu;
	private File archivoCombos;
	
	@BeforeEach
	void setUp() throws Exception{
		restaurante = new Restaurante();
		archivoIngredientes = File.createTempFile("ingredientes", ".txt");
		archivoMenu = File.createTempFile("menu", ".txt");
		archivoCombos = File.createTempFile("combos", ".txt");
		
		String contenidoIngredientes = ""
	}
	@Test
	void testRestaurante() {
		fail("Not yet implemented");
	}

	@Test
	void testIniciarPedido() {
		fail("Not yet implemented");
	}

	@Test
	void testCerrarYGuardarPedido() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPedidoEnCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPedidos() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMenuBase() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMenuCombos() {
		fail("Not yet implemented");
	}

	@Test
	void testGetIngredientes() {
		fail("Not yet implemented");
	}

	@Test
	void testCargarInformacionRestaurante() {
		fail("Not yet implemented");
	}

}
