
import java.util.Scanner;

public class korsord {
	
	static int sizeX, sizeY;
	static char nyckel[] = new char[26];

    public static void main(String[] args) {
    	
    	for (int i = 0; i < 26; i++) {
    		nyckel[i] = ´ ´;
    	}
    	{


           System.out.println("Skriv in storleken på ditt korsord!");
           // Läs in antal rader i korsordet
           System.out.print("Rader: ");
           Scanner in = new Scanner(System.in);	
           sizeY = in.nextInt();
           System.out.print("Kolumner: ");
           sizeX = in.nextInt();
           // Skapa korsordet
           int[][] korsord = new int[sizeX][sizeY];
           // Stoppa in siffror i korsordet:
           System.out.println("Skriv in en rad med siffror, avsluta med ENTER");
           for (int y=0; y < sizeY; y++){
               for (int x=0; x < sizeX; x++){
                   System.out.print("Skriv in siffra på rad "+y+":"+"plats"+x+":");
                   korsord[x][y] = in.nextInt();
                }
             }
             while (true) {
                 // Skriv ut korsordet
                 System.out.println("Korsordet ser ut så här:");
                 for(int y=0; y < sizeY; y++){
                     for(int x=0; x < sizeX; x++){
	              if (nyckel[korsord[x][y]] !' '){
		          System.out.print(nyckel[korsord[x][y]]);
		
	                }
	                else
	                	System.out.println
	        	
                 }
                 System.out.print(korsord[x][y]+ " ");
            }
            System.out.println("Skriv in siffra och bokstav att byta ut den med");
            int bytut = in.nextInt();
            String bytuttill = in.nextLine();
            nyckel[bytut] = bytuttill.charAt(1);
        }
    }
}