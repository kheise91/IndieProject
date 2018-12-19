package com.kevinheise.eventful;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Categories{

	@JsonProperty("category")
	private List<CategoryItem> category;

	public void setCategory(List<CategoryItem> category){
		this.category = category;
	}

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