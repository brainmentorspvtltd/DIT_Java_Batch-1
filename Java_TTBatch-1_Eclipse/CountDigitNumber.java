
public class CountDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 345;
		int count = 0;
		
		while(n != 0)
		{
			n /= 10; // n = n / 10;
			count++;
		}
		
		System.out.println("Number of Digits: "+count);

	}

}
