import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the price of the item?");
        double itemPrice = scanner.nextDouble();
        double shippingPrice = 0;
        double totalPrice;
        if (itemPrice >= 100) {
            shippingPrice = 0;
            System.out.println("Your shipping price is $0.00, and your total is $" + itemPrice);
        } else {
            shippingPrice = itemPrice * 0.02;
            totalPrice = itemPrice + shippingPrice;
            System.out.println("Your shipping cost is $" + shippingPrice + ", and your total is $" + totalPrice);
        }
        scanner.close();
    }
}
