public class Processor {
    private String model;
    private double Mhz;
    
    public String getModel(){
        return model;
    }
    public double getMhz(){
        return Mhz;
    }
    public int calc(int x, int y){
        return(x*y);
    }
}
