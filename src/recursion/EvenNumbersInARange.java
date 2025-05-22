package recursion;

public class EvenNumbersInARange {
    public static void printEvens(int start, int end) {
        if (start > end) {
            return;
        }
        if (start % 2 == 0) {
            System.out.print(start + ", ");
        }
        printEvens(start + 1, end);
    }

    public static void main(String[] args) {
        printEvens(10, 20); // Output: 10, 12, 14, 16, 18, 20,
    }
}
