package luke.montgomery.recipefinder.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RecipeModel {
	
	@Id
	private String _id;
	private String title;
	private String instructions;
	private List<String> ingredients;
	
	public RecipeModel() {}
	public RecipeModel(String _id, String title, String instructions, List<String> ingredients) {
		this._id = _id;
		this.title = title;
		this.instructions = instructions;
		this.ingredients = ingredients;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
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
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
}
