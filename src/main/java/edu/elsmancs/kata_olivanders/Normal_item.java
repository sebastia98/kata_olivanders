package edu.elsmancs.kata_olivanders;

class Normal_item {
	
	/*aqui decimos que item de Normal_item es un objeto final de la clase Item*/
	private final Item item;
	/*Creamos el constructor de Normal_item y en él instanciamos la clase Item en el objeto item*/
	public Normal_item(String name, int sell_in, int quality){
		this.item = new Item(name, sell_in, quality);
	}
	@Override
	public String toString() {
		return item.toString();
	}
	
	public String get_name() {
		return item.get_name();
	}
	
	public void set_sell_in() {
		item.set_sell_in();
	}
	
	public int get_sell_in() {
		return item.get_sell_in();
	}
	
	public int get_quality() {
		return item.get_quality();
	}
	
	/*Este es método exclusivo de Normal_item, por eso no es público*/
	void compute_quality(int valor) {
		if (valor == 0) {
			item.set_quality(0);
		}
		if (get_quality() + valor > 50) {
			item.set_quality(50);
		}
		else if (get_quality() + valor > 0) {
			item.set_quality(item.get_quality() + valor);
		}
		else {
			item.set_quality(0);
		}
	}
	
	void update_quality() {
		if (get_sell_in() > 0) {
			compute_quality(-1);
		}
		else {
			compute_quality(-2);
		}
		set_sell_in();
	}
}

