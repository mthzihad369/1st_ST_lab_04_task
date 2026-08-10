import java.util.Scanner;

public class lab4task10 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of books purchased this month: ");
        int books = input.nextInt();
        int points = 0;

        if (books == 0) {
            points = 0;
        } else if (books == 1) {
            points = 5;
        } else if (books == 2) {
            points = 15;
        } else if (books == 3) {
            points = 30;
        } else if (books >= 4) {
            points = 60;
        } else {
    
            System.out.println("Invalid input!");
            return;
        }

        System.out.println("Points awarded: " + points);

        input.close();
    }
}