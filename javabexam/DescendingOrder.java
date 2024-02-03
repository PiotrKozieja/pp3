import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String end = "";
        String num1 = Integer.toString(num);
        int[] arr = new int[num1.length()];
        for(int i =0; i<num1.length(); i++){
            arr[i] = num1.charAt(i)-48;
        }
        Arrays.sort(arr);
        for(int i =0; i<num1.length(); i++){
            end += arr[num1.length()-i-1];
        }
        return Integer.parseInt(end);        
    }  
}
