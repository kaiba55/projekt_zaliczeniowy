package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import projekt_zaliczeniowy.Ksiazka;

public class DodajTest {

	@Test
	public void test() {
		Ksiazka test=new Ksiazka();
		assertEquals(10, test.dodaj(5, 5));
	}

}
