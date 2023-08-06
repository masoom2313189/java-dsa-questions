import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digit;

        int sum_even = 0;
        int sum_odd = 0;
        while (n > 0) {
            digit = n % 10;
            if (digit % 2 == 0) {
                sum_even += digit;
            } else {
                sum_odd += digit;
            }
            n = n / 10;
        }
        System.out.print(sum_even + " " + sum_odd);
    }
}
