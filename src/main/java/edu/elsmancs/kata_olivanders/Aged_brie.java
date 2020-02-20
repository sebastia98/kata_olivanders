package edu.elsmancs.kata_olivanders;

public class Aged_brie extends Normal_item{

	public Aged_brie(String name, int sell_in, int quality) {
		super(name, sell_in, quality);
		
	}
	@Override
	public void update_quality() {
		if (get_sell_in() > 0) {
			compute_quality(1);
		}
		else {
			compute_quality(2);
		}
		set_sell_in();
	}

}
