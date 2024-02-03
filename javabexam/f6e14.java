import java.util.Arrays;

public class f6e14 {
    static void score(int[] arr){
        int sum = 0;
        if(arr.length == 5){
            Arrays.sort(arr);
            for(int i=1;i<arr.length-1;i++){
                sum+=arr[i];
            }
            System.out.println(sum/(arr.length-2));
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        score(arr1);
        
    }
}
