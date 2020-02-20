package edu.elsmancs.kata_olivanders;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Gilded_roseTest {

	@Test
	public void añadir_itemTest() {
		Gilded_rose tienda = new Gilded_rose();
		Normal_item normal = new Normal_item("Varita", 10, 20);
		tienda.inventario.add(normal);
		Object[] lista_items = tienda.get_inventario().toArray();;
		assertEquals(lista_items[0], normal);
	}
	
	/*Falta terminar caso test*/
	@Test
	public void update_qualityTest() {
		Gilded_rose tienda = new Gilded_rose();
		Normal_item normal = new Normal_item("Varita", 10, 20);
		tienda.inventario.add(normal);
		Backstage_pass pass = new Backstage_pass("Backstage passes to a TAFKAL80ETC concert", 15, 20);
		tienda.inventario.add(pass);
		Object[] lista_items = tienda.get_inventario().toArray();
		Object item = lista_items[0];
		
	}

}
