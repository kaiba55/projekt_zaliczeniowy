package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import projekt_zaliczeniowy.Ksiazka;

public class Test3 {

	@Test
	public void test() 
	{
		Ksiazka test=new Ksiazka("Pan Tadeusz","Adam Mickiewicz","1988","Znak","dramat",1);
		assertEquals("Adam Mickiewicz", test.get_autorzy());
	}

}
