public class f6e9{
    static int b = 0;
    static void show(){
        System.out.println(b);
    }
    static void deposit(int x){
        b+=x;
    }
    static void withdraw(int x){
        if(x>500){System.out.println("Max500");}
        else{if(x<=b){b-=x;}else{System.out.println("no money");}}
    }
    public static void main(String[] args) {
        show();
        deposit(100);
        show();
        withdraw(50);
        show();
        withdraw(501);
        show();
    }
}