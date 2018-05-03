
public class PiCalculator2 {

	
	public static void main(String[] args) {
		
		double pi = 0;
		double numb = 1;
		int i;
		
		for (i = 0; i < 10000; i++) {
			
			if (i % 2 == 0) {
	            pi = pi + (1 / numb);
	            }
			else {
	            pi = pi - (1 / numb);
	         	}
	         numb = numb + 2;
		}
	      
		pi = pi * 4;
	    System.out.println(pi);

	}

}
