public class EfficientSol {

    public static void main(String[] args) {

        int arr[]=new int[]{10,5,0,8,0,9,0,0,3,0};

        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }

        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }

}
