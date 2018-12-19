package com.kevinheise.eventful;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Tags{

	@JsonProperty("tag")
	private List<TagItem> tag;

	public void setTag(List<TagItem> tag){
		this.tag = tag;
	}

	public List<TagItem> getTag(){
		return tag;
	}

	@Override
 	public String toString(){
		return 
			"Tags{" + 
			"tag = '" + tag + '\'' + 
			"}";
		}
}