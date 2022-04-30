import java.util.Arrays;

public class PairSum2 {
    public static void main(String[] args) {
        int arr[]={2,9,6,3,1,10,4};
        Arrays.sort(arr);
        for(int element:arr)
        {
        System.out.print(" "+element);
        }
        int k=9, first=0,last=arr.length-1;

        while(first<last)
        {
            if((arr[first]+arr[last]==k))
            {
            System.out.println("\n Pair sum is "+arr[first]+" "+arr[last]);
            return;
            }
        if((arr[first]+arr[last])<k)
        first++;
        else
        if((arr[first]+arr[last])>k)
        last--;
        }
    }

}
