package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Starting money: ");
		int startAmount = in.nextInt();
		System.out.println("Win probability: ");
		double winChance = in.nextDouble();
		System.out.println("Win Limit: ");
		int winLimit = in.nextInt();
		System.out.println("How many days?");
		int totalSimulations = in.nextInt();
		int numPlays;
		int numRuined = 0;
		int numDays = 0;
		
	for (int j = 1; j <= totalSimulations; j++)
	{
		int money = startAmount;
		numPlays = 0;
		while ((money < winLimit) && money != 0)
		{
		if (Math.random() <= winChance)
			{
				money++;
				// System.out.println("You won 1$. You know have $" + money +".");
			}
			else
			{
				money--;
				// System.out.println("You lost 1$. You know have $" + money +".");
			}
		numPlays++;
		}
		System.out.println("Day number: " + j);
		System.out.println("Plays in Day: " + numPlays);
	if (money == 0)
	{
		System.out.println("You bust. Remember, 90% of gamblers quit before they hit big.");
		numRuined++;
	}
	else 
	{
		System.out.println("You win!");
	}
	numDays = j;
	}
	double ruinRate = ((double)numRuined)/numDays;
	System.out.println("Ruin Rate: " + ruinRate);
	double expectedRuin = 0;
	if (winChance == 0.5)
	{
		expectedRuin = 1- startAmount/winLimit;
	}
	else
	{
		double alpha = (1 - winChance)/winChance;
		expectedRuin = (Math.pow(alpha, startAmount) - Math.pow(alpha, winLimit))/(1 - Math.pow(alpha, winLimit));
	}
	System.out.println("Expected Ruin: " + expectedRuin);

	}

}
