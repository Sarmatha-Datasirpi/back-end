import java.util.*;

class Movie implements Comparable<Movie> {
    private String title;
    private int releaseYear;

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public int compareTo(Movie other) {
        return Integer.compare(this.releaseYear, other.releaseYear);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}

class MovieTitleComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getTitle().compareTo(movie2.getTitle());
    }
}

public class SortOrder {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 2010));
        movies.add(new Movie("The Shawshank Redemption", 1994));
        movies.add(new Movie("Pulp Fiction", 1994));
        movies.add(new Movie("The Dark Knight", 2008));

        // Sorting using Comparable (release year)
        Collections.sort(movies);
        System.out.println("Sorted by release year (Comparable):");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        // Sorting using Comparator (title)
        Collections.sort(movies, new MovieTitleComparator());
        System.out.println("\nSorted by title (Comparator):");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
