public class Frequency {

    public static void main(String[] args) {

        int arr[]=new int[]{10,10,10,20,20,30,30,30,40,60};
        int freq=1,i=1;

        while(i<arr.length)
        {
            while(i<arr.length && arr[i]==arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            i++;
            freq=1;
        }
//this condition is for the last element as its not same as previous
//element and it does not goes inside the loop and its frequency will
//always be 1 or there is one element in an array
        if(arr.length==1 || arr[arr.length-1]!=arr[arr.length-2])
        System.out.println(arr[arr.length-1]+" "+1);
    }

}
