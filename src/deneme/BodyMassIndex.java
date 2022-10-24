package deneme;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		//Girilen değerlere göre BMI hesaplanmalı
		//Boy(cm)
		//Ağırlık(kg)
		//Cinsiyet(erkek veya kadın)
		
		//Output= hesaplanan BMI
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Erkek iseniz 1'e kadın iseniz 2'ye basınız.");
		int cinsiyet = scan.nextInt();
		
		System.out.println("Boyunuz kaç cm ?");
		int boy = scan.nextInt();
		
		System.out.println("Kaç kilosunuz ?");
		int kilo = scan.nextInt();
		
		
		float index = (float)kilo * 10000 /(boy*boy);
		
		if(cinsiyet == 1) {
			if(index >30) {
				System.out.println("Body mass index : "+index+ " Obezsiniz.");
			}
			else if(index>25) {
				System.out.println("Body mass index : "+index+ " Şişmansınız.");
			}
			else if(index>19) {
				System.out.println("Body mass index : "+index+ " Normalsiniz.");
			}
			else {
				System.out.println("Body mass index : "+index+ " Zayıfsınız.");
			}
			
		}
		else  {
			if(index >30) {
				System.out.println("Body mass index : "+index+ " Obezsiniz.");
			}
			else if(index>24) {
				System.out.println("Body mass index : "+index+ " Şişmansınız.");
			}
			else if(index>18) {
				System.out.println("Body mass index : "+index+ " Normalsiniz.");
			}
			else {
				System.out.println("Body mass index : "+index+ " Zayıfsınız.");
			}
		}
		
		
		

	}

}
