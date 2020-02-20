package edu.elsmancs.kata_olivanders;


import static org.junit.Assert.*;

import org.junit.Test;
import edu.elsmancs.kata_olivanders.Normal_item;

public class Normal_itemTest {

	@Test
	public void Crear_Normal_item() {
		Normal_item normal = new Normal_item("Varita", 20, 10);
		
		assertEquals(normal.get_name(), "Varita");
		assertEquals(normal.get_sell_in(), 20, 0);
		assertEquals(normal.get_quality(), 10, 0);
	}
	
	@Test
	public void update_quality() {
		Normal_item normal = new Normal_item("Varita", 10, 20);
		normal.update_quality();
		assertEquals(normal.get_name(), "Varita");
		assertEquals(9, normal.get_sell_in(), 0);
		assertEquals(19, normal.get_quality(), 0);
	}
	@Test
	public void update_quality_sellin_cero() {
		Normal_item normal = new Normal_item("Varita", 0, 20);
		normal.update_quality();
		assertEquals(-1, normal.get_sell_in(), 0);
		assertEquals(18, normal.get_quality(), 0);
	}
	@Test
    public void qualityMinZERO() {

        Normal_item normal = new Normal_item("+5 Dexterity Vest", 10, 0);
        normal.update_quality();
        assertEquals(9, normal.get_sell_in(), 0);
        assertEquals(0, normal.get_quality(), 0);
    }
}
