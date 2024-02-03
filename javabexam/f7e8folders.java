import java.util.ArrayList;

public class f7e8folders{
    String name;
    f7e8files filef;
    ArrayList<f7e8files> arr = new ArrayList<>();
    public f7e8folders(String name){
        this.name = name;
    }
    public f7e8files getfiles(){
        return filef;
    }
    public void add(f7e8files file){
        arr.add(file);
    }
    public void show(){
        for (int i =0; i<arr.size();i++){
            System.out.println(arr.get(i).getname());
        }
    }
    public void removebn(String fname){
        for (int i =0;i< arr.size();i++){
            if (arr.get(i).getname()==fname){
                arr.remove(i);
            }
        }
    }
    public void removebf(f7e8files f){
        arr.remove(f);
    }
    public static void main(String[] args) {
        f7e8files f1 = new f7e8files("f1");
        f7e8files f2 = new f7e8files("f2");
        f7e8folders folder = new f7e8folders("folder");
        folder.add(f1);
        folder.add(f2);
        folder.show();
        folder.removebf(f2);
        folder.show();
        System.out.println("n");
        folder.removebn("f1");
        folder.show();
        System.out.println("n");
        
    }

}