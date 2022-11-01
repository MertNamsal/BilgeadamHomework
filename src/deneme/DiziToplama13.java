package deneme;

public class DiziToplama13 {

	public static void main(String[] args) {
		// bir dizide 13 var ise 13 ve bir sonraki eleman
		// toplama eklenmeden toplam sonucu bulan kod
		int toplam = 0;
		int nums[] = { 13,1,1,13, 1, 1, 13, 1, 1, 13, 13,1,1,13,1,1,1,13,13,1,13,1,1,13 };

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				if (i != nums.length - 1) {
					i++;
					if(nums[i]==nums[i-1]) {
						i--;
					}
				}
			} else {
				toplam += nums[i];
			}
		}
		System.out.println("Toplam : " + toplam);
		
		//2.çözüm
		/*int nums[] = {13,13,1, 13, 13, 13, 2, 5, 13, 1,13,2,2,2,2,13,13,2,2,13,2};
        int toplam=0;

          for (int i = 0; i < nums.length-1; i++) {
               if (nums[i] != 13 ) {
                   toplam+=nums[i];
                   

               }
               else if(nums[i]==13) {
            	   
            	   if(nums[i]==nums[i+1]) {
            		   i--;
            	   }
            	   i++;
               }
  
           }
          if(nums[nums.length-2] !=13 && nums[nums.length-1] != 13) {
       	   toplam +=nums[nums.length-1];
          }   
          System.out.println(Toplam : +toplam);*/

	}

}
