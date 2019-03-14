package pl.akademiakodu.demokwejk.data;

import org.springframework.stereotype.Component;
import pl.akademiakodu.demokwejk.model.Gif;

import java.util.Arrays;
import java.util.List;

@Component
public class GifRepsitory {

    public final static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion","android", true, 1),
            new Gif("ben-and-mike", "mike", false,1),
            new Gif("book-dominos", "book", true,1),
            new Gif("compiler-bot", "bot", false,1),
            new Gif("cowboy-coder", "coder", true,1),
            new Gif("infinite-andrew", "andrew", false,1));

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

}
