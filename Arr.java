import java.util.Scanner;


public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		int a[]=new int[10];
		for(i=0;i<10;i++)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the element ");
			a[i]=scan.nextInt();
			}
			for( i=0;i<10;i++)
			{
			System.out.println(a[i]);
			}
		}

	}


