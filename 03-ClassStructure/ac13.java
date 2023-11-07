import java.util.Arrays;
public class ac13 {
    static void even(int[] arr){
        int end = 0;
        for(int i = 0; i <arr.length; i++){   
            if((double)arr[i]%2 == 0){
                end++;
            }}
    System.out.println(end);
    }
    static void po(int[] arr){
        int end = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0){
                end++;
            }
        }
    System.out.println(end);
    }
    static void reverse(int[] arr){
        int end = 0;
        int length = arr.length;
        int[] arr2 = new int[length];
        for(int i = (int)arr.length-1; i>=0; i--){
            arr2[arr.length-i-1] = arr[i];   
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        int[] arr1 = {3,2,5,6,7,-8};
        even(arr1);
        po(arr1);
        reverse(arr1);
    }
}
