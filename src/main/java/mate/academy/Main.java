package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {

    public static void main(String[] args) {

        MovieService movieService = (MovieService) Injector
                .getInstance("mate.academy")
                .getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setDescription("second part of magic");
        movie.setTitle("Harry Potter 3");
        movieService.add(movie);
        System.out.println(movieService.get(1L).getTitle());
    }
}
