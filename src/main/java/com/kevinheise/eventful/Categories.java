package com.kevinheise.eventful;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Categories.
 */
@Generated("com.robohorse.robopojogenerator")
public class Categories{

	@JsonProperty("category")
	private List<CategoryItem> category;

	/**
	 * Set category.
	 *
	 * @param category the category
	 */
	public void setCategory(List<CategoryItem> category){
		this.category = category;
	}

	/**
	 * Get category list.
	 *
	 * @return the list
	 */
	public List<CategoryItem> getCategory(){
		return category;
	}

	@Override
 	public String toString(){
		return 
			"Categories{" + 
			"category = '" + category + '\'' + 
			"}";
		}
}