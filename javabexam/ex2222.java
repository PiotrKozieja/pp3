public class ex2222{
    public static void arrays(int[]arr1,int[]arr2){
        int sum1=0;
        int sum2 =0;
        for (int i=0;i<arr1.length-1;i++){
            if(arr1[i]>9&&arr1[i]<100){
                sum1++;
            }
        }
        for (int j=0;j<arr2.length-1;j++){
            if(arr2[j]>9&&arr2[j]<100){
                sum2++;
            }
        }
        System.out.println(sum1==sum2);
        }


public static void main(String[] args) {
    int[]arr1 ={12,1,13,4,15};
    int[]arr2 ={12,1,13,1,15};
    arrays(arr1, arr2);
}
}
