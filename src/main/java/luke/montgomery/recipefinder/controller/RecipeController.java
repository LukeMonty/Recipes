package luke.montgomery.recipefinder.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import luke.montgomery.recipefinder.model.RecipeModel;
import luke.montgomery.recipefinder.repository.RecipeRepository;

@RestController
@RequestMapping("/api")
public class RecipeController {
	
	@Autowired
	RecipeRepository repo;
	
	@GetMapping("/recipe")
	public List<RecipeModel> getAllRecipes(){
		return repo.findAll();
	}
	
	@GetMapping("/recipe/{title}")
	public List<RecipeModel> getRecipeById(@PathVariable("title") String title) {
		return null;
	}

}
