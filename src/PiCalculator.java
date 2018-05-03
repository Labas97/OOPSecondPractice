
public class PiCalculator {

	public static void main(String[] args) {
		double pi = 2;
		int i;
		
		for(i=1; i<=10000; i++)
		{
			double WallisLeft = (2*i)/(2*i-1);
			double WallisRight = (2*i)/(2*i+1);
					
			pi = pi*WallisLeft*WallisRight;
			System.out.println("Current pi: "+ pi);
		}

		System.out.println("The value of estimated pi is: "+ pi);
		
	}

}
