package deneme;

import java.util.Scanner;

public class SonSoru {

	public static void main(String[] args) {

		// 1-Toplama
		// 2-Çıkarma
		// 3-Çarpma
		// 4-Bölme
		
		//2 tane sayi alcaz 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1-Toplama");
		System.out.println("2-Çıkarma");
		System.out.println("3-Çarpma");
		System.out.println("4-Bölme");
		System.out.println("Hangi işlemi yapmak istersiniz ?");
		
	    int cevap = scan.nextInt();
	    
	    System.out.println("İlk sayıyı giriniz.");
	    int ilkSayi = scan.nextInt();
	    
	    System.out.println("İkinci sayıyı giriniz.");
	    int ikinciSayi = scan.nextInt();
	    
	    if(cevap == 1) {
	    	int toplam = ilkSayi + ikinciSayi;
	    	System.out.println("Toplam : "+toplam);
	    }
	    else if(cevap == 2) {
	    	int cikarma= ilkSayi - ikinciSayi;
	    	System.out.println("İlk sayının ikinci sayıdan farkı : "+cikarma);
	    }
	    else if(cevap == 3) {
	    	int carpma= ilkSayi * ikinciSayi;
	    	System.out.println("Fark : "+carpma);
	    }
	    else if(cevap ==4) {
	    	float bolme = (float)ilkSayi/ikinciSayi;
	    	System.out.println("İlk sayının ikinci sayıya bölümü : "+bolme);
	    }
	    else {
	    	System.out.println("Yanlış rakam tuşladınız.");
	    }

	}


}
