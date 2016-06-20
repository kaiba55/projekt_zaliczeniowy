package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import projekt_zaliczeniowy.Ksiazka;

public class Test1 
{

	@Test
	public void test() 
		{
		/*Ksiazka test=new Ksiazka();
		assertEquals(10, test.dodaj(5, 5));*/
			Ksiazka test=new Ksiazka("Pan Tadeusz","Adam Mickiewicz","1988","Znak","dramat",1);
			assertEquals(1, test.get_ilosc());
		}

	}


