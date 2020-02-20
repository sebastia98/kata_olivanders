package edu.elsmancs.kata_olivanders;

public class Backstage_pass extends Normal_item {
	
	public Backstage_pass(String name, int sell_in, int quality) {
		super(name, sell_in, quality);
	}
	
	void update_quality() {
		
		if (get_sell_in() >= 10) {
			compute_quality(1);
		}
		else if (get_sell_in() > 5) {
			compute_quality(2);
		}
		else if (get_sell_in() > 0){
			compute_quality(3);
		}
		else {
			compute_quality(- get_quality());
		}
		set_sell_in();
		
	}

}
