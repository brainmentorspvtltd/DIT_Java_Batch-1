
public class Efficient_Sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]=new int[]{10,5,0,8,0,9,0,0,2,0};
	     int count=0;	
		for(int i=0;i<10;i++)
		{
					if(arr[i]!=0)
					{
						int temp=arr[i];
						arr[i]=arr[count];
						arr[count]=temp;
						count++;
					}
				}
			
		
		System.out.println("\n Array is now \n");
		for(int i=0;i<10;i++)
			System.out.println(arr[i]);
		


	}

}
