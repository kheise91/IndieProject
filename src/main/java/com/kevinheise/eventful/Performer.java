package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Performer{

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

	public void setLinker(String linker){
		this.linker = linker;
	}

	public String getLinker(){
		return linker;
	}

	public void setCreator(String creator){
		this.creator = creator;
	}

	public String getCreator(){
		return creator;
	}

	public void setShortBio(String shortBio){
		this.shortBio = shortBio;
	}

	public String getShortBio(){
		return shortBio;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"Performer{" + 
			"linker = '" + linker + '\'' + 
			",creator = '" + creator + '\'' + 
			",short_bio = '" + shortBio + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}