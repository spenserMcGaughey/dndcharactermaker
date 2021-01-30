import java.util.Scanner;

public class CharacterMaker {


	
	public static void main(String args[]) {
		if(true) {
			
			int[] scores=new int[6];
			
			Scanner scan=new Scanner(System.in); //Scanner
			
			System.out.println("Welcome to the DnD character maker!");
			
			//skills
			System.out.println("First, let's roll for abilities");
			System.out.println("Would you like to roll yourself (type 'Y'), or use the die roller (Type 'R')?");
			String roller = scan.nextLine();
			while(!roller.equalsIgnoreCase("R")&&!roller.equalsIgnoreCase("Y")) {
				System.out.println("Please enter either 'Y' or 'R'.");
				roller = scan.nextLine();
			}
			if(roller.equalsIgnoreCase("Y")) {
				System.out.println("Roll four d6s, then add the top three rolls together. \nDo this six times, \nEnter your six scores");
				
				
				scores[0] = scan.nextInt();
				while(scores[0]>18 || scores[0]<3) {
					System.out.println("Your score can only be between 3 and 18, check to make sure you calculated your score correctly.");
					System.out.println("Enter your corrected score: ");
					scores[0]=scan.nextInt();
				}
				System.out.println("Next score: ");
				scores[1] = scan.nextInt();
				while(scores[1]>18 || scores[1]<3) {
					System.out.println("Your score can only be between 3 and 18, check to make sure you calculated your score correctly.");
					System.out.println("Enter your corrected score: ");
					scores[1]=scan.nextInt();
				}
				System.out.println("Next score: ");
				scores[2] = scan.nextInt();
				while(scores[2]>18 || scores[2]<3) {
					System.out.println("Your score can only be between 3 and 18, check to make sure you calculated your score correctly.");
					System.out.println("Enter your corrected score: ");
					scores[2]=scan.nextInt();
				}
				System.out.println("Next score: ");
				scores[3] = scan.nextInt();
				while(scores[3]>18 || scores[3]<3) {
					System.out.println("Your score can only be between 3 and 18, check to make sure you calculated your score correctly.");
					System.out.println("Enter your corrected score: ");
					scores[3]=scan.nextInt();
				}
				System.out.println("Next score: ");
				scores[4] = scan.nextInt();
				while(scores[4]>18 || scores[4]<3) {
					System.out.println("Your score can only be between 3 and 18, check to make sure you calculated your score correctly.");
					System.out.println("Enter your corrected score: ");
					scores[4]=scan.nextInt();
				}
				System.out.println("Next score: ");
				scores[5] = scan.nextInt();
				while(scores[5]>18 || scores[5]<3) {
					System.out.println("Your score can only be between 3 and 18, check to make sure you calculated your score correctly.");
					System.out.println("Enter your corrected score: ");
					scores[5]=scan.nextInt();
				}
				
				System.out.println("Now to the next step.");
			}
			
			else if(roller.equalsIgnoreCase("R")) {
				
				for(int i=0; i<6;i++) {
					DndDieRoller dSix = new DndDieRoller(6);
					scores[i]=dSix.statRoll();
				}
				System.out.println("Here are your scores: ");
				for(int i=0; i<6;i++) {
					System.out.println("Score "+(i+1)+": "+scores[i]);
				}
				
			}
			
			//Class
			System.out.println("\nNow let's select a class.");
			System.out.println("Class options: Bard, Fighter, Monk");
			System.out.println("Please enter your desired class: ");
			String dndClass = scan.nextLine();
			
			while(dndClass!=null) {
				switch(dndClass) {
				
				case "Monk":
				case "monk":
					
					System.out.println("Okay, so let's place your ability scores accrodingly.");
					System.out.println("It is suggested that you make dexterity your highest score, followed by wisdom.");
					System.out.println("Would you like to enter your scores yourself (enter 'Y'), or have me do it for you ('N')");
					String placement = scan.nextLine();
					while(!placement.equalsIgnoreCase("Y")&&!placement.equalsIgnoreCase("N")) {
						System.out.println("Please enter either 'Y' or 'N'");
						placement = scan.nextLine();
					}
					
					if(placement.equalsIgnoreCase("Y")) {
						System.out.println("These are your scores: \n");
						for(int i=0;i<6;i++) {
			
						System.out.print(scores[i]+", ");
						}
						System.out.println("These are the abilities to choose from: ");
						System.out.println("Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma.\n");
						System.out.println("Choose a number for your strength score");
					}
					break;
				}
			}
		}
		
		else {
			System.out.println("Please enter a player name: ");
			
		}
	}
}
