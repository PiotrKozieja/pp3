
public class ac14 {
    static int o1(String t){
        return t.length();
    }
    static String f9(String t){
        return t.substring(0, 9);
    }
    static boolean l4(String t){
        System.out.println(t.substring(t.length()-4,t.length()));
        if(t.substring(t.length()-4,t.length()).equals("day!") ){return true;}
        else{return false;}
        
    }
    static boolean ie(String t){
        if(t.equals("")){return false;}
        else return true;

    }
    static public void le(String t){
        System.out.println(t.lastIndexOf("e"));
    }
    static public void space(String t){
        System.out.println(t.replace(" ", "-"));
    }
    static public void tuc(String t){
        System.out.println(t.toUpperCase());
    }
    public static void main(String[] args) {
        String t = "Have a nice day!";
        System.out.println((int)o1(t));
        System.out.println(f9(t));
        System.out.println(l4(t));
        System.out.println(ie(""));
        le(t);
        space(t);
        tuc(t);
    }
}
