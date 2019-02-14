package luke.montgomery.recipefinder.repository;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import luke.montgomery.recipefinder.model.RecipeModel;

@Repository
//@Profile("mongodb")
public interface RecipeRepository extends MongoRepository<RecipeModel, String>{
	List<RecipeModel> findByIngredients(String ingredients);
//	List<RecipeModel> findByTitle(String title);
	RecipeModel findByTitle(String title);
}
