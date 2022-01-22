
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		boolean isPrime = true;
		
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
			{
				isPrime = false;
				break;
			}
		}

		if(isPrime)
		{
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
	}

}
