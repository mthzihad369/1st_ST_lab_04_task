import java.util.Scanner;

public class lab4task6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1-10): ");
        int number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println("Roman numeral: I");
                break;
            case 2:
                System.out.println("Roman numeral: II");
                break;
            case 3:
                System.out.println("Roman numeral: III");
                break;
            case 4:
                System.out.println("Roman numeral: IV");
                break;
            case 5:
                System.out.println("Roman numeral: V");
                break;
            case 6:
                System.out.println("Roman numeral: VI");
                break;
            case 7:
                System.out.println("Roman numeral: VII");
                break;
            case 8:
                System.out.println("Roman numeral: VIII");
                break;
            case 9:
                System.out.println("Roman numeral: IX");
                break;
            case 10:
                System.out.println("Roman numeral: X");
                break;

            default:
                System.out.println("Error: Number must be within the range of 1 through 10.");
                break;
        }

        input.close();
    }
}