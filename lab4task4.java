import java.util.Scanner;

public class lab4task4 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

         System.out.println("Part A & B: Minimum of two numbers");
         System.out.print("Enter first integer: ");
         int num1 = input.nextInt();
         System.out.print("Enter second integer: ");
         int num2 = input.nextInt();

         if (num1 < num2) {
            System.out.println("Smaller value is: " + num1);
         } 
             else {
            System.out.println("Smaller value is: " + num2);
         }

         System.out.println("\nPart C: Sign function");
         System.out.print("Enter integer X: ");
         int x = input.nextInt();

         if (x > 0) {
            System.out.println("1");
         } 
          else if (x < 0) {
            System.out.println("-1");
         } 
          else {
            System.out.println("0");
         }

         System.out.println("\nPart D: Minimum of three numbers");
         System.out.print("Enter three integers: ");
         int a = input.nextInt();
         int b = input.nextInt();
         int c = input.nextInt();

         int smallest = a; 

         if (b < smallest) {
            smallest = b;
         }
         if (c < smallest) {
            smallest = c;
         }
         System.out.println("Smallest value is: " + smallest);

         input.close();
    }
}