
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A - 65 to Z - 90
//		a - 97 to z - 122
		
		for(char i = 'A'; i <= 'E'; i++)
		{
			for(char j = 'A'; j <= i; j++)
			{
//				System.out.print(i);
				System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
