package uniandes.dpoo.hamburguesas.mundo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoAjustadoTest {

	private ProductoMenu hamburguesa;
	private Ingrediente queso;
	private Ingrediente cebolla;
	
	@BeforeEach
	
	void setUp() {
		
	queso = new Ingrediente("Queso", 2500);
	hamburguesa = new ProductoMenu("Hamburguesa Sencilla", 17000);
	cebolla = new Ingrediente("Cebolla", 1000);
	}
	@Test
	void testProductoAjustado() {
		
	ProductoAjustado producto = new ProductoAjustado(hamburguesa);
	assertEquals(hamburguesa, producto.getProductoBase());
	assertTrue(producto.agregados.isEmpty());
	assertTrue(producto.eliminados.isEmpty());
	
	}

	@Test
	void testGetNombre() {
		
	ProductoAjustado productoA = new ProductoAjustado(hamburguesa);
	assertEquals("Hamburguesa Sencilla", productoA.getNombre());
	}

	@Test
	void testGetPrecio() {
		
	ProductoAjustado productoA = new ProductoAjustado(hamburguesa);
	assertEquals(17000, productoA.getPrecio());
	}
	
	@Test
	void testGetPrecioAgregados() {
		
	ProductoAjustado productoA = new ProductoAjustado(hamburguesa);
	productoA.agregados.add(cebolla);
	productoA.agregados.add(queso);
	assertEquals(20500, productoA.getPrecio());
	}

	@Test
	void testGenerarTextoFactura() {
		
	ProductoAjustado productoA = new ProductoAjustado(hamburguesa);
	productoA.agregados.add(cebolla);
	productoA.eliminados.add(queso);
	
	String texto = "Hamburguesa Sencilla\n" +
            "    +Cebolla                1000\n" + 
            "    -Queso            2500\n" +
            "            18000\n";
	assertEquals(texto, productoA.generarTextoFactura());
	
	}

}
