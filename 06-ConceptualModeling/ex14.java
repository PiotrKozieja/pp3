import java.util.Arrays;

public class ex14{
    public static double end(int[]arr){
        int sum = 0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2;i++){
            sum+=arr[i+1];
        }
        return(double)sum/(double)(arr.length-2);
    }
    public static void main(String[] args) {
        int[] ary = {5,3,2,4,1};
        System.out.println(end(ary));
    }
}
