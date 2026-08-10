public class lab4task1 {
    public static void main(String[] args) {

         int x = 10;
          int y = 15;
         int z = 20;

         boolean exp1 = !(x > 10);
         boolean exp2 = x <= 5 || y < 15;
         boolean exp3 = (x != 5) && (y != z);
         boolean exp4 = x >= z || (x + y >= z);
         boolean exp5 = (x <= y - 2) && (y >= z) || (z - 2 != 20);

         System.out.println("--- Lab Task 1: Logical Evaluation ---");
         System.out.println("Values: x = 10, y = 15, z = 20\n");
        
         System.out.println("1) !(x > 10) evaluates to: " + exp1);
         System.out.println("2) x <= 5 || y < 15 evaluates to: " + exp2);
         System.out.println("3) (x != 5) && (y != z) evaluates to: " + exp3);
         System.out.println("4) x >= z || (x + y >= z) evaluates to: " + exp4);
         System.out.println("5) (x <= y - 2) && (y >= z) || (z - 2 != 20) evaluates to: " + exp5);
         System.out.println("---------------------------------------");
    }
}