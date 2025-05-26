package recursion;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(209)); // returns 11
        System.out.println(sumOfDigits(12345)); // returns 15
    }
}
