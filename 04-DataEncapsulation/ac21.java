public class ac21 {
    public static int odd(int[] arr){
        int sum =0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%2==0){
                sum++;
            }
        }return sum;
    }

    public static int above(int[]arr){
        double sum =0;
        int sum1 = 0;
        for(int i = 0; i<arr.length;i++){
            sum+= arr[i];
        }
        sum= sum/arr.length;
        for(int j = 0; j<arr.length;j++){
            if(arr[j]>sum){
                sum1+=arr[j];
            }
        }
        return sum1;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int[] arr2 = {5,2,7,4,2};
        System.out.println(odd(arr));
        System.out.println(above(arr2));
    }
    
}
