import java.util.Arrays;


public class f3e14 {
    public static boolean Alpha(String s){
        String end = "";
        char[] arr = new char[s.length()];
        for(int i = 0;i<s.length();i++){
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        for(int i = 0;i<s.length();i++){
            end+=arr[i];
        }
        return end.equals(s);
    }
    public static void main(String[] args) {
        System.out.println(Alpha("abcdfe"));
    }
}
