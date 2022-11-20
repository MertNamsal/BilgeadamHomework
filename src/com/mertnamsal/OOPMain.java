package com.mertnamsal;

public class OOPMain {
	public static void main(String[] args) {
		
		Tenis t1 = new Tenis("Federer","Djokovic","Toprak");
		t1.skorDurumu();
		t1.servisAt();
		t1.skorDurumu();
		t1.dalgaGec();
		System.out.println("\n-----------------------------\n");
		
		Futbol f1 = new Futbol("BursaSpor","Göztepe","agresif");
		f1.golAt();
		f1.skorDurumu();
		f1.ayaginaKay();
		System.out.println("\n-----------------------------\n");
		
		Basketbol b1 = new Basketbol("Karşıyaka","Efes","zincirli");
		b1.basketAt();
		b1.skorDurumu();
		b1.faulYap();
		b1.takimDegistir("Beşiktaş");
		b1.topuPatlat();
	}
}
