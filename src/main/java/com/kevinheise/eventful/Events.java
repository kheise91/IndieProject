package com.kevinheise.eventful;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Events{

	@JsonProperty("event")
	private List<EventItem> event;

	public void setEvent(List<EventItem> event){
		this.event = event;
	}

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