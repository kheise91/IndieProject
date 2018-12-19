package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Performer item.
 */
@Generated("com.robohorse.robopojogenerator")
public class PerformerItem{

	@JsonProperty("linker")
	private String linker;

	@JsonProperty("creator")
	private String creator;

	@JsonProperty("short_bio")
	private String shortBio;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private String id;

	@JsonProperty("url")
	private String url;

	/**
	 * Set linker.
	 *
	 * @param linker the linker
	 */
	public void setLinker(String linker){
		this.linker = linker;
	}

	/**
	 * Get linker string.
	 *
	 * @return the string
	 */
	public String getLinker(){
		return linker;
	}

	/**
	 * Set creator.
	 *
	 * @param creator the creator
	 */
	public void setCreator(String creator){
		this.creator = creator;
	}

	/**
	 * Get creator string.
	 *
	 * @return the string
	 */
	public String getCreator(){
		return creator;
	}

	/**
	 * Set short bio.
	 *
	 * @param shortBio the short bio
	 */
	public void setShortBio(String shortBio){
		this.shortBio = shortBio;
	}

	/**
	 * Get short bio string.
	 *
	 * @return the string
	 */
	public String getShortBio(){
		return shortBio;
	}

	/**
	 * Set name.
	 *
	 * @param name the name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Get name string.
	 *
	 * @return the string
	 */
	public String getName(){
		return name;
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

	@Override
 	public String toString(){
		return 
			"PerformerItem{" + 
			"linker = '" + linker + '\'' + 
			",creator = '" + creator + '\'' + 
			",short_bio = '" + shortBio + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}