import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number for reverse");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println("Reverse number is " + ans);
    }
}
