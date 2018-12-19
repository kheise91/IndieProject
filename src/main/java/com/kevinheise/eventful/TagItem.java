package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Tag item.
 */
@Generated("com.robohorse.robopojogenerator")
public class TagItem{

	@JsonProperty("owner")
	private String owner;

	@JsonProperty("id")
	private String id;

	@JsonProperty("title")
	private String title;

	/**
	 * Set owner.
	 *
	 * @param owner the owner
	 */
	public void setOwner(String owner){
		this.owner = owner;
	}

	/**
	 * Get owner string.
	 *
	 * @return the string
	 */
	public String getOwner(){
		return owner;
	}

	/**
	 * Set id.
	 *
	 * @param id the id
	 */
	public void setId(String id){
		this.id = id;
	}

	/**
	 * Get id string.
	 *
	 * @return the string
	 */
	public String getId(){
		return id;
	}

	/**
	 * Set title.
	 *
	 * @param title the title
	 */
	public void setTitle(String title){
		this.title = title;
	}

	/**
	 * Get title string.
	 *
	 * @return the string
	 */
	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"TagItem{" + 
			"owner = '" + owner + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}