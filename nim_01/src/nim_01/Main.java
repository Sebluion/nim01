package nim_01;
import java.util.Scanner;

public class Main {
	
	static void wait500() {
		try{
			Thread.sleep(750);
	    } catch(InterruptedException e){
	    	e.printStackTrace();
	    }
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to 'Dr. Nim!'"); //Intro and explanation sequence begin
		wait500();
		System.out.println("Every time it's your turn, you can choose if you want to remove 1, 2 or 3 marbles.");
		wait500();
		System.out.println("The player who removes the last marble wins!");
		wait500();
		System.out.println("This time you're playing against Dr. Nim.");
		wait500();
		System.out.println("Good luck! You'll need it!");
		wait500();
		wait500();
		//End of intro sequence
		
		//declaration of variables
		int marblesLeft = 12; //amount of marbles left
		int marblesToSub; //amount of marbles to subtract
		String exitThing;
		
		
		//gameplay loop begin
		while (marblesLeft > 3) {
			//users turn
			System.out.println("***");
			wait500();
			System.out.println("It's your turn.");
			wait500();
			System.out.print("Marbles left: "); //shows how
			System.out.println(marblesLeft); //	many marbles are left
			wait500();
			Scanner marblesIn = new Scanner(System.in); //Input unit
			System.out.println("Input the amount of marbles you want to subtract (1, 2 or 3):");
			marblesToSub = marblesIn.nextInt(); //marblestosub
			if (marblesToSub > 3) {
				marblesToSub = 3;
			}
			marblesLeft = marblesLeft - marblesToSub; //user turn end
			
			//dr nims turn
			System.out.println("***");
			wait500();
			System.out.println("It's Dr. Nim's turn.");
			wait500();
			if (marblesToSub == 1) { //Dr. nim logic here
				marblesToSub = 3;
			} else if (marblesToSub == 2) {
				marblesToSub = 2;
			} else if (marblesToSub == 3) {
				marblesToSub = 1;
			}
			System.out.print("Doctor Nim removed ");
			System.out.print(marblesToSub);
			if (marblesToSub == 1) {
				System.out.println(" marble.");
			} else {
				System.out.println(" marbles.");
			}
			marblesLeft = marblesLeft - marblesToSub;
			wait500();
		}
		
		System.out.print("Marbles left: "); //shows how
		System.out.println(marblesLeft); //	many marbles are left
		wait500();
		System.out.println("***");
		wait500();
		wait500();
		System.out.println("Dr. Nim won!");
		System.out.println("Press any key and then enter to exit.");
		Scanner exit = new Scanner(System.in);
		exitThing = exit.nextLine();
	}

}
