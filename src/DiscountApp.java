public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;
        
        PrintInfo printInfo = new PrintInfo();
        printInfo.printInfo(client1,price1);
        printInfo.printInfo(client2,price2);

    }
}