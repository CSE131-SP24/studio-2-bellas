package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Set the start amount of money:");
		int startAmount = scan.nextInt();
		System.out.println("Set the win chance:");
		double winChance = scan.nextDouble();
		System.out.println("Set the win limit:");
		int winLimit = scan.nextInt();
		System.out.println("Enter the total days of simulation: ");
		int totalSimulation = scan.nextInt();
		int totalLoses = 0;
		String result = new String();
		for(int i =1; i <= totalSimulation;i++) {
			int currentAmount = startAmount;
			int dailySimulation = 0;
			while (currentAmount > 0 && currentAmount < winLimit) {
				double simulator = Math.random();
				if (simulator < winChance) {
					currentAmount++;
					dailySimulation++;
					
				
				}
				else {
					currentAmount--;
					dailySimulation++;
				}
				if (currentAmount == 0) {
					totalLoses++;
					// break;
					result = "LOSE";
				}
				if (currentAmount == winLimit) {
					result = "WIN";
				}
			}
			System.out.println("Simulation "+i+ ": "+dailySimulation
					+" "+result);
		}
		double ruinRate = (double)totalLoses/totalSimulation;
		System.out.println("Losses: "+totalLoses+" "+"Simulations: "+totalSimulation);
		System.out.println("Ruin Rate from Simulation: "+ruinRate);
		

	}

}
