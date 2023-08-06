import java.util.Scanner;

public class FahrenheitToCelsiusTable {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		int S = s.nextInt();
		int E = s.nextInt();
		int W = s.nextInt();

		int i = S;
		while(i<=E){
		int res = ((i-32)*5/9);
			System.out.println(i +" "+res);
			i = i+W;
		}
	}
}
