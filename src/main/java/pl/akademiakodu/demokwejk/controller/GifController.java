package pl.akademiakodu.demokwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.demokwejk.data.GifRepsitory;
import pl.akademiakodu.demokwejk.model.Gif;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GifController {

    @Autowired
    GifRepsitory gifRepsitory;

    @RequestMapping("/")
    public String listOfGifs(ModelMap modelMap){
        List<Gif> gifs = gifRepsitory.getAllGifs();
        modelMap.put("gifs", gifs);
        return "home";
    }

    @RequestMapping("/favorites")
    public String gifFavourites(ModelMap modelMap){
        List<Gif> gifs = gifRepsitory.getFavorites();
        modelMap.put("gifs", gifs);
        return "favorites";
    }


}
