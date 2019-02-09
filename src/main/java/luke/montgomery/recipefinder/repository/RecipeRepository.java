package luke.montgomery.recipefinder.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import luke.montgomery.recipefinder.model.RecipeModel;

@Repository

public interface RecipeRepository extends MongoRepository<RecipeModel, String>{

}
