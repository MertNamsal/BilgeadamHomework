package com.tv;

import java.util.Scanner;

public class Main {
	static Televizyon televizyon= new Televizyon();
	static Scanner scan = new Scanner(System.in);
	static boolean check = true;
	public static void main(String[] args) {

		 menuGoster();

	}

	public static void menuGoster() {
		
		System.out.println("***MENU****");
		System.out.println("0- Çıkış \n" + "1-- Televizyon Kur\n" + "2-- Televizyonu Aç\n" + "3-- Sesini Artır\n"
				+ "4-- Sesi Azalt\n" + "5-- Kanal Değiştir\n" + "6-- Kanal Bilgisi Goster\n" + "7-- Televizyonu Kapat\n"
				+ "8-- Menüyü Goster\n");
		while (check) {
			System.out.println("Yapmak istediğiniz işlemi tuşlayınız.(Menü için 8'i tuşla)");
			int secim = scan.nextInt();
			switch(secim) {
			case 0:
				System.out.println("Çıkış yapılıyor.");
				check =false;
				break;
			case 1:
				televizyon.tvKur();
				break;
			case 2:
				televizyon.tvAc();
				break;
			case 3:
				televizyon.sesAc();
				break;
			case 4:
				televizyon.sesAzalt();
				break;
			case 5:
				televizyon.kanalDegister();
				break;
			case 6:
				televizyon.aktifKanaliGoster();
				break;
			case 7:
				televizyon.tvKapat();
				break;
			case 8:
				menuGoster();
				break;
			default:
				System.err.println("Yanlış tuşlama yaptınız.");
			}
		}
	}

}
