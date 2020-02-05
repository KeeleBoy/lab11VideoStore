package lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {

		ArrayList<Movie> newList = new ArrayList<Movie>();

		for (int i = 0; i < 100; i++) {
			newList.add(MovieIO.getMovie(i + 1));
		}

		boolean goAgain = true;
		while (goAgain) {

			Scanner scnr = new Scanner(System.in);

			System.out.println("Welcome to the move application!");
			System.out.println("There are 100 movies on the list...");
			System.out.println("What category are you interested in?(1. drama, "
					+ "2. musical, 3. scifi, 4. horror, 5. comedy or 6. animated): ");

			int choice = scnr.nextInt();

			if (choice == 1) {
				for (int i = 0; i < 100; i++) {
					if (newList.get(i).getMovieGenre().equalsIgnoreCase("Drama")) {
						System.out.println(newList.get(i).getMovieName());
					}

				}

			} else if (choice == 2) {
				for (int i = 0; i < 100; i++) {
					if (newList.get(i).getMovieGenre().equalsIgnoreCase("Musical")) {
						System.out.println(newList.get(i).getMovieName());
					}

				}

			} else if (choice == 3) {
				for (int i = 0; i < 100; i++) {
					if (newList.get(i).getMovieGenre().equalsIgnoreCase("Scifi")) {
						System.out.println(newList.get(i).getMovieName());
					}

				}

			} else if (choice == 4) {
				for (int i = 0; i < 100; i++) {
					if (newList.get(i).getMovieGenre().equalsIgnoreCase("Horror")) {
						System.out.println(newList.get(i).getMovieName());
					}

				}

			} else if (choice == 5) {
				for (int i = 0; i < 100; i++) {
					if (newList.get(i).getMovieGenre().equalsIgnoreCase("Comedy")) {
						System.out.println(newList.get(i).getMovieName());
					}

				}

			} else if (choice == 6) {
				for (int i = 0; i < 100; i++) {
					if (newList.get(i).getMovieGenre().equalsIgnoreCase("Animated")) {
						System.out.println(newList.get(i).getMovieName());
					}

				}

			} else {
				System.out.println("Sorry, I didn't understand that input..");
			}

			System.out.println("Want to go again? y/n: ");
			goAgain = scnr.next().toLowerCase().startsWith("y");
		}
		System.out.println("Goodbye!");

	}

}
