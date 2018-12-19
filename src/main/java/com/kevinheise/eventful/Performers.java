package com.kevinheise.eventful;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Performers.
 */
@Generated("com.robohorse.robopojogenerator")
public class Performers{

	@JsonProperty("performer")
	private List<PerformerItem> performer;

	/**
	 * Set performer.
	 *
	 * @param performer the performer
	 */
	public void setPerformer(List<PerformerItem> performer){
		this.performer = performer;
	}

	/**
	 * Get performer list.
	 *
	 * @return the list
	 */
	public List<PerformerItem> getPerformer(){
		return performer;
	}

	@Override
 	public String toString(){
		return 
			"Performers{" + 
			"performer = '" + performer + '\'' + 
			"}";
		}
}