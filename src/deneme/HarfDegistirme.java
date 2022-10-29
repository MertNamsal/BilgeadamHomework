package deneme;

import java.util.Scanner;

public class HarfDegistirme {

	public static void main(String[] args) {
		//kullanıcıdan bir kelime alın
		// eğer kelime a ile başlıyorsa kelimenin son indexini ekrana bastırın
		
		// eğer kelime b ile başlıyorsa ilk indexi "@" ile değiştirin
		
		//eğer a veya b ile başlamıyorsa kelimenin birinci indexini bastırın
		
		//replace("ilk index", "@")
		//charAt()
		//kelime.startsWith("a")
		//length()
		//********************************************
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime giriniz :");
		String kelime = scan.nextLine();
		
		if(kelime.startsWith("a")) {
			System.out.println(kelime.charAt(kelime.length()-1));
		}
		else if(kelime.startsWith("b")) {
			System.out.println(kelime.replaceFirst("b", "@"));
		}
		else {
			System.out.println(kelime.charAt(0));
		}

	}

}
