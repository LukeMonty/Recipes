package luke.montgomery.recipefinder.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recipe")
public class RecipeModel implements Serializable {
	
	private String title;
	private String instructions;
	private String[] ingredients;
	private String pictureLink;
	
	public String getPictureLink() {
		return pictureLink;
	}
	public void setPictureLink(String pictureLink) {
		this.pictureLink = pictureLink;
	}
	public RecipeModel() {}
	public RecipeModel(String title, String instructions, String[] ingredients, String pictureLink) {
		this.title = title;
		this.instructions = instructions;
		this.ingredients = ingredients;
		this.pictureLink = pictureLink;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public String[] getIngredients() {
		return ingredients;
	}
	public void setIngredients(String[] ingredients) {
		this.ingredients = ingredients;
	}
	
}
