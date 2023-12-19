public class TV implements CanOnOff,CanChangeChannel,CanChangeVolume{
    boolean status = false;
    int ch = 1;
    int volume=1;
    public void on(){
        status=true;
    }
    public void off(){
        status = false;
        ch =1;
        volume = 1;
    }
    public void sStatus(){
        System.out.println(status?"Turned on":"Turned off");
    }
    public void chStatus(){
        if(status==true){
          System.out.println("Channel: "+ch);  
        }   
    }
    public void channelUp(){
        if (ch<99&&status== true){
            ch++;
        }
    }
    public void channelDown(){
        if (ch>1&&status== true){
            ch--;
        }
    }
    public void setChannel(int chn){
        if(chn>0&&chn<100&&status== true){
         ch = chn;   
        } 
    }
    public void volumeUp(){
        if(volume<10&&status== true){
            volume++;
        }
    }
    public void volumeDown(){
        if(volume>1&&status== true){
            volume--;
        }
    }
    public static void main(String[] args) {
        TV t1 = new TV();
        t1.on();
        t1.channelUp();
        t1.channelUp();
        t1.sStatus();
        t1.chStatus();
        t1.off();
        t1.sStatus();
        t1.on();
        t1.channelUp();
        t1.setChannel(150);
        t1.chStatus();
        t1.off();
        t1.on();
        t1.chStatus();
    }
}
