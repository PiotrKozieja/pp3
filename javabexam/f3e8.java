public class f3e8 {
    int row;
    int seat;
    int price;
    int id;
    static int cid =1 ;
    public f3e8(int rows, int seats){
        if(rows<10&&rows>0&&seats<10&&seats>0){
            this.row = rows;
            this.seat = seats;
            this.id = cid;
            cid++;
            if(row<3){
                this.price = 25;
            }
            else price = 10;
        }
        else System.out.println("WRONG!");        
    }
    public  void show(){
        System.out.println(row +" "+seat+" "+price+" "+id);
    }
    public static void main(String[] args) {
        f3e8 t1 = new f3e8(1, 100);
        f3e8 t2 = new f3e8(1, 1);
        t2.show();
        f3e8 t3 = new f3e8(3, 9);
        t3.show();

    }
}
