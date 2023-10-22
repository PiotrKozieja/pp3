public class ac5BA {
    String Name;
    int Balance;
    int id;
    boolean creditcard;
    boolean active;

    void showName(){
        System.out.println("Name is: "+ Name);
    }
    void changecc(boolean Changea){
        active = Changea;
    }
    void showactive(){
        System.out.println("BA is active:"+active);
    }

}
