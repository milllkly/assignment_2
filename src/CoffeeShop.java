import java.util.Scanner;
public class CoffeeShop {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Start with no coffee
        Coffee orderedCoffee = null;

        // Ask the user for coffee type
        System.out.println("Do you want an Espresso? (yes or no)");
        String userResponse = scanner.nextLine().toLowerCase();

        // Check user response for coffee type
        if (userResponse.equals("yes")) {
            orderedCoffee = new Espresso();
        } else {
            // You can add more options for different types of coffee here
            System.out.println("We only have Espresso for now. Exiting.");
            System.exit(0); // or provide a default option
        }

        // Check if the user wants milk
        System.out.println("Do you want some Milk with your coffee? (yes or no)");
        userResponse = scanner.nextLine().toLowerCase();
        if (userResponse.equals("yes")) {
            orderedCoffee = new Milk(orderedCoffee); // Wrap the coffee with Milk decorator
        }

        // Check if the user wants milk
        System.out.println("Do you want some sugar with your coffee? (yes or no)");
        userResponse = scanner.nextLine().toLowerCase();
        if (userResponse.equals("yes")) {
            orderedCoffee = new Sugar(orderedCoffee); // Wrap the coffee with Milk decorator
        }

        // Check if the user wants milk
        System.out.println("Do you want some cinnamon with your coffee? (yes or no)");
        userResponse = scanner.nextLine().toLowerCase();
        if (userResponse.equals("yes")) {
            orderedCoffee = new Cinnamon(orderedCoffee); // Wrap the coffee with Milk decorator
        }

        // You can continue to add similar blocks of code for each additional decorator/condiment

        // Output the final order details
        System.out.println("You ordered: " + orderedCoffee.getDescription());
        System.out.println("Total cost: " + orderedCoffee.cost() + " tenge" );
    }
}
