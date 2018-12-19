package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Search.
 */
@Generated("com.robohorse.robopojogenerator")
public class Search{

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

	/**
	 * Set page number.
	 *
	 * @param pageNumber the page number
	 */
	public void setPageNumber(String pageNumber){
		this.pageNumber = pageNumber;
	}

	/**
	 * Get page number string.
	 *
	 * @return the string
	 */
	public String getPageNumber(){
		return pageNumber;
	}

	/**
	 * Set last item.
	 *
	 * @param lastItem the last item
	 */
	public void setLastItem(Object lastItem){
		this.lastItem = lastItem;
	}

	/**
	 * Get last item object.
	 *
	 * @return the object
	 */
	public Object getLastItem(){
		return lastItem;
	}

	/**
	 * Set first item.
	 *
	 * @param firstItem the first item
	 */
	public void setFirstItem(Object firstItem){
		this.firstItem = firstItem;
	}

	/**
	 * Get first item object.
	 *
	 * @return the object
	 */
	public Object getFirstItem(){
		return firstItem;
	}

	/**
	 * Set page items.
	 *
	 * @param pageItems the page items
	 */
	public void setPageItems(Object pageItems){
		this.pageItems = pageItems;
	}

	/**
	 * Get page items object.
	 *
	 * @return the object
	 */
	public Object getPageItems(){
		return pageItems;
	}

	/**
	 * Set total items.
	 *
	 * @param totalItems the total items
	 */
	public void setTotalItems(String totalItems){
		this.totalItems = totalItems;
	}

	/**
	 * Get total items string.
	 *
	 * @return the string
	 */
	public String getTotalItems(){
		return totalItems;
	}

	/**
	 * Set page count.
	 *
	 * @param pageCount the page count
	 */
	public void setPageCount(String pageCount){
		this.pageCount = pageCount;
	}

	/**
	 * Get page count string.
	 *
	 * @return the string
	 */
	public String getPageCount(){
		return pageCount;
	}

	/**
	 * Set events.
	 *
	 * @param events the events
	 */
	public void setEvents(Events events){
		this.events = events;
	}

	/**
	 * Get events events.
	 *
	 * @return the events
	 */
	public Events getEvents(){
		return events;
	}

	/**
	 * Set page size.
	 *
	 * @param pageSize the page size
	 */
	public void setPageSize(String pageSize){
		this.pageSize = pageSize;
	}

	/**
	 * Get page size string.
	 *
	 * @return the string
	 */
	public String getPageSize(){
		return pageSize;
	}

	/**
	 * Set search time.
	 *
	 * @param searchTime the search time
	 */
	public void setSearchTime(String searchTime){
		this.searchTime = searchTime;
	}

	/**
	 * Get search time string.
	 *
	 * @return the string
	 */
	public String getSearchTime(){
		return searchTime;
	}

	@Override
 	public String toString(){
		return 
			"Search{" + 
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