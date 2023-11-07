public class ac12 {
    static int i;
    static int sum;
    static void noi(int[] arr){
        sum = 0;
        for(int i = arr[0]; i<arr[arr.length-1]; i++){
            sum++;
        }
        System.out.println(sum);
    }
    static void son(int[] arr){
        sum = 0;
        for(int i = arr[0]; i<=arr[arr.length-1]; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
    static void am(int[] arr){
        sum = 0;
        int calc = 0;
        for(int i = arr[0]; i<=arr[arr.length-1]; i++){
            sum +=i;
            calc++;
        }
        System.out.println((double)sum/calc);
    }


    public static void main(String[]args){
        int[] arr1 = {3,6};
        noi(arr1);
        son(arr1);
        am(arr1);
    }
}
