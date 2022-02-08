public class PrintInfo {
    public void printInfo (Client client, double price ) {
        if (client.getFirstName() != null && client.getLastName() != null) {
            System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
        } else if (client.getLastName() != null) {
            System.out.println("Dzień dobry panie/pani " + client.getLastName());
        } else if (client.getFirstName() != null) {
            System.out.println("Witaj !" + client.getFirstName());
        } else {
            System.out.println("Witaj nieznajomy");
        }

        System.out.println("Kwota przed rabatem: " + price);
        DiscountService discountService = new DiscountService();
        double priceDiscount = discountService.calculateDiscountPrice(client, price);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount);
    }
}