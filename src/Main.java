//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class SeasonalMaintenanceCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read seasonal maintenance costs
        System.out.print("Enter Spring maintenance cost: $");
        double springCost = scanner.nextDouble();

        System.out.print("Enter Summer maintenance cost: $");
        double summerCost = scanner.nextDouble();

        System.out.print("Enter Fall maintenance cost: $");
        double fallCost = scanner.nextDouble();

        System.out.print("Enter Winter maintenance cost: $");
        double winterCost = scanner.nextDouble();

        // Calculate the total yearly maintenance cost
        double totalCost = springCost + summerCost + fallCost + winterCost;

        // Display all costs clearly
        System.out.println("\n--- Yearly Maintenance Cost Summary ---");
        System.out.printf("Spring: $%.2f%n", springCost);
        System.out.printf("Summer: $%.2f%n", summerCost);
        System.out.printf("Fall:   $%.2f%n", fallCost);
        System.out.printf("Winter: $%.2f%n", winterCost);
        System.out.println("----------------------------------------");
        System.out.printf("Total Yearly Maintenance Cost: $%.2f%n", totalCost);

        // Close scanner
        scanner.close();
    }
}
