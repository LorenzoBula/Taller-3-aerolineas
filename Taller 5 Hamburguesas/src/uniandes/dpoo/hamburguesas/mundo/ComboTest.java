package uniandes.dpoo.hamburguesas.mundo;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;



class ComboTest {
	private ProductoMenu papas;
	private ProductoMenu hamburguesa;
	private ProductoMenu gaseosa;
	private Combo combo;
	private ArrayList<ProductoMenu> comboItems;
    
	
	@BeforeEach
	void setUp() {
		hamburguesa = new ProductoMenu("Hamburguesa Sencilla", 17000);
		gaseosa = new ProductoMenu("gaseosa mediana", 5500);
		papas = new ProductoMenu("papas fritas medianas", 8000);
		comboItems = new ArrayList<>();
		comboItems.add(gaseosa);
		comboItems.add(hamburguesa);
		comboItems.add(papas);
		combo = new Combo("Combo Personal", 0.9, comboItems);
	}
	
	
	@Test
	void testCombo() {
	
	assertEquals("Combo Personal", combo.getNombre());
	assertEquals(3, combo.comboItems.size());
	assertEquals(0.9, combo.descuento);
	}

	@Test
	void testGetNombre() {
	
	assertEquals("Combo Personal", combo.getNombre());
	}

	@Test
	void testGetPrecio() {
		
	assertEquals(27450, combo.getPrecio());
	}

	@Test
	void testGenerarTextoFactura() {
	
	String texto = "Combo Combo Personal\n" + 
					" Descuento: 0.9\n" +
					"            27450\n";
	assertEquals(texto, combo.generarTextoFactura());
	}

}
