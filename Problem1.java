import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    void performOperation() {
        switch (operation) {
            case "add":
                System.out.println("Result: " + add());
                break;
            case "sub":
                System.out.println("Result: " + subtract());
                break;
            case "mul":
                System.out.println("Result: " + multiply());
                break;
            case "div":
                try {
                    System.out.println("Result: " + divide());
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    double add() {
        return a + b;
    }

    double subtract() {
        return a - b;
    }

    double multiply() {
        return a * b;
    }

    double divide() {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter operation (add / sub / mul / div) or 'exit' to quit: ");
            String operation = sc.next();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Exiting calculator");
                break;
            }

            System.out.print("Enter value of a: ");
            double a = sc.nextDouble();

            System.out.print("Enter value of b: ");
            double b = sc.nextDouble();

            Calculator calc = new Calculator(a, b, operation);
            calc.performOperation();
        }

        sc.close();
    }
}
