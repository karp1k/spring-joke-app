package guru.springframework.springjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author kas
 */
@Service
public class JokeService {

    private final ChuckNorrisQuotes quotes;

    public JokeService() {
        this.quotes = new ChuckNorrisQuotes();
    }


    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
