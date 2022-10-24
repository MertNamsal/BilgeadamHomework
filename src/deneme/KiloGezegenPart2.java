package deneme;

import java.util.Scanner;

public class KiloGezegenPart2 {

	public static void main(String[] args) {
		//Bu sefer hem kilo hem gezegen girdisi alıyoruz girdiğimiz gezegen değerine göre ekrana yazdırıyor
		
		//1-ay
		//2-satürn
		//3-mars
		//4-venüs
		
		//input --> kg girin 75
		//intput --> gezegen adı ay
		//output --> aydaki kilonuz 85
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kilo giriniz : ");
		float kilo = scan.nextInt();
		
		System.out.println("Hangi gezegendeki kilonuzu öğrenmek istersiniz ?");
		System.out.println("1-Ay");
		System.out.println("2-Saturn");
		System.out.println("3-Mars");
		System.out.println("4-Venus");
		
		int cevap = scan.nextInt();
		
		if(cevap == 1) {
			float ayKilo = kilo *16.6f /100;
			System.out.println("Aydaki kilonuz : "+ayKilo);
		}
		else if(cevap == 2) {
			float saturnKilo = kilo *106.4f /100;
			System.out.println("Satürndeki kilonuz : "+saturnKilo);
		}
		else if(cevap == 3) {
			float marsKilo = kilo *37.7f /100;
			System.out.println("Marstaki kilonuz : "+marsKilo);
		}
		else if (cevap == 4) {
			float venüsKilo = kilo *90.7f /100;
			System.out.println("Venüsteki kilonuz : "+venüsKilo);
		}
		else {
			System.out.println("Yanlış değer girdiniz.");
		}

	}

}
