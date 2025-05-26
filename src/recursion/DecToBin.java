package recursion;

public class DecToBin {
    public static String toBinary(int n) {
        if (n == 0) {
            return "";
        }
        return toBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        System.out.println(toBinary(30)); // returns "11110"
    }
}
