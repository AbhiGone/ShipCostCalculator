import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ship = .02;
        double shippingCost = 0;
        double limit = 100;
        double total;

        System.out.println("Enter the price of your item");
        double item = scan.nextDouble();

        if(item >= limit){
            shippingCost = ship * item;
        }
        total = item + shippingCost;
        System.out.println("Your shipping cost is, $" + shippingCost + " your total is, $" + total);
    }
}