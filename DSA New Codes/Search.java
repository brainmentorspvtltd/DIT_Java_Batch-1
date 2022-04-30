public class Search {
    public static void main(String[] args) {

        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

        int search=33;

        int n=arr.length;

        int i=0, j=n-1;

        while(i<n && j>=0)
        {
            if(arr[i][j]==search)
            {
                System.out.println("Element found at "+i+" "+j);
                return;
            }

            if(arr[i][j]>search)
            j--;
            else
            i++;
        }
    }

}
