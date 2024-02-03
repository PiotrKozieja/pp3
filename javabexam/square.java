import java.lang.Math;
public class square {    
    public static boolean isSquare(int n) {  
        if (n>=0){
            if(Math.sqrt(n) == (int)(Math.sqrt(n))){
            return true;
            }
            return false;
            } 
            else{
                return false;
            }
}

    public static void main(String[] args) {
        System.out.println(isSquare(0));
        
        
    }
}