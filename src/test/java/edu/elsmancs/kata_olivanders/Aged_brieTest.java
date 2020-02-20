package edu.elsmancs.kata_olivanders;

import static org.junit.Assert.*;

import org.junit.Test;

public class Aged_brieTest {

	@Test
	public void crear_AgedBrie_test() {
		Aged_brie queso = new Aged_brie("Queso", 10, 20);
		assertEquals(queso.get_name(), "Queso");
		assertEquals(queso.get_sell_in(), 10, 0);
		assertEquals(queso.get_quality(), 20, 0);
	}
	
	@Test
	public void update_quality_test() {
		Aged_brie queso = new Aged_brie("Queso", 10, 20);
		queso.update_quality();
		assertEquals(queso.get_sell_in(), 9, 0);
		assertEquals(queso.get_quality(), 21, 0);
	}
	
	@Test
	public void update_quality_sellinZero_test() {
		Aged_brie queso = new Aged_brie("Queso", 0, 20);
		queso.update_quality();
		assertEquals(queso.get_sell_in(), -1, 0);
		assertEquals(queso.get_quality(), 22, 0);
	}
}
