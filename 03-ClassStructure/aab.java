
public class aab {
    String name;
    double weight;
    double height;
    double BMI;
    aab(String name){
        this.name = name;
    }
    aab(String name, double weight,double height){
        this.name = name;   
        this.weight = weight;
        this.height = height/100;
        BMI = weight/(height*height)*10000;
    }
    void setWandH(double weight, double height){
        this.weight = weight;
        this.height = height/100;
        BMI = weight/(height*height)*10000;
    }
    void calculateBMI(){
        System.out.println(BMI);
    }
    void dRecord(){
        if(BMI<18.5){
            System.out.println(name + " YOUR BMI IS TOO LOW");
        }
        if(BMI>=18.5 && BMI<=24.9){
        System.out.println(name + " Your BMI is okay");
        }
        if(BMI>24.9){
            System.out.println(name + " YOUUR BMI IS TOO HIGH YOU FAT MOTHERFUCKER");
        }
        System.out.println(name +": " + weight +"kg " + height +"m " + BMI);
    }
    public static void main(String[]args){
        aab s1 = new aab("student",90, 180);
        s1.dRecord();
        aab s2 = new aab("Piotr");
        s2.setWandH(67,181);
        s2.dRecord(); 
    }
    }
