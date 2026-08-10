import java.util.Scanner;

public class lab4task9 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.println("--- Welcome to the Change-Counting Game! ---");
        System.out.println("Enter the number of coins to make exactly one dollar.\n");

        System.out.print("Enter number of pennies: ");
        int pennies = input.nextInt();

        System.out.print("Enter number of nickels: ");
        int nickels = input.nextInt();

        System.out.print("Enter number of dimes: ");
        int dimes = input.nextInt();

        System.out.print("Enter number of quarters: ");
        int quarters = input.nextInt();

        int totalCents = (pennies * 1) + (nickels * 5) + (dimes * 10) + (quarters * 25);

        System.out.println("\n--- Result ---");
        if (totalCents == 100) {
            System.out.println("Congratulations! You won the game. That's exactly one dollar!");
        } else if (totalCents > 100) {
            System.out.println("Sorry, that's more than one dollar. You had " + totalCents + " cents.");
        } else {
            System.out.println("Sorry, that's less than one dollar. You had only " + totalCents + " cents.");
        }

        input.close();
    }
}