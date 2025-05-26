package recursion;

public class Power {
    public static int power(int base, int exponent) {
        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3)); // returns 8
        System.out.println(power(4, 5)); // returns 1024
    }
}
