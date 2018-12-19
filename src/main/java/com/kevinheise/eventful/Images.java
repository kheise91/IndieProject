package com.kevinheise.eventful;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Images.
 */
@Generated("com.robohorse.robopojogenerator")
public class Images{

	@JsonProperty("image")
	private List<ImageItem> image;

	/**
	 * Set image.
	 *
	 * @param image the image
	 */
	public void setImage(List<ImageItem> image){
		this.image = image;
	}

	/**
	 * Get image list.
	 *
	 * @return the list
	 */
	public List<ImageItem> getImage(){
		return image;
	}

	@Override
 	public String toString(){
		return 
			"Images{" + 
			"image = '" + image + '\'' + 
			"}";
		}
}