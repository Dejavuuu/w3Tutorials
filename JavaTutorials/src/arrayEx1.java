
public class arrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		  int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		  
//		  for (int i = 0; i < arr.length; i++) { 
//			  System.out.println(arr[i]); 
//			  }
		 
//		int[] arr = {2,0,1,3};
//		for (int el: arr) {
//			System.out.println(el);
//		}
		
//		int[] arr = {1,9,9,1};
//		for(int i=0; i<arr.length; i++) {
//			int el = arr[i];
//			System.out.println(el);
//		}
		  
//		  int i;
//		  for(i = 0; i < 5; i++) {
//			  if (i>=2) {
//				  break;
//			  }
//			  System.out.println("wow");
//			  }
//		  }
		int i;
		for(i = 0; i < 5; i++) {
			if(i >= 3) {
				break;
			}
			System.out.println("Haha");
			if(i >=1) {
				continue;
			}
			System.out.println("tata");
			
		}
		System.out.println(i);
	}
}


