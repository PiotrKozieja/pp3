public class testidk {
    int cm;
    int idk;
    static String toString(int cm ,int idk){
        return("ilosc cm: "+cm+" ilosc idk: "+idk);

    }
    static String toString1(int[] arr, int[] arr1){
        int end = 0;
        String endo ="";
        for (int i = 0; i<arr.length; i++ ){
            if (arr[i] != arr1[i]){
                endo += arr[i]+" ";
            }
        }
        return(endo);
    }
    public static void main(String[] args) {
        testidk moj = new testidk();
        moj.cm = 1;
        moj.idk =10;
        System.out.println(toString(moj.cm,moj.idk));

        String fruit = "banana";
        for (int i = 0; i < fruit.length(); i++) {
            char letter = fruit.charAt(i);
            System.out.println(letter);
            }
        int[] arr1 = {3,2,5,6,7,-8};
        int[] arr2 = {2,2,2,6,7,-8};
        System.out.println(toString1(arr1, arr2));
    }
}
