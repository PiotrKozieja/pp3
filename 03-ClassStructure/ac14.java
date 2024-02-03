public class ac14 {
    static void toAlphabet(String t1){
        String t = t1.toUpperCase();
        int ed=0;
        for(int i = 0;i<t.length()-1;i++){
            if((int)t.charAt(i) > (int)t.charAt(i+1)){
                ed++;
            }
            System.out.println((int)t.charAt(i)+" "+(int)t.charAt(i+1));
            System.out.println(ed);
        }
        if(ed == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        toAlphabet("abcdhg");
    }
}
