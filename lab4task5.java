import java.util.Scanner;

public class lab4task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == b && b == c) {
            System.out.println(3);
        } else if (a == b || b == c || a == c) {
            System.out.println(2);
        }
         else {
            System.out.println(0);
        }

        input.close();
    }
}