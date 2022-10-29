package deneme;

import java.util.Scanner;

public class KelimePaneli {

	public static void main(String[] args) {
		// Swtich case ile 
		//input --> mehmet
		//input--> hangisi işlemi yapmak istiyosunuz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hangi kelimeyle işlem yapmak istersiniz ?");
		String kelime = scan.nextLine();
		boolean kontrol = true;
		int numara=1;
		while (numara !=0) {
			while(kontrol) {
				System.out.println("1-Kelimeleri büyük harf yapar.");
				System.out.println("2-Kelimeleri küçük harf yapar.");
				System.out.println("3-Kelimenin harflerinin arası ? koyar.");
				System.out.println("4-Kelimenin başındaki ve sonundaki boşlukları siler.");
				System.out.println("5-Kelimenin içindeki bütün a harflerini ? ile değiştirir.");
				System.out.println("6-Kelimenin ilk üç indexinin alıp sonuna ... koyar.");
				System.out.println("0-Çıkış yapar.");
				System.out.println("******************************************************");
				System.out.println("Hangi işlemi yapmak istersiniz?");
				numara = scan.nextInt();
				if(numara>=0 && numara<7) {
					kontrol=false;
				}
				else {
					System.out.println("Yanlış tuşlama yaptınız.\n");
				}
			}

			switch(numara) {
				case 1:
					kelime = kelime.toUpperCase();
					System.out.println(kelime);
					kontrol=true;
					break;
				case 2:
					kelime = kelime.toLowerCase();
					System.out.println(kelime);
					kontrol=true;
					break;
				case 3:
					for(int i=0;i<kelime.length();i++) {
						System.out.print(kelime.charAt(i));  
						if(i<kelime.length()-1) {
							System.out.print("?");
						}	
					}
					System.out.println();
					kontrol=true;
					break;
				case 4:
					System.out.println(kelime.trim());
					kontrol=true;
					break;
				case 5:
					System.out.println(kelime.replace('a', '?'));
					kontrol=true;
					break;	
				case 6:
					System.out.println(kelime.substring(0,3)+"...");
					kontrol=true;
					break;
				default:
					break;	
			}

		}
		
	}

}
