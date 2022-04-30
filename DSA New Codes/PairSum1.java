public class PairSum1 {
    public static void main(String[] args) {

        int arr[]={2,9,6,3,1,10,4};
        int k=9;
        int sum=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                sum=arr[i]+arr[j];
                if(sum==k)
                {
                    System.out.println("Pair is "+arr[i]+" "+arr[j]);
                return;
                }
            }
        }
    }

}
