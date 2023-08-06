import java.util.Scanner;

public class FindPowerOfANumber {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int res = 1;
        int i = 1;
        while (i <= n) {
            res = res * x;
            i++;
        }
        System.out.print(res);
    }
}
