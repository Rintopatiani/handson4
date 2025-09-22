public class ForLoopPractice {
    public static void main(String[] args) {
        System.out.println("=== FOR LOOP EXERCISES ===\n");

        // TODO 1: Basic For Loop
        System.out.println("TODO 1: Print 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // TODO 2: Even Numbers
        System.out.println("TODO 2: Even numbers 2 to 20");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // TODO 3: Countdown
        System.out.println("TODO 3: Countdown 10 to 1");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // TODO 4: Skip Count
        System.out.println("TODO 4: Multiples of 5 (5 to 50)");
        for (int i = 5; i <= 50; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // TODO 5: Array Processing
        System.out.println("TODO 5: Print array elements");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");

        // TODO 6: Sum Calculation
        System.out.println("TODO 6: Sum of 1 to 100");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        System.out.println();

        // TODO 7: Factorial
        System.out.println("TODO 7: Factorial of 6");
        int factorial = 1;
        for (int i = 1; i <= 6; i++) {
            factorial *= i;
        }
        System.out.println("6! = " + factorial);
        System.out.println();

        // TODO 8: String Iteration
        System.out.println("TODO 8: Print each character in 'HELLO'");
        String word = "HELLO";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
        System.out.println();

        // TODO 9: Multiplication Table

