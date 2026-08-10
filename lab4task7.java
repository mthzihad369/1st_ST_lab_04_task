import java.util.Scanner;

public class lab4task7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Rectangle 1:");
        System.out.print("Enter length: ");
        
        double length1 = input.nextDouble();
        System.out.print("Enter width: ");
        double width1 = input.nextDouble();
        double area1 = length1 * width1; 

        System.out.println("\nRectangle 2:");
        System.out.print("Enter length: ");
       
        double length2 = input.nextDouble();
        System.out.print("Enter width: ");
        double width2 = input.nextDouble();
        double area2 = length2 * width2; 

        System.out.println("\n--- Result ---");
        if (area1 > area2) {
            System.out.println("Rectangle 1 has the greater area.");
        } else if (area2 > area1) {
            System.out.println("Rectangle 2 has the greater area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }

        input.close();
    }
}