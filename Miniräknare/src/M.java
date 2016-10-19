import java.util.Scanner;

class Calculator{
	public static void main(String args[]){
		Scanner lerroy = new Scanner (System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = lerroy.nextDouble();
		System.out.println("Enter second num: ");
		snum = lerroy.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}