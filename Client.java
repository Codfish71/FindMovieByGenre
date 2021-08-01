package movieClientServer;

import java.util.List;
import java.util.Scanner;

public class Client {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		MovieEntity movies[];
		Server serverObject = new Server();

		// creating of movies array
		movies = getCreated();

		// Display movies
		display(movies);
		System.out.println();
		System.out.println();

		System.out.println("Enter genre of the movie you want to find: ");
		String gen = sc.next();
		
		//Display all the movies with matched genre
		List<String> movieResult = serverObject.findMovieByGenre(movies, gen);
		for (String movieName : movieResult) {
			System.out.print(movieName + "");
		}

	}

	private static MovieEntity[] getCreated() {
		System.out.println("Enter number of movies");
		byte num = sc.nextByte();
		MovieEntity[] result = new MovieEntity[num];

		for (int i = 0; i < num; i++) {
			sc.nextLine();
			System.out.println("Enter name of movie with number " + (i + 1));
			String name = sc.nextLine();
			System.out.println("Enter rating of movie with number " + (i + 1));
			Float rating = sc.nextFloat();
			System.out.println("Enter number of genre of movie with number " + (i + 1));
			int numGenre = sc.nextInt();
			System.out.println("Enter genres");
			String[] genre = new String[numGenre];
			for (int j = 0; j < numGenre; j++) {
				genre[j] = sc.next();
			}
			result[i] = new MovieEntity(name, rating, genre);
		}
		return result;
	}

	private static void display(MovieEntity[] movies) {
		for (int i = 0; i < movies.length; i++) {
			System.out.println("Movie number 	: " + i);
			System.out.println("Name 			: " + movies[i].getName());
			System.out.println("RAting 			: " + movies[i].getRating());
			System.out.print("Genre 			: ");
			String[] genreList = movies[i].getGenre();
			for (int j = 0; j < genreList.length; j++) {
				System.out.print(genreList[j] + " ");
			}
		}
	}

}
