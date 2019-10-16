package co.grandcircus;

import java.util.Scanner;

public class PowerTable {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String response = "y";

		do {

			System.out.print("Enter a number: ");
			int num = scan.nextInt();

			if (num <= 1290) {
			
			System.out.printf("%-10s  %-12s  %-14s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-9s | %-11s | %-13s\n", "======", "=======", "=====");
			
				for (int i = 1; i <= num; i++) {

					System.out.printf("%-9s | %-11s | %-13s\n", i, squareNum(i), cubeNum(i));

				}
			} else {
				System.out.println("number too large.");
			}

			System.out.println("Continue? (y/n)");
			response = scan.next();

			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

		} while (response.equalsIgnoreCase("y"));

		scan.close();

	}

	public static int squareNum(int num) {

		return num * num;

	}

	public static int cubeNum(int num) {

		return squareNum(num) * num;

	}

}
