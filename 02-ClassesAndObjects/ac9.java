
public class ac9 {
    int count = 0;
    void p1(){
        count++;
    }
    void p10(){
        count+=10;
    }
    void m1(){
        count--;
    }
    void m10(){
        count -=10;
    }
    void reset(){
        count = 0;
    }
    void show(){
        System.out.println("Actual value is: "+count);
    }
    public static void main(String[]args){
        ac9 c1 = new ac9();
        c1.p1();
        c1.p10();
        c1.p10();
        c1.p1();
        c1.show();
        c1.reset();
        c1.m10();
        c1.m10();
        c1.m10();
        c1.m10();
        c1.m1();
        c1.m1();
        c1.m1();
        c1.show();
    

        
    }
}
