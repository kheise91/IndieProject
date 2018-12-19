package com.kevinheise.eventful;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Events.
 */
@Generated("com.robohorse.robopojogenerator")
public class Events{

	@JsonProperty("event")
	private List<EventItem> event;

	/**
	 * Set event.
	 *
	 * @param event the event
	 */
	public void setEvent(List<EventItem> event){
		this.event = event;
	}

	/**
	 * Get event list.
	 *
	 * @return the list
	 */
	public List<EventItem> getEvent(){
		return event;
	}

	@Override
 	public String toString(){
		return 
			"Events{" + 
			"event = '" + event + '\'' + 
			"}";
		}
}