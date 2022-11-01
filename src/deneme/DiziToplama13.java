package deneme;

public class DiziToplama13 {

	public static void main(String[] args) {
		// bir dizide 13 var ise 13 ve bir sonraki eleman
		// toplama eklenmeden toplam sonucu bulan kod
		int toplam = 0;
		int nums[] = { 1, 5, 1, 13, 2, 5, 1, 13 };

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				if (i != nums.length - 1) {
					i++;
				}
			} else {
				toplam += nums[i];
			}
		}
		System.out.println("Toplam : " + toplam);

	}

}
