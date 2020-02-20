package edu.elsmancs.kata_olivanders;

public class Conjured extends Normal_item {
	
	public Conjured(String name, int sell_in, int quality) {
		super(name, sell_in, quality);
	}
	
	void update_quality() {
		if (get_sell_in() > 0) {
			compute_quality(-2);
		}
		else {
			compute_quality(-4);
		}
		set_sell_in();
	}
}
