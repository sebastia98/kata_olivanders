package edu.elsmancs.kata_olivanders;

import static org.junit.Assert.*;

import org.junit.Test;

public class SulfurasTest {

	@Test
	public void crear_sulfuras_test() {
		Sulfuras legend = new Sulfuras("Legendario", 10, 20);
		assertEquals(legend.get_name(), "Legendario");
		assertEquals(legend.get_sell_in(), 10, 0);
		assertEquals(legend.get_quality(), 20, 0);
	}
	
	@Test
	public void update_quality_test() {
		Sulfuras legend = new Sulfuras("Legendario", 10, 20);
		legend.update_quality();
		assertEquals(legend.get_name(), "Legendario");
		assertEquals(legend.get_sell_in(), 10, 0);
		assertEquals(legend.get_quality(), 20, 0);
	}
}