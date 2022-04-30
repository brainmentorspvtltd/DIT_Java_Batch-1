public class Negative {
    public static void main(String[] args) {

        int arr[][]={{1,2,3,-4},{5,1,2,-3},{9,5,-1,-2}};

        int count=0;

        for(int[] sub:arr)
        {
            for(int i:sub)
            {
                if(i<0)
                {
                    System.out.print(i+" ");
                    count++;
                }
            }
        }
       System.out.println("No. of negative element in a matrix is "+count);
    }
}
