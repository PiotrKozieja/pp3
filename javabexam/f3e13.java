import java.lang.reflect.Array;
import java.util.Arrays;

public class f3e13 {
    public static int even(int[] arr){
        return arr.length;
    }
    public static int positiveOdd(int[] arr){
        int sum = 0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i]%2==0){sum++;}
        }
        return sum;
    }
    public static int[] reverse(int[]arr){
        int[] arr1 =new int[arr.length];
        for(int i =0;i<arr.length; i++){
            arr1[i]= arr[arr.length-1-i];
        }
        return arr1;
    }
    public static boolean compare(int[]arr1,int[]arr2){
        int sum =0;
        if(arr1.length == arr2.length){
            for(int i =0; i<arr1.length; i++){
                if(arr1[i]==arr2[i]){
                    sum++;
                }
            }return sum== arr1.length;            
        }else return false;
    }
    public static String different(int[]arr1,int[]arr2){
        String exit = "";
        int sum = 0;
            for(int i =0; i<arr1.length; i++){
                if(arr1[i]!=arr2[i]){
                    exit+= arr1[i];
                }
            }   return exit;         
    }
    public static boolean exist(int a, int[]arr){
        for(int i=0; i<arr.length;i++){
            if(arr[i] == a){
                return true;
            }
        }return false;
    }
    public static void  swap(int[][]arr){
        int fo = arr[0][0];
        int so = arr[1][0];
        arr[0][0] = arr[0][arr[0].length-1];
        arr[1][0] = arr[1][arr[1].length-1];
        arr[0][arr[0].length-1] = fo;
        arr[1][arr[1].length-1] = so;
        System.out.println(Arrays.toString(arr[0])+"\n"+Arrays.toString(arr[1]));
        

    }
    public static void main(String[] args) {
        int[] arr1 = {8,5,7,9,7};
        int[] arr2 = {3,5,6,7,8};
        int[] arr3 = {8,5,7,9,7};
        int[][] arr4 ={{8,5,7,9,7},{3,5,6,7,8}};
        System.out.println(even(arr1));
        System.out.println(positiveOdd(arr1));
        System.out.println(reverse(arr3));
        System.out.println(compare(arr1, arr2));
        System.out.println(different(arr1, arr2));
        System.out.println(exist(5, arr3));
        swap(arr4);
    }
}
