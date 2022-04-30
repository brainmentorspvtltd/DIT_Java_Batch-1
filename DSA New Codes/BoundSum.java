public class BoundSum {
    public static void main(String[] args) {

        int a[][]={{6,5,4},
                   {1,2,5},
                   {7,9,7}};
    int uppersum=0,lowersum=0,i,j;

    for(i=0;i<a.length;i++)
    {
        for(j=0;j<a[i].length;j++)
        {
            if(i<=j)
            uppersum+=a[i][j];
            if(j<=i)
            lowersum+=a[i][j];
        }
    }

    System.out.println("Upper sum is "+uppersum);
    System.out.println("Lower sum is "+lowersum);



                }

}
