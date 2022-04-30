import java.util.HashMap;

public class PairSum3 {
    public static void main(String[] args) {
        int arr[]={2,9,6,3,1,10,4};
        int k=9;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int element:arr)
        {
            if(map.get(element)==null)
            {
                map.put(k-element,element);

            }
            else
            {
                System.out.println("Pair sum is "+map.get(element)+" "+element);
            }
        }


    }
}
