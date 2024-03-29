package pl.akademiakodu.demokwejk.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.akademiakodu.demokwejk.model.Gif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepsitory {

    public final static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "android", true, 0),
            new Gif("ben-and-mike", "mike", false, 0),
            new Gif("book-dominos", "book", true, 1),
            new Gif("compiler-bot", "bot", false, 1),
            new Gif("cowboy-coder", "coder", true, 2),
            new Gif("infinite-andrew", "andrew", false, 2));

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public static List<Gif> getFavorites() {
        List<Gif> favorites = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if (gif.getFavorite() == true) ;
            favorites.add(gif);
        }
        return favorites;
    }

    public static List<Gif> getbyID(int categoryid){
        List<Gif> list = new ArrayList<>();
        for(Gif gif : ALL_GIFS){
            if(gif.getId()== categoryid)
                list.add(gif);
        }
        return list;
    }

}
