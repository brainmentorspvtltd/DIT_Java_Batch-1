public class ArraySort {

    public static void main(String[] args) {

        int arr[]={10,20,30,40,50,1};

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[i+1])
            {
                System.out.println("Not sorted");
                return;
            }
        }
        System.out.println("Sorted..");
    }

}
