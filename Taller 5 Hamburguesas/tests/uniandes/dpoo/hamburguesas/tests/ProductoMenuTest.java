package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;
import uniandes.dpoo.hamburguesas.mundo.Producto;

class ProductoMenuTest {

	@Test
	void testProductoMenu() {
		
		ProductoMenu producto = new ProductoMenu("papas fritas medianas", 8000);
		assertEquals("papas fritas medianas", producto.getNombre());
		assertEquals(8000, producto.getPrecio());
	}

	@Test
	void testGetNombre() {
		
		ProductoMenu producto = new ProductoMenu("hamburguesa sencilla", 17000);
		assertEquals("hamburguesa sencilla", producto.getNombre());
	}

	@Test
	void testGetPrecio() {
		
		ProductoMenu producto = new ProductoMenu("gaseosa mediana", 5500);
		assertEquals(5500, producto.getPrecio());
	}

	@Test
	void testGenerarTextoFactura() {
		
		ProductoMenu producto = new ProductoMenu("hamburguesa doble queso", 21000);
		String textoFinal = "hamburguesa doble queso\n            21000\n";
		assertEquals(textoFinal, producto.generarTextoFactura());
	}
}
