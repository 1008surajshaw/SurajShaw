import java.util.*;

public class Problem4 {
    public static void MapNumber(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        System.out.println("Count of numbers divisible by 1 to 9:");
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + countMap.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Size must be greater than 0.");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            sc.nextLine();    
        }

        MapNumber(arr);
        sc.close();
    }
}
