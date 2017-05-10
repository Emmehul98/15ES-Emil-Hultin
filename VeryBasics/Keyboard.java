import java.util.Scanner;

public class Keyboard {
	
	public static void main(String[] args) {
		
		Scanner tangentboard  = new Scanner(System.in);
		String vadharviskrivit = tangentbord.nextline();
		System.out.println("du skrev: "+vadharviskrivit);
		
		if (vadharviskrivit.equals("Kalla"))
			System.out.println("XD");
		tangentbord.closer();
	}

}
