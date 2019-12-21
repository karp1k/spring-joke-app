package guru.springframework.springjokeapp.controllers;

import guru.springframework.springjokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kas
 */
@Controller
@RequestMapping({"/", ""})
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chuck-norris-jokes";
    }
}
