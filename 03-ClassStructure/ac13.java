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
    static void compare(int[] arr, int[] arr1){
        int end = 0;
        for (int i = 0; i<arr.length; i++ ){
            if (arr[i] != arr1[i]){
                end++;
            }
        }
        if(end == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    static void different(int[] arr, int[] arr1){
        int end = 0;
        String ende = "";
        for (int i = 0; i<arr.length; i++ ){
            if (arr[i] != arr1[i]){
                ende += arr[i]+" ";
            }
        }
        System.out.println((ende));
    }
    static boolean exist(int n, int[] arr){
        int ex= 0 ;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == n){
                ex++;
            }
        }
        if (ex!=0){
            return true;
        }
        else{return false;}
    }
    static int sMax(int[] arr){
        int big = 0;
        int sbig = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > big){
                big = arr[i];
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > sbig && arr[i]<big){
                sbig = arr[i];
            }
        }
        return(sbig);
    }
    static int lColumn(int[][] arr){
        int sum = 0;
        sum+= arr[0][arr[0].length-1]+arr[1][arr[1].length-1];
        return sum;
    }
    static String swap(int[][] arr){
        int f = 0;
        int l = 0;
        for(int i = 0; i<arr.length; i++){
            f = arr[i][0];
            l = arr[i][arr[i].length-1];
            arr[i][0] = l;
            arr[i][arr[i].length-1] = f;
        }
        return(Arrays.toString(arr[0])+"\n"+Arrays.toString(arr[1]));
    }
    static String t2o(int[][] arr){
        int c = 0;
        int lsum = arr[0].length+arr[1].length;
        int[] arr1 =  new int[lsum];
        for(int i = 0; i< arr.length;i++){
            for(int j = 0; j<arr[0].length; j++){
                arr1[c] = arr[i][j];
                c++;
            }
        }
        return(Arrays.toString(arr1));

    }


    public static void main(String[] args) {
        int[] arr1 = {3,2,5,9,7,-8};
        int[] arr2 = {2,2,2,6,7,-8};
        int[][] arr3 = {{1,2,3,4,5}, {6,7,8,9,10}};
        even(arr1);
        po(arr1);
        reverse(arr1);
        compare(arr2, arr1);
        different(arr1, arr2);
        System.out.println(sMax(arr1));
        System.out.println(exist(6, arr2));
        System.out.println(lColumn(arr3));
        System.out.println(swap(arr3));
        System.out.println(t2o(arr3));
    }
}
