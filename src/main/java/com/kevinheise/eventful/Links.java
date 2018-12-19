package com.kevinheise.eventful;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Links{

	@JsonProperty("link")
	private List<LinkItem> link;

	public void setLink(List<LinkItem> link){
		this.link = link;
	}

	public List<LinkItem> getLink(){
		return link;
	}

	@Override
 	public String toString(){
		return 
			"Links{" + 
			"link = '" + link + '\'' + 
			"}";
		}
}