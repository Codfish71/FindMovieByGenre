package movieClientServer;

import java.util.List;

public interface MovieAlgorithms {
	List<String> findMovieByGenre(MovieEntity[] movies, String gen);
}
