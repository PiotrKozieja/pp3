import java.util.ArrayList;

public class f6e15shoppinglist {
    static ArrayList<f6e15product> ShoppingList = new ArrayList<>();
    public static void add(String names, int quanitys){
        ShoppingList.add(new f6e15product(names,quanitys));
    }
    public static void show(){
        for(int i =0; i <ShoppingList.size();i++){
            ShoppingList.get(i).showp();
        }
    }
    public static void pieces(){
        int sum = 0;
        for(int i = 0; i<ShoppingList.size(); i++){
           sum+=ShoppingList.get(i).quanity;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        show();
        add("Fasola",2);
        add("Papier",3);
        add("chipsy",1);
        show();
        pieces();

    }
    
}
