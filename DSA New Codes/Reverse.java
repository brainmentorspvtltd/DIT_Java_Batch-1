public class Reverse {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int first=0;
        int last=arr.length-1;

        while(first<last)
        {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;

        }

        for(int element:arr)
        System.out.print(element+" ");
    }

}
