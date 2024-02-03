public class Computer {
    private Processor proc;
    private String Cmodel;
    private int year;

    public Computer(){
        proc  = new Processor();
    }
    public String CmString(){
        return Cmodel;
    }
    public Processor getProcessor() {
        return proc();
    }
    public static void main(String[] args) {
        Computer pc1 = new Computer();
        System.out.println(pc1.proc.calc(2, 5));
        System.out.println(pc1.getProcessor());
        
    }
}
