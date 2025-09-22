import java.util.Arrays;
import java.util.List;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        System.out.println("=== FOR-EACH LOOP EXERCISES ===\n");

        // TODO 1: Basic Array Iteration - Print all numbers
        System.out.println("TODO 1: Print array numbers");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // TODO 2: String Array - Print all fruits
        System.out.println("TODO 2: Print all fruits");
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println("\n");

        // TODO 3: Calculate Sum - Sum all values
        System.out.println("TODO 3: Calculate sum");
        int[] values = {15, 25, 35, 45, 55};
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        System.out.println("Sum: " + sum);
        System.out.println();

        // TODO 4: Find Maximum - Find max value
        System.out.println("TODO 4: Find maximum");
        int[] data = {23, 67, 45, 89, 12, 78, 34};
        int max = data[0];
        for (int num : data) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println();

        // TODO 5: Count Elements - Count strings longer than 5 chars
        System.out.println("TODO 5: Count long strings");
        String[] words = {"Java", "Programming", "Loop", "Enhanced", "Iteration"};
        int longStringCount = 0;
        for (String word : words) {
            if (word.length() > 5) {
                longStringCount++;
            }
        }
        System.out.println("Strings longer than 5 chars: " + longStringCount);
        System.out.println();

        // TODO 6: Double Array Elements - Print each doubled
        System.out.println("TODO 6: Print doubled numbers");
        int[] original = {1, 2, 3, 4, 5};
        for (int n : original) {
            System.out.print((n * 2) + " ");
        }
        System.out.println("\n");

        // TODO 7: Character Array - Print char and ASCII
        System.out.println("TODO 7: Print characters with ASCII");
        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        for (char c : letters) {
            System.out.println(c + " : " + (int) c);
        }
        System.out.println();

        // TODO 8: Boolean Array - Count true values
        System.out.println("TODO 8: Count true values");
        boolean[] flags = {true, false, true, true, false, true};
        int trueCount = 0;
        for (boolean flag : flags) {
            if (flag) {
                trueCount++;
            }
        }
        System.out.println("True count: " + trueCount);
        System.out.println();

        // TODO 9: ArrayList Iteration - Print all colors
        System.out.println("TODO 9: Print ArrayList colors");
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println("\n");

        // TODO 10: String Processing - Print words in uppercase
        System.out.println("TODO 10: Print words in uppercase");
        String[] sentences = {"hello", "world", "java", "programming"};
        for (String word : sentences) {
            System.out.println(word.toUpperCase());
        }
        System.out.println();

        // TODO 11: Search in Array - Check if "Java" exists
        System.out.println("TODO 11: Search for 'Java'");
        String[] languages = {"Python", "Java", "C++", "JavaScript", "Go"};
        boolean found = false;
        for (String lang : languages) {
            if (lang.equals("Java")) {
                found = true;
                break;
            }
        }
        System.out.println("Java found: " + found);
        System.out.println();

        // TODO 12: Average Calculation - Average of scores
        System.out.println("TODO 12: Calculate average score");
        double[] scores = {85.5, 92.0, 78.5, 96.0, 87.5};
        double total = 0.0;
        for (double score : scores) {
            total += score;
        }
        double average = total / scores.length;
        System.out.println("Average score: " + average);
        System.out.println();

        // TODO 13: Multi-dimensional Array - Print 2D array
        System.out.println("TODO 13: Print 2D array");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();

        // TODO 14: Filter and Count - Count even numbers
        System.out.println("TODO 14: Count even numbers");
        int[] mixedNumbers = {12, 15, 18, 21, 24, 27, 30};
        int evenCount = 0;
        for (int num : mixedNumbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);
    }
}

