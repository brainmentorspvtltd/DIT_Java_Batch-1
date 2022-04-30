public class BarChart {

    public static void main(String[] args) {

        int arr[]={1,0,2,5,3,7};

        int max=arr[0];

        for(int element:arr)
        {
        if(element>max)
        {
            max=element;
        }
    }

    for(int i=max;i>=1;i--)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(i<=arr[j])
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    }

}
