package deneme;

import java.util.Scanner;

public class KiloGezegenPart1 {

	public static void main(String[] args) {
		// Girilen kilo değerini diğer gezegenlerde kaç kilo olduğunu bulan program(en az 5 gezegen)
		//1-Kilo değerini girdiğimizde bütün gezegenlerdeki değeri hesaplayıp yazdıran
		
		//örnek input --> kilo 70
		//      output --> ayda 80 ,marsta 95 ,saturnde 88kg ...
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen kilonuzu giriniz : ");
		float kilo = scan.nextFloat();
		
		float merkürKilo = kilo *37.8f /100;
		System.out.println("Merkürdeki kilonuz : "+merkürKilo);
		
		float venüsKilo = kilo *90.7f /100;
		System.out.println("Venüsteki kilonuz : "+venüsKilo);
		
		float marsKilo = kilo *37.7f /100;
		System.out.println("Marstaki kilonuz : "+marsKilo);
		
		float jupiterKilo = kilo *236.4f /100;
		System.out.println("Jüpiterdeki kilonuz : "+jupiterKilo);
		
		float saturnKilo = kilo *106.4f /100;
		System.out.println("Satürndeki kilonuz : "+saturnKilo);

	}

}
