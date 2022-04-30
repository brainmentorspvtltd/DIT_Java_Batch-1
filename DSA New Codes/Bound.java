public class Bound {

    public static void main(String[] args) {

        int arr[][]={{6,5,4},{1,2,5},{7,9,7}};
        int uppersum=0;
        int lowersum=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
             if(i<=j)
             {
                 uppersum+=arr[i][j];
             }
             if(i>=j)
             {
                 lowersum+=arr[i][j];
             }
            }
        }
        System.out.println("Upper Bound sum="+uppersum);
        System.out.println("Lower Bound sum="+lowersum);

    }

}
