public class InternetDevice {
    private String name;
    private boolean connected;
    private static int connectedDevices = 0;

    public InternetDevice(String name) {
        this.name = name;
        this.connected = false;
    }

    public void connect() {
        if (!connected) {
            connected = true;
            connectedDevices++;
            System.out.println(name + " connected to the Internet.");
        } else {
            System.out.println(name + " is already connected.");
        }
    }

    public void disconnect() {
        if (connected) {
            connected = false;
            connectedDevices--;
            System.out.println(name + " disconnected from the Internet.");
        } else {
            System.out.println(name + " is not connected.");
        }
    }

    public boolean isConnected() {
        return connected;
    }

    public void displayStatus() {
        System.out.println(name + " is " + (connected ? "connected" : "disconnected"));
    }

    public static void displayConnections() {
        System.out.println("Number of devices connected to the Internet: " + connectedDevices);
    }

    public static void main(String[] args) {
        InternetDevice device1 = new InternetDevice("Computer");
        InternetDevice device2 = new InternetDevice("Laptop");
        InternetDevice device3 = new InternetDevice("Tablet");
        InternetDevice device4 = new InternetDevice("Smartphone");
        InternetDevice device5 = new InternetDevice("Internet Radio");

        device1.connect();
        device2.connect();
        device3.connect();

        device4.displayStatus();
        device5.displayStatus();

        InternetDevice.displayConnections();
    }
} 






