import java.lang.reflect.Array;
import java.util.Arrays;

public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;
    public Room(int number1){
        this.number = number1;
        this.beds = 2;
    }
    public Room(int number1, int beds1){
        this.number = number1;
        this.beds = beds1;
    }
    public void checkin(String guestName1){
        this.guestName = guestName1;
        this.occupied = true;
    }
    public void checkout(){
        this.guestName = "";
        this.occupied = false;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public void displayStatus(){
        System.out.println(number+"\n"+beds+"\n"+occupied+"\n"+guestName);
    }
    public static void main(String[] args) {
        Room n1 = new Room(1);
        Room n2 = new Room(2);
        Room n3 = new Room(3);
        Room n4 = new Room(4,3);
        Room n5 = new Room(5,3);
        Room n6 = new Room(6,1);
        Room[] rooms = new Room[6];
        rooms[1] = n1;
        rooms[2] = n2;
        rooms[3] = n3;
        rooms[4] = n4;
        rooms[5] = n5;
        rooms[0] = n6;

        rooms[0].displayStatus();

    }

}
