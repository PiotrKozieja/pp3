public class ac7 {
    boolean lStatus;
    
    void son(){
        lStatus = true;
    }
    void soff(){
        lStatus = false;
    }
    void shows(){
        System.out.println("Lamp is switched "+(lStatus ? "on" : "off"));
    }
}
