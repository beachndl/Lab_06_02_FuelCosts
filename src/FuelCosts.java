import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        // Scanner + variable declaration
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        double costPerHundred = 0;
        double maxDistance = 0;
        String trash = "";
        boolean done;

        // Get number of gallons
        done = false;
        do {
            System.out.print("Enter the number of gallons in the tank: ");

            if (in.hasNextDouble()) {
                // Safe to read in a double
                gallons = in.nextDouble();
                in.nextLine(); // Clear the buffer

                // Check condition
                if (gallons > 0) {
                    // Valid input, end the loop
                    done = true;
                } else {
                    System.out.println("Gallons in the tank must be greater than 0!");
                }
            } else {
                // Not a double, cannot use nextDouble()
                trash = in.nextLine(); // Read input as String
                System.out.println("\nInvalid input: " + trash);
                System.out.println("Please enter a valid number!\n");
            }
        } while (!done);

        // Get fuel efficiency (MPG)
        done = false;
        do {
            System.out.print("Enter the fuel efficiency (MPG): ");

            if (in.hasNextDouble()) {
                // Safe to read in a double
                mpg = in.nextDouble();
                in.nextLine(); // Clear the buffer

                // Check condition
                if (mpg > 0) {
                    // Valid input, end the loop
                    done = true;
                } else {
                    System.out.println("MPG must be greater than 0!");
                }
            } else {
                // Not a double, cannot use nextDouble()
                trash = in.nextLine(); // Read input as String
                System.out.println("\nInvalid input: " + trash);
                System.out.println("Please enter a valid number!\n");
            }
        } while (!done);

        // Get price per gallon
        done = false;
        do {
            System.out.print("Enter the price per gallon: $");

            if (in.hasNextDouble()) {
                // Safe to read in a double
                pricePerGallon = in.nextDouble();
                in.nextLine(); // Clear the buffer

                // Check condition
                if (pricePerGallon > 0) {
                    // Valid input, end the loop
                    done = true;
                } else {
                    System.out.println("Price must be greater than 0!");
                }
            } else {
                // Not a double, cannot use nextDouble()
                trash = in.nextLine(); // Read input as String
                System.out.println("\nInvalid input: " + trash);
                System.out.println("Please enter a valid number!\n");
            }
        } while (!done);

        // Calculate results
        costPerHundred = (100 / mpg) * pricePerGallon;
        maxDistance = gallons * mpg;

        // Print results
        System.out.printf("\nCost to drive 100 miles: $%.2f\n", costPerHundred);
        System.out.printf("Maximum distance on current tank: %.1f miles\n", maxDistance);
    }
}