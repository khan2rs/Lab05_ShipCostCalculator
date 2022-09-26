public class ShipCostCalculator {
    public static void main(String[] args) {

        System.out.println("Please enter the price of your purchase");

        double itemCost = 200;

        if (itemCost >= 100) {
            System.out.println("Your shipping is free!");
        }else if (itemCost <100){
            System.out.println("You have a 2% shipping fee. Your shipping is: " + itemCost*0.2);
            System.out.println("Your total is: " + itemCost);
        }
    }
}
