/**
 *
 */
package nl.cerios;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MovieService {

  Map<Integer, Movie> movies;

  MovieService() {
    movies = new HashMap<>();
    add("Maze Runner");
    add("The Post");
    add("Patser");
  }

  private void add(String name) {
    int id = IdGenerator.getId();
    Movie movie = new Movie(id, name);
    movies.put(id, movie);
  }

  public List<Movie> findAll() {
    return new ArrayList<>(movies.values());
  }

  public Movie findMovie(Integer movieId) {
    Movie movie = movies.get(movieId);
    computeStatus(movie);
    return movie;
  }

  private void computeStatus(Movie movie) {
    // TODO dynamic computation
    movie.setStatus("available");

  }
}
