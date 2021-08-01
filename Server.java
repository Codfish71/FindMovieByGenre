package movieClientServer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Server {
	static Scanner sc = new Scanner(System.in);

	
	// Display movies
	void display(MovieEntity[] movies) {
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

	// ask genre

	// display movie with genre
	void findMovieByGenre(MovieEntity[] movies,String gen) {

		List<String> movieResult = new ArrayList<>();
		// sc.next();
		
		for (MovieEntity movie : movies) {
			String[] genreList = movie.getGenre();
			if (Arrays.stream(genreList).anyMatch(gen::equals)) {
				movieResult.add(movie.getName());
			}
		}
		for (String movie : movieResult) {
			System.out.println(movie);
		}
	}
}
