
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[]{10,10,10,30,30,40,40,50,70,20};
	     	int freq=1,i=1;
		while(i<arr.length)
		{
			while(i<arr.length && arr[i]==arr[i-1])
			{
				freq++;
				i++;
			}
					
			System.out.println(arr[i-1]+" "+freq);
			i++;
			freq=1;
					}
				//this is for the last element as its not same as previous one and 
		//it does not goes inside the loop and its frequency will be one 
		if(arr.length==1 ||arr[arr.length-1]!=arr[arr.length-2])
			System.out.println(arr[arr.length-1]+" "+1);
		


	}

}
