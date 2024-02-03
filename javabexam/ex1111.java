public class ex1111 {
    public static boolean Numbers(int[]arr1,int[]arr2){
        int sum=0;
        for(int i =0;i<arr1.length;i++){
            if (arr1[i] == arr2[i]){
                sum++;
            }
        }
        return(sum==arr1.length);
    }
    public static void main(String[] args) {
        int[]arr1 ={12,1,13,4,15};
        int[]arr2 ={12,1,13,4,15};
        System.out.println(Numbers(arr1, arr2));
        
    }
}
