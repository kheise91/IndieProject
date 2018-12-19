package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Link item.
 */
@Generated("com.robohorse.robopojogenerator")
public class LinkItem{

	@JsonProperty("description")
	private String description;

	@JsonProperty("time")
	private String time;

	@JsonProperty("id")
	private String id;

	@JsonProperty("type")
	private String type;

	@JsonProperty("url")
	private String url;

	@JsonProperty("username")
	private String username;

	/**
	 * Set description.
	 *
	 * @param description the description
	 */
	public void setDescription(String description){
		this.description = description;
	}

	/**
	 * Get description string.
	 *
	 * @return the string
	 */
	public String getDescription(){
		return description;
	}

	/**
	 * Set time.
	 *
	 * @param time the time
	 */
	public void setTime(String time){
		this.time = time;
	}

	/**
	 * Get time string.
	 *
	 * @return the string
	 */
	public String getTime(){
		return time;
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
	 * Set type.
	 *
	 * @param type the type
	 */
	public void setType(String type){
		this.type = type;
	}

	/**
	 * Get type string.
	 *
	 * @return the string
	 */
	public String getType(){
		return type;
	}

	/**
	 * Set url.
	 *
	 * @param url the url
	 */
	public void setUrl(String url){
		this.url = url;
	}

	/**
	 * Get url string.
	 *
	 * @return the string
	 */
	public String getUrl(){
		return url;
	}

	/**
	 * Set username.
	 *
	 * @param username the username
	 */
	public void setUsername(String username){
		this.username = username;
	}

	/**
	 * Get username string.
	 *
	 * @return the string
	 */
	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"LinkItem{" + 
			"description = '" + description + '\'' + 
			",time = '" + time + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			",url = '" + url + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}