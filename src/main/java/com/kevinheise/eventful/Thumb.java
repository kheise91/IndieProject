package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Thumb.
 */
@Generated("com.robohorse.robopojogenerator")
public class Thumb{

	@JsonProperty("width")
	private String width;

	@JsonProperty("url")
	private String url;

	@JsonProperty("height")
	private String height;

	/**
	 * Set width.
	 *
	 * @param width the width
	 */
	public void setWidth(String width){
		this.width = width;
	}

	/**
	 * Get width string.
	 *
	 * @return the string
	 */
	public String getWidth(){
		return width;
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
	 * Set height.
	 *
	 * @param height the height
	 */
	public void setHeight(String height){
		this.height = height;
	}

	/**
	 * Get height string.
	 *
	 * @return the string
	 */
	public String getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"Thumb{" + 
			"width = '" + width + '\'' + 
			",url = '" + url + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}