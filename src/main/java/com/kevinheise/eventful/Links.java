package com.kevinheise.eventful;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Links.
 */
@Generated("com.robohorse.robopojogenerator")
public class Links{

	@JsonProperty("link")
	private List<LinkItem> link;

	/**
	 * Set link.
	 *
	 * @param link the link
	 */
	public void setLink(List<LinkItem> link){
		this.link = link;
	}

	/**
	 * Get link list.
	 *
	 * @return the list
	 */
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