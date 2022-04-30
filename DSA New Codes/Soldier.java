import java.util.Arrays;

public class Soldier {

    public static void main(String[] args) {
        int arr[][]={{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int m=arr.length;
        int n=arr[0].length;
         int [][]pairs = new int[m][2];

//calculate all the strength and put strength/index pairs into an array
        for(int i=0;i<m;i++)
        {    int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                break;
                count++;
            }
            pairs[i][0]=count;
            pairs[i][1]=i;
        }
        //it sort the pairs firstly on strength and secondly on index
        //we need to implement a comparator to do this
    Arrays.sort(pairs,(a,b)->{
        if(a[0]==b[0])
        return a[1]-b[1];
        else
        return a[0]-b[0];

    });
    int k = arr.length;
    int []indexes=new int[k];
    for(int i=0;i<k;i++)
    {
        indexes[i]=pairs[i][1];
    }
    for(int e : indexes){
        System.out.println(e);
    }

}
}
