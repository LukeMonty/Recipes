package luke.montgomery.recipefinder.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import luke.montgomery.recipefinder.model.RecipeModel;
import luke.montgomery.recipefinder.repository.RecipeRepository;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class RecipeController {
	
	@Autowired
	private RecipeRepository repo;
	
	
	@GetMapping("/recipe")
	public @ResponseBody List<RecipeModel> getAllRecipes(){
		return repo.findAll();
	}
	@PostMapping("/recipe")
	public RecipeModel addReicpe(@Valid @RequestBody RecipeModel recipe) {
		return repo.save(recipe);
	}
	
	@GetMapping("/recipe/title/{title}")
	public RecipeModel getByTitle(@PathVariable("title") String title) {
		return repo.findByTitle(title);
	}
	
	
}
