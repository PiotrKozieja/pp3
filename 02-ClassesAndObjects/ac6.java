public class ac6 {
    String Name;
    String Author;
    int Page;
    int TotalP;

    void Nextp(){
       Page ++;
    }
    void ShowPage(){
       System.out.println("Page number: "+Page);
    }
    void changeP(int ps){
        if(ps>0 && ps<TotalP){
            System.out.println("Changed to page: "+ps);
        }
        else{
            System.out.println("No such a page");
        }
    }
    
}
