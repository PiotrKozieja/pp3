public class ac9 {
    String name;
    double weight;
    double height;
    double BMI;
    ac9(String name){
        this.name = name;
    }
    ac9(String name, double weight,double height){
        this.name = name;   
        this.weight = weight;
        this.height = height;
    }
    void setWandH(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    void calculateBMI(){
        BMI = weight/height*height;
    }
    void dRecord(){
        System.out.println(name + weight + height + BMI);
        }
    
    public static void main(String[]args){
        ac9 s1 = new ac9("student",70.5, 180);
        s1.dRecord();

        
    }

}



