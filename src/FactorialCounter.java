
public class FactorialCounter {

	public static void main(String[] args) {
		
		FactorialCount(10);
		
		System.out.println();

	}
	
	public static void FactorialCount(int limit) {
		
		int product=1;
		for (int i = 1; i < limit; i++) {
			
			product*=i;
		System.out.println(product);
		}
		
	}

}
