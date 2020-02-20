package edu.elsmancs.kata_olivanders;

import static org.junit.Assert.*;

import org.junit.Test;

public class Backstage_passTest {

	@Test
    public void crearBackstage() {

        Backstage_pass pass = new Backstage_pass("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", pass.get_name());
        assertEquals(15, pass.get_sell_in(), 0);
        assertEquals(20, pass.get_quality(), 0);
    }
	@Test
    public void toStringTest() {
        Backstage_pass pass= new Backstage_pass("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        System.out.println("toString() Backstage test");
        System.out.println(pass.toString());
    }
	 @Test
	 public void updateQualityOverTEN() {
        Backstage_pass pass = new Backstage_pass("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        pass.update_quality();
        assertEquals(14, pass.get_sell_in(), 0);
        assertEquals(21, pass.get_quality(), 0);
 	}
	 @Test
    public void updateQualityOverFIVE() {
        Backstage_pass pass = new Backstage_pass("Backstage passes to a TAFKAL80ETC concert", 6, 20);
        pass.update_quality();
        assertEquals(5, pass.get_sell_in(), 0);
        assertEquals(22, pass.get_quality(), 0);    
	    }
	 @Test
	    public void updateQualityOverZERO() {

	        Backstage_pass pass = new Backstage_pass("Backstage passes to a TAFKAL80ETC concert", 5, 20);
	        pass.update_quality();
	        assertEquals(4, pass.get_sell_in(), 0);
	        assertEquals(23, pass.get_quality(), 0);
	    }
	 @Test
	    public void updateQualityPassExpired() {

	        Backstage_pass pass = new Backstage_pass("Backstage passes to a TAFKAL80ETC concert", 0, 20);
	        pass.update_quality();
	        assertEquals(-1, pass.get_sell_in(), 0);
	        assertEquals(0, pass.get_quality(), 0);
	    }
	 @Test
	    public void qualityMax50() {

	        Backstage_pass pass = new Backstage_pass("Backstage passes to a TAFKAL80ETC concert", 5, 49);
	        pass.update_quality();
	        assertEquals(4, pass.get_sell_in(), 0);
	        assertEquals(50, pass.get_quality(), 0);

	        pass = new Backstage_pass("Backstage passes to a TAFKAL80ETC concert", 9, 49);
	        pass.update_quality();
	        assertEquals(8, pass.get_sell_in(), 0);
	        assertEquals(50, pass.get_quality(), 0);
	    }
}
