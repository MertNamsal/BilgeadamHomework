package deneme;

import java.util.Iterator;
import java.util.Scanner;

public class RastgeleSayiOyunu {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int rastgeleSayi = (int)(Math.random()*101);
		
		System.out.println("Tahmininiz nedir ?");
		int tahmin = scan.nextInt();
		int sayac =1;
		
		while(rastgeleSayi!=tahmin) {
			
			if(rastgeleSayi>tahmin) {
				System.out.println("Arttır");
				sayac++;
			} else if(rastgeleSayi<tahmin){
				System.out.println("Azalt");
				sayac++;
			}
			System.out.println("Tahmininiz nedir ?");
			tahmin = scan.nextInt();
			
			if(rastgeleSayi==tahmin) {
				System.out.println("Tebrikler bildiniz");
			}
		}
		
		

	}

}
