package lab11;

public class Movie {
	private String movieName;
	private String movieGenre;

	public Movie(String name, String genre) {
		movieName = name;
		movieGenre = genre;

	}

	public String setMovieName(String name) {
		return this.movieName = name;

	}

	public String getMovieName() {
		return movieName;

	}

	public String setMovieGenre(String genre) {
		return this.movieGenre = genre;

	}

	public String getMovieGenre() {
		return movieGenre;

	}

}
