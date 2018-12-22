package org.ifunpas.kpl.kuis.kpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ATest {

	@Test
	public void test1() {
		A a = new A();
		int hasil = a.perkalian(0, 5);
		assertEquals(0, hasil);
	}
	
	@Test
	public void test2() {
		A a = new A();
		int hasil = a.perkalian(1, 2);
		assertEquals(2, hasil);
	}
}
