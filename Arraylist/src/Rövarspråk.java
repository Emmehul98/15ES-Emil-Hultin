import java.util.Scanner;

public class Rövarspråk {
	
	public static void main(String[] args) {
		
		String konsomanter1 = "abcdefghijklmnopqrstuvwxyz"
				char konsomenter[] = konsomanter1.toCharArray();
		
		System.out.print("skriv en mening: ");
		 Scanner in = new Scanner(System.in);
		 String mening = in.nextLine();
		 int tecken = mening.length();
		 char rovar[] = mening.toCharArray ();		 
		 String rovarmening = "";
		 
		 System.out.println ("På rövarspråkaw");
		 for (int i =0; i<tecken; i++)
		 {
			
			for( int x = 0; x<20; x++)
			{
				if(rovar [i] == konsomenter [x])
				{
					String del = rovar[i]+"o"+rovar[i];
					 rovarmening = rovarmening+del;
					 
				}
			
				
			}
		
				 
				 
	
	}

}
