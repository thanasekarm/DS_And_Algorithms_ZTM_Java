package misc;

import java.util.Scanner;

public class FindAllPairsOfAnArray {

	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {

			System.out.print("Enter the inputs size:");
			int n = in.nextInt();
			String[] arr = new String[n];

			System.out.println("Enter the array values (one in each line)");
			for (int i = 0; i < n; i++) {
				arr[i] = in.next();
			}

			System.out.println("All pairs are listed below..");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i != j) {
						System.out.println("(" + arr[i] + "," + arr[j] + ")");
					}
				}
			}

		}
	}

}
