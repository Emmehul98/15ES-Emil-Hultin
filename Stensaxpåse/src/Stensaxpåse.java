import java.util.Scanner;

public class Stensaxpåse {
	
	public static void main(String[] args) {

	int dator;
	int spelare;
	String choice[] = {"Sten" , "Sax" , "Påse"};

	dator = (int) Math.random() *3;
// sten - 0, sax -1, påse - 2
	System.out.println("Stensaxpåse");
	System.out.println("skriv in 0 for sten, 1 for sax eller 2 for påse");
	Scanner in = new Scanner (System.in);  
	spelare = in.nextInt();
	System.out.println("Du valde: "+choice[spelare]);
	System.out.println("Datorn valde: "+choice[dator]);
	in.close();
	if((spelare == 0) && (dator == 1)||
	   (spelare == 1 && dator == 2)||
	   (spelare == 2 && dator == 0))
	   System.out.println("Du vann!");
	else if (dator == spelare)
		System.out.println("Oavgjort!");
	else
		System.out.println("Du förlorade!");
			
	}

}

	