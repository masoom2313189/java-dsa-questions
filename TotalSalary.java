import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
		// Write your code here
	Scanner s = new Scanner(System.in);
	double salary = s.nextInt();
	String grade = s.next();
	char ch = grade.charAt(0);
	double hra =(salary*20/100);
	double da = (salary * 50 / 100);
	double pf =  (salary*11/100);
	double res = salary+hra+da-pf;
	if(ch == 'A'){
		res += 1700;
	} else if(ch == 'B'){
		res += 1500;
	} else {
		res += 1300;
	}
	System.out.print(Math.round(res));
	}
}
