package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("How many darts do you throw? ");
		int numDarts = in.nextInt();
		double x;
		double y;
		int hit = 0;
		int numThrown = 0;
		for (int i = 0; i < numDarts; i++)
		{
			x = Math.random();
			y = Math.random();
			if (Math.sqrt(x*x + y*y) <= 1)
			{
				hit++;
			}
			numThrown++;
		}
		double pi = 4*((double)hit/numThrown);
		System.out.println("Pi is approximately " + pi);
		}
	}


