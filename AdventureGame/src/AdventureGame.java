import java.util.Scanner;

public class AdventureGame {
	
	static float hälsa = 100;
	static int pengar = 10;
	static String förnamn = "";
	static String efterhamn = "";
	static String spelarnamn = "";
	static int ålder;
	static int sträcka = 0;
	static int posX = 0;
	static int posY = 0;
	
	static int probability(){ // returnerar 0,99
		return (int) (Math.random()*100);
	}
	
	static int probability(int max){ // returnerar 0-max
		return (int) (Math.random()*100);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Presentera Spelet
		System.out.println("Ett äventyrspel!");
		System.out.println("DU kommer antagligen att dö..");
		// Läs in spelarens namn och karaktärsnamn
		
		//börja spelet
		String kommando = "";
		System.out.print("Vad ska vi göra?");
		kommando = in.nextLine();
		
		//håll på så länge det magiska ordet INTE är inmatat.
		while (!(kommando.equals("Ni!!")|| hälsa <=0))
		{
			// Här ska vi hantera alla olika saker som ska hända.
			
			// Hantering av riktningar
			
			if(kommando.equalsIgnoreCase("N")){
				System.out.println("Norrut!");
				posY +=1;
			}			
			if(kommando.equalsIgnoreCase("S")){
				System.out.println("Söderut!");
			    posY-=1;
			}
			if(kommando.equalsIgnoreCase("Ö")||
				   kommando.equalsIgnoreCase("O")||
				   kommando.equalsIgnoreCase("E")){
				System.out.println("Österut!");
				posX +=1;
			}
			if(kommando.equalsIgnoreCase("V")){
				System.out.println("Västerut!");
				posX -=1;
			}
			if(kommando.equalsIgnoreCase("Hälsa")){
				System.out.println("Du har "+hälsa+" hälsa kvar.");
			}
			if (kommando.equalsIgnoreCase("Position")){
				System.out.println("Du är på "+posX+",");
			}
			if(kommando.equalsIgnoreCase("Pengar")){
				System.out.println("Du har "+pengar+" guldpengar.");
			}
			
			hälsa -= 0.1;
			  //hantera vad som ska hända
			
			int vadSkahända = probability();
			
			// om monster, sanoligheten 1%
			if(vadSkahända == 0 ){ // Sanolikheten 1%
				//monster
				int dödsChans = probability();
				if (dödsChans < 34){
					System.out.println("Du stötte på ett monster men överlevde, du har fortfarande "+hälsa+" hälsa.");
				}else{
					int skada = probability(18)+1;
					hälsa -= skada;
					System.out.println("Du stötte på ett monster och förlorade "+skada+" hälsa.");			
				}
			}
			else if (vadSkahända == 10){ // Sanolikheten 10% för NPC
				// NPC
			}
			else if (vadSkahända == 15){ // Sanolikheten 5% för pengar
				// Pengar
				int pengarchans = probability();
				if (pengarchans < 50){
					pengar += 1;
					System.out.println("Du hittade en gulpäng, du har "+pengar+" guldpengar. ");
				}else if (pengarchans > 79){
					pengar += 10;
					System.out.println("Du hittade 10 guldpengar! Du har nu "+pengar+" guldpengar. ");
				}else{
					pengar += 5;
					System.out.println("Du hittade 5 guldpengar. Du har nu "+pengar+" guldpengar.");
				}
			}
			else if (vadSkahända == 18){ // Sanolikheten 3% för grop
				// Grop
				// vi slumpar  fram en grop med ett djup
				int djup = probability(5)-1;
				hälsa -= djup;
				System.out.println("Du trillade ner i en grop och förlorade"+djup+"hälsa");
				
			}
			
			
			System.out.println("Du är på ("+posX+","+posY+") och har hälsa:"+hälsa);
			
			System.out.println("Vad ska vi göra?");
			kommando = in.nextLine();
		}
		System.out.println("Adjö");
	}
}
