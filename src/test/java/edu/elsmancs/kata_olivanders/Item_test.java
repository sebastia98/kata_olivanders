package edu.elsmancs.kata_olivanders;

import static org.junit.Assert.*;
import edu.elsmancs.kata_olivanders.Item;

import org.junit.Test;

public class Item_test {

	@Test
	public void crear_item() {
		Item item = new Item("Varita", 20, 10);
		
		assertEquals("Varita", item.get_name());
		assertEquals(20, item.get_sell_in());
		assertEquals(10, item.get_quality());
	}

}
