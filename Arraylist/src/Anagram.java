
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class Anagram {
	
	public static void main(String[] args) {
		
		//Skriv ut lite text och be användaren skriva in en sträng -
		
		String str = new String();
		Scanner in = new Scanner(System.in);
		System.out.print("Skriv en sträng: ");
		str = in.nextLine();
		in.close();
		// Här skapar vi en lista av strängen. Detta är för att kunna slumpvis välja fram ett 
		ArrayList<Character> chars = new ArrayList<Character>();
		for (char c : str.toCharArray()) {
			chars.add(c);
		}
//		for (int x=0;x< chaars.size();x++)
//			System.out.println(x+": "+chars.get(x));
		String newString = new String();
		while (!chars.isEmpty()){
			int i=(int) (Math.random()*chars.size());
			newString += Character.toString(chars.get(i));
			chars.remove(i);
		}
		System.out.println("Anagram: "+newString);
		
	}
}
