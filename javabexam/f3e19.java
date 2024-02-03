public class f3e19 {
     int h;
     int m;
    public f3e19(int hour, int minute){
        if(h>=0&&h<=23&&minute>=0&&minute<=59){
            this.h = hour;
            this.m = minute;
        }
        }public void display(){
            System.out.println(String.format("%02d:%02d", h,m));
        }
        public void p1(){
            if(m == 59){
                m =0;
                if( h == 23){
                    h=0;
                }
                else{
                    h++;
                }
            }
            else{
                m++;
            }}
        public static void main(String[] args) {
            f3e19 c1 = new f3e19(23, 58);
            c1.display();
            c1.p1();
            c1.display();
            c1.p1();
            c1.display();
            c1.p1();
            c1.display();

        }
}
