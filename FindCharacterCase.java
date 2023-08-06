import java.util.Scanner;
public class FindCharacterCase {

    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);

        String name = s.next();
        char ch = name.charAt(0);

        if (ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'E' || ch == 'F' || ch == 'G' || ch == 'H'
                || ch == 'I' || ch == 'J' || ch == 'K' || ch == 'L' || ch == 'M' || ch == 'N' || ch == 'O' || ch == 'P'
                || ch == 'Q' || ch == 'R' || ch == 'S' || ch == 'T' || ch == 'U' || ch == 'V' || ch == 'W' || ch == 'X'
                || ch == 'Y' || ch == 'Z') {
            System.out.print("1");
        } else if (ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e' || ch == 'f' || ch == 'g' || ch == 'h'
                || ch == 'i' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'o' || ch == 'p'
                || ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'u' || ch == 'v' || ch == 'w' || ch == 'x'
                || ch == 'y' || ch == 'z') {
            System.out.print("0");
        } else {
            System.out.print("-1");
        }
    }
}
