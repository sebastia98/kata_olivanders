package edu.elsmancs.kata_olivanders;

import java.util.ArrayList;

public class Gilded_rose {
	
	ArrayList<Normal_item> inventario = new ArrayList<Normal_item>();
	
	public ArrayList<Normal_item> get_inventario() {
		return this.inventario;
	}
	
	public void añadir_item(Normal_item item) {
		this.inventario.add(item);
	}
	
}
