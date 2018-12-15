package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Image{

	@JsonProperty("small")
	private Small small;

	@JsonProperty("thumb")
	private Thumb thumb;

	@JsonProperty("width")
	private String width;

	@JsonProperty("caption")
	private Object caption;

	@JsonProperty("medium")
	private Medium medium;

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

	public void setCaption(Object caption){
		this.caption = caption;
	}

	public Object getCaption(){
		return caption;
	}

	public void setMedium(Medium medium){
		this.medium = medium;
	}

	public Medium getMedium(){
		return medium;
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
			"Image{" + 
			"small = '" + small + '\'' + 
			",thumb = '" + thumb + '\'' + 
			",width = '" + width + '\'' + 
			",caption = '" + caption + '\'' + 
			",medium = '" + medium + '\'' + 
			",url = '" + url + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}