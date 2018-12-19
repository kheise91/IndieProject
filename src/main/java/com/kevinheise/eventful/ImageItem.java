package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Image item.
 */
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