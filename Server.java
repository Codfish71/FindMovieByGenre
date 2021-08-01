package movieClientServer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Server implements MovieAlgorithms{
	static Scanner sc = new Scanner(System.in);

	@Override
	 
	public List<String> findMovieByGenre(MovieEntity[] movies, String gen) {

		List<String> movieResult = new ArrayList<>();
		// sc.next();

		for (MovieEntity movie : movies) {
			String[] genreList = movie.getGenre();
			if (Arrays.stream(genreList).anyMatch(gen::equals)) {
				movieResult.add(movie.getName());
			}
		}
		return movieResult;

	}
}
