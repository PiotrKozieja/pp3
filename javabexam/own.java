public class own {
    static int currentId = 0;
    int id;
    String name;

    public own() {
        this.id = currentId;
        currentId++;
    }

    public void display() {
        System.out.println(name + " " + id);
    }

    public static void main(String[] args) {
        own s1 = new own();
        s1.name = "Artur";
        s1.display();

        own s2 = new own();
        s2.name = "Piotr";
        s2.display();
    }
}
