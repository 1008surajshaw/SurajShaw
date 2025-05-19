import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        if(a <= 0){
            System.out.println("Invalid input, select Input > 0");
            return;
        }

        int limit = (a % 2 == 0) ? a - 1 : a;

        int count = 0, num = 1;
        while (count < limit) {
            System.out.print(num);
            count++;
            if (count < limit) System.out.print(", ");
            num += 2;
        }
        System.out.println();
    }
}
