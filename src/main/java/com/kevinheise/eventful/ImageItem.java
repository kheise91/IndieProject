package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ImageItem{

	@JsonProperty("small")
	private Small small;

	@JsonProperty("creator")
	private String creator;

	@JsonProperty("thumb")
	private Thumb thumb;

	@JsonProperty("width")
	private String width;

	@JsonProperty("medium")
	private Medium medium;

	@JsonProperty("id")
	private String id;

	@JsonProperty("url")
	private String url;

	@JsonProperty("height")
	private String height;

	public void setSmall(Small small){
		this.small = small;
	}

	public Small getSmall(){
		return small;
	}

	public void setCreator(String creator){
		this.creator = creator;
	}

	public String getCreator(){
		return creator;
	}

	public void setThumb(Thumb thumb){
		this.thumb = thumb;
	}

	public Thumb getThumb(){
		return thumb;
	}

	public void setWidth(String width){
		this.width = width;
	}

	public String getWidth(){
		return width;
	}

	public void setMedium(Medium medium){
		this.medium = medium;
	}

	public Medium getMedium(){
		return medium;
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

	public void setHeight(String height){
		this.height = height;
	}

	public String getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"ImageItem{" + 
			"small = '" + small + '\'' + 
			",creator = '" + creator + '\'' + 
			",thumb = '" + thumb + '\'' + 
			",width = '" + width + '\'' + 
			",medium = '" + medium + '\'' + 
			",id = '" + id + '\'' + 
			",url = '" + url + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}