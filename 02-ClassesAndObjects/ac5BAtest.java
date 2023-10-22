public class ac5BAtest {
    public static void main(String[]args){
        ac5BA a1 = new ac5BA();
        a1.Name = "Piotr";
        a1.Balance = 425;
        a1.id = 321;
        a1.creditcard = true;
        a1.active = true;





        a1.showName();
        a1.showactive();
        a1.changecc(false);
        a1.showactive();

    }
}
