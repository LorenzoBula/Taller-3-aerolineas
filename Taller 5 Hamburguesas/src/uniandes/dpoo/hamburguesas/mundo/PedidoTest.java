package uniandes.dpoo.hamburguesas.mundo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.ArrayList;


class PedidoTest {
	private Pedido pedido;
	private ProductoMenu hamburguesa;
	private ProductoMenu papas;
	private Combo comboPersonal;
	
	@BeforeEach
	void setUp() {
		hamburguesa = new ProductoMenu("Hamburguesa Sencilla", 17000);
		papas = new ProductoMenu("Papas Fritas Medianas", 8000);
		pedido.numeroPedidos = 0;
		ArrayList<ProductoMenu> comboItems = new ArrayList<>();
		comboItems.add(papas);
		comboItems.add(hamburguesa);
		comboPersonal = new Combo("Combo Combo Personal", 0.9, comboItems);
		pedido = new Pedido("Rafael Amaya", "Calle 180 #68-35");
		
	}

	@Test
	void testPedido() {
	
	assertEquals("Rafael Amaya", pedido.getNombreCliente());
	assertEquals(0, pedido.getIdPedido());
	assertTrue(pedido.getProductos().isEmpty());
	
	}

	@Test
	void testGetIdPedido() {
	
	Pedido pedido2 = new Pedido("Maria Antonia", "Carrera 21 #128d-50");
	assertEquals(1, pedido2.getIdPedido());
	}

	@Test
	void testGetNombreCliente() {
	
	Pedido pedido2 = new Pedido("Maria Antonia", "Carrera 21 #128d-50");
	assertEquals("Rafael Amaya", pedido.getNombreCliente());
	assertEquals("Maria Antonia", pedido2.getNombreCliente());
	}

	@Test
	void testAgregarProducto() {
	
	pedido.agregarProducto(papas);
	pedido.agregarProducto(hamburguesa);
	pedido.agregarProducto(comboPersonal);
	assertEquals(3, pedido.getProductos().size());
	
	}

	@Test
	void testGetPrecioTotalPedido() {
	
	pedido.agregarProducto(hamburguesa);
	pedido.agregarProducto(papas);
	assertEquals(29750, pedido.getPrecioTotalPedido());
	}

	@Test
	void testGenerarTextoFactura() {
	
	pedido.agregarProducto(new ProductoMenu("Hamburguesa Sencilla", 17000));
	pedido.agregarProducto(new ProductoMenu("Papas Fritas Medianas", 8000));
	String texto = """
			Cliente: Rafael Amaya
			Dirección: Calle 180 #68-35
			----------------
			Hamburguesa Sencilla
			            17000
			Papas Fritas Medianas
			            8000
			----------------
			Precio Neto:  25000
			IVA:          4750
			Precio Total: 29750
			""".replace("\r", "");
	
	assertEquals(texto, pedido.generarTextoFactura());
	}

	@Test
	void testGuardarFactura() throws Exception {
	
	pedido.agregarProducto(hamburguesa);
	File tempFile = File.createTempFile("Factura", ".txt");
	pedido.guardarFactura(tempFile);
	assertTrue(tempFile.length() > 0);
	tempFile.delete();
	
	}

}
