package pl.akademiakodu.demokwejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.akademiakodu.demokwejk.data.CategoryRepository;
import pl.akademiakodu.demokwejk.data.GifRepsitory;
import pl.akademiakodu.demokwejk.model.Category;
import pl.akademiakodu.demokwejk.model.Gif;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    GifRepsitory gifRepsitory;

    @RequestMapping("/categories")
    public String gifCategories(ModelMap modelMap){
        List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String gifCategory(@PathVariable int id, ModelMap modelMap){
        List<Gif> gifs = gifRepsitory.getbyID(id);
        modelMap.put("gifs", gifs);
        modelMap.put("category", categoryRepository.getCategoryById(id));
        return "category";
    }

}
