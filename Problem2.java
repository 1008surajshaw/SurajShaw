import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        if(a == 0 || a < 0){
            System.out.println("Invalid input, select Input > 0");
            return;
        }
        int limit = Math.min(a, 10000); 

        for (int i = 0, num = 1; i < limit; i++, num += 2) {
            System.out.print(num);
            if (i < limit - 1) System.out.print(", ");
        }

        if (a > 10000) {
            System.out.println("\n... Output generate upto 10000 numbers. Total numbers requested: " + a);
        }
    }
}
