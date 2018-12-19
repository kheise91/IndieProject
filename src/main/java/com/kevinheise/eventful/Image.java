package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Image.
 */
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

	/**
	 * Set small.
	 *
	 * @param small the small
	 */
	public void setSmall(Small small){
		this.small = small;
	}

	/**
	 * Get small small.
	 *
	 * @return the small
	 */
	public Small getSmall(){
		return small;
	}

	/**
	 * Set thumb.
	 *
	 * @param thumb the thumb
	 */
	public void setThumb(Thumb thumb){
		this.thumb = thumb;
	}

	/**
	 * Get thumb thumb.
	 *
	 * @return the thumb
	 */
	public Thumb getThumb(){
		return thumb;
	}

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
	 * Set caption.
	 *
	 * @param caption the caption
	 */
	public void setCaption(Object caption){
		this.caption = caption;
	}

	/**
	 * Get caption object.
	 *
	 * @return the object
	 */
	public Object getCaption(){
		return caption;
	}

	/**
	 * Set medium.
	 *
	 * @param medium the medium
	 */
	public void setMedium(Medium medium){
		this.medium = medium;
	}

	/**
	 * Get medium medium.
	 *
	 * @return the medium
	 */
	public Medium getMedium(){
		return medium;
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