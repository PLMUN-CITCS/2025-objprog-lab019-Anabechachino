import java.util.Scanner;

public class FactorialCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number >= 0) {
                System.out.println("Factorial of " + number + " is " + calculateFactorial(number));
            } else {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        scanner.close();
    }
    
    // Method to calculate factorial using recursion
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
