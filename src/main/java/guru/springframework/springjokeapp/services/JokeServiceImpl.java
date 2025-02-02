package guru.springframework.springjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author kas
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes quotes;

    public JokeServiceImpl(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }


    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
