package edu.elsmancs.kata_olivanders;

final class Item {
	
	private final String name;
	private int sell_in = 0;
	private int quality = 0;
	
	/*aqui tenemos el constructor de item al que siempre llegaran todos los valores de name, sell_in y quality*/
	
	Item(String name, int sell_in, int quality){
		
		this.name = name;
		this.sell_in = sell_in;
		this.quality = quality;
	}
	
	
    @Override
    public String toString() {
        StringBuilder itemDescription = new StringBuilder();
        itemDescription.append("name=" + get_name());
        itemDescription.append(", sell_in=" + get_sell_in());
        itemDescription.append(", quality=" + get_quality());
        return itemDescription.toString();
    }
    
    /*ahora pasaremos a construir los getters y setters*/
	
	String get_name() {
		return this.name;
	}
	
	void set_sell_in() {
		this.sell_in = this.sell_in - 1;
	}
	
	int get_sell_in() {
		return this.sell_in;
	}
	
	void set_quality(int valor) {
		this.quality = valor;
	}
	
	int get_quality() {
		return this.quality;
	}
}
