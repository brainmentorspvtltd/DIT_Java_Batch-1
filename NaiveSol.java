
public class NaiveSol {

	public static void main(String[] args) {
		
		
		int arr[]=new int[]{10,5,0,8,0,9,0,0,2,0};
	     	
		for(int i=0;i<10;i++)
		{
			if(arr[i]==0)
			{
				for(int j=i+1;j<10;j++){
					if(arr[j]!=0)
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		System.out.println("\n Array is now \n");
		for(int i=0;i<10;i++)
			System.out.println(arr[i]);
		

	}

}
