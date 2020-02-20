package edu.elsmancs.kata_olivanders;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConjuredTest {

	@Test
	public void crear_conjured_test() {
		Conjured patronum = new Conjured("Patronum", 10, 20);
		assertEquals(patronum.get_name(), "Patronum");
		assertEquals(patronum.get_sell_in(), 10, 0);
		assertEquals(patronum.get_quality(), 20, 0);
	}
	
	@Test
	public void update_quality_test() {
		Conjured patronum = new Conjured("Patronum", 10, 20);
		patronum.update_quality();
		assertEquals(patronum.get_name(), "Patronum");
		assertEquals(patronum.get_sell_in(), 9, 0);
		assertEquals(patronum.get_quality(), 18, 0);
	}
	
	@Test
	public void update_quality_sellinZero_test() {
		Conjured patronum = new Conjured("Patronum", 0, 20);
		patronum.update_quality();
		assertEquals(patronum.get_name(), "Patronum");
		assertEquals(patronum.get_sell_in(), -1, 0);
		assertEquals(patronum.get_quality(), 16, 0);
	}
}
