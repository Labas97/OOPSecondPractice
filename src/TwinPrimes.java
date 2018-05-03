
public class TwinPrimes {

	public static void main(String[] args) {
		
			for(i=1; i<100; i++)

	}

	public static boolean IsPrime(int num) {
		
		if(num<2) return false;
		if(num==2) return true;
		if(num%2==0) return false;
		
		for(int i=3; i * i <=num; i+=2) {
			
			System.out.println(i);
			if(num%i==0) return false;
			return true;
		}
		
		
	}
}
