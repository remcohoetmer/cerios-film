/**
 *
 */
package nl.cerios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

  @Autowired
  MovieService movieService;

  @RequestMapping("/movies")
  public String movie(Model model) {
    model.addAttribute("movies", movieService.findAll());
    return "movies";
  }

  @RequestMapping("/movie/{movieId}")
  public String movie(@PathVariable Integer movieId, Model model) {
    model.addAttribute("movie", movieService.findMovie(movieId));
    return "movie";
  }
}
