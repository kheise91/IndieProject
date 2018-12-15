package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class SearchResults{

	@JsonProperty("page_number")
	private String pageNumber;

	@JsonProperty("last_item")
	private Object lastItem;

	@JsonProperty("first_item")
	private Object firstItem;

	@JsonProperty("page_items")
	private Object pageItems;

	@JsonProperty("total_items")
	private String totalItems;

	@JsonProperty("page_count")
	private String pageCount;

	@JsonProperty("events")
	private Events events;

	@JsonProperty("page_size")
	private String pageSize;

	@JsonProperty("search_time")
	private String searchTime;

	public void setPageNumber(String pageNumber){
		this.pageNumber = pageNumber;
	}

	public String getPageNumber(){
		return pageNumber;
	}

	public void setLastItem(Object lastItem){
		this.lastItem = lastItem;
	}

	public Object getLastItem(){
		return lastItem;
	}

	public void setFirstItem(Object firstItem){
		this.firstItem = firstItem;
	}

	public Object getFirstItem(){
		return firstItem;
	}

	public void setPageItems(Object pageItems){
		this.pageItems = pageItems;
	}

	public Object getPageItems(){
		return pageItems;
	}

	public void setTotalItems(String totalItems){
		this.totalItems = totalItems;
	}

	public String getTotalItems(){
		return totalItems;
	}

	public void setPageCount(String pageCount){
		this.pageCount = pageCount;
	}

	public String getPageCount(){
		return pageCount;
	}

	public void setEvents(Events events){
		this.events = events;
	}

	public Events getEvents(){
		return events;
	}

	public void setPageSize(String pageSize){
		this.pageSize = pageSize;
	}

	public String getPageSize(){
		return pageSize;
	}

	public void setSearchTime(String searchTime){
		this.searchTime = searchTime;
	}

	public String getSearchTime(){
		return searchTime;
	}

	@Override
 	public String toString(){
		return 
			"SearchResults{" + 
			"page_number = '" + pageNumber + '\'' + 
			",last_item = '" + lastItem + '\'' + 
			",first_item = '" + firstItem + '\'' + 
			",page_items = '" + pageItems + '\'' + 
			",total_items = '" + totalItems + '\'' + 
			",page_count = '" + pageCount + '\'' + 
			",events = '" + events + '\'' + 
			",page_size = '" + pageSize + '\'' + 
			",search_time = '" + searchTime + '\'' + 
			"}";
		}
}