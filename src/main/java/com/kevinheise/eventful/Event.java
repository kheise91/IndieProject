package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.LocalDateTime;

@Generated("com.robohorse.robopojogenerator")
public class Event {

	@JsonProperty("country")
	private String country;

	@JsonProperty("withdrawn")
	private String withdrawn;

	@JsonProperty("children")
	private Object children;

	@JsonProperty("venue_type")
	private String venueType;

	@JsonProperty("price")
	private String price;

	@JsonProperty("modified")
	private String modified;

	@JsonProperty("links")
	private Links links;

	@JsonProperty("id")
	private String id;

	@JsonProperty("venue_id")
	private String venueId;

	@JsonProperty("longitude")
	private String longitude;

	@JsonProperty("images")
	private Object images;

	@JsonProperty("going")
	private Object going;

	@JsonProperty("created")
	private String created;

	@JsonProperty("tags")
	private Tags tags;

	@JsonProperty("recurrence")
	private Object recurrence;

	@JsonProperty("start_time")
	private LocalDateTime startTime;

	@JsonProperty("region_abbr")
	private String regionAbbr;

	@JsonProperty("country_abbr2")
	private String countryAbbr2;

	@JsonProperty("region")
	private String region;

	@JsonProperty("parents")
	private Object parents;

	@JsonProperty("venue_name")
	private String venueName;

	@JsonProperty("stop_time")
	private Object stopTime;

	@JsonProperty("geocode_type")
	private String geocodeType;

	@JsonProperty("city")
	private String city;

	@JsonProperty("trackbacks")
	private Object trackbacks;

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("privacy")
	private String privacy;

	@JsonProperty("description")
	private String description;

	@JsonProperty("title")
	private String title;

	@JsonProperty("withdrawn_note")
	private Object withdrawnNote;

	@JsonProperty("tz_olson_path")
	private Object tzOlsonPath;

	@JsonProperty("tz_country")
	private Object tzCountry;

	@JsonProperty("all_day")
	private String allDay;

	@JsonProperty("olson_path")
	private String olsonPath;

	@JsonProperty("categories")
	private Categories categories;

	@JsonProperty("free")
	private Object free;

	@JsonProperty("owner")
	private String owner;

	@JsonProperty("comments")
	private Object comments;

	@JsonProperty("address")
	private String address;

	@JsonProperty("performers")
	private Object performers;

	@JsonProperty("groups")
	private Object groups;

	@JsonProperty("url")
	private String url;

	@JsonProperty("tz_id")
	private Object tzId;

	@JsonProperty("tz_city")
	private Object tzCity;

	@JsonProperty("calendars")
	private Object calendars;

	@JsonProperty("venue_display")
	private String venueDisplay;

	@JsonProperty("postal_code")
	private String postalCode;

	@JsonProperty("country_abbr")
	private String countryAbbr;

	@JsonProperty("properties")
	private Object properties;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setWithdrawn(String withdrawn){
		this.withdrawn = withdrawn;
	}

	public String getWithdrawn(){
		return withdrawn;
	}

	public void setChildren(Object children){
		this.children = children;
	}

	public Object getChildren(){
		return children;
	}

	public void setVenueType(String venueType){
		this.venueType = venueType;
	}

	public String getVenueType(){
		return venueType;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setModified(String modified){
		this.modified = modified;
	}

	public String getModified(){
		return modified;
	}

	public void setLinks(Links links){
		this.links = links;
	}

	public Links getLinks(){
		return links;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setVenueId(String venueId){
		this.venueId = venueId;
	}

	public String getVenueId(){
		return venueId;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	public void setImages(Object images){
		this.images = images;
	}

	public Object getImages(){
		return images;
	}

	public void setGoing(Object going){
		this.going = going;
	}

	public Object getGoing(){
		return going;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setTags(Tags tags){
		this.tags = tags;
	}

	public Tags getTags(){
		return tags;
	}

	public void setRecurrence(Object recurrence){
		this.recurrence = recurrence;
	}

	public Object getRecurrence(){
		return recurrence;
	}

	public void setStartTime(LocalDateTime startTime){
		this.startTime = startTime;
	}

	public LocalDateTime getStartTime(){
		return startTime;
	}

	public void setRegionAbbr(String regionAbbr){
		this.regionAbbr = regionAbbr;
	}

	public String getRegionAbbr(){
		return regionAbbr;
	}

	public void setCountryAbbr2(String countryAbbr2){
		this.countryAbbr2 = countryAbbr2;
	}

	public String getCountryAbbr2(){
		return countryAbbr2;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	public void setParents(Object parents){
		this.parents = parents;
	}

	public Object getParents(){
		return parents;
	}

	public void setVenueName(String venueName){
		this.venueName = venueName;
	}

	public String getVenueName(){
		return venueName;
	}

	public void setStopTime(Object stopTime){
		this.stopTime = stopTime;
	}

	public Object getStopTime(){
		return stopTime;
	}

	public void setGeocodeType(String geocodeType){
		this.geocodeType = geocodeType;
	}

	public String getGeocodeType(){
		return geocodeType;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setTrackbacks(Object trackbacks){
		this.trackbacks = trackbacks;
	}

	public Object getTrackbacks(){
		return trackbacks;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setPrivacy(String privacy){
		this.privacy = privacy;
	}

	public String getPrivacy(){
		return privacy;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setWithdrawnNote(Object withdrawnNote){
		this.withdrawnNote = withdrawnNote;
	}

	public Object getWithdrawnNote(){
		return withdrawnNote;
	}

	public void setTzOlsonPath(Object tzOlsonPath){
		this.tzOlsonPath = tzOlsonPath;
	}

	public Object getTzOlsonPath(){
		return tzOlsonPath;
	}

	public void setTzCountry(Object tzCountry){
		this.tzCountry = tzCountry;
	}

	public Object getTzCountry(){
		return tzCountry;
	}

	public void setAllDay(String allDay){
		this.allDay = allDay;
	}

	public String getAllDay(){
		return allDay;
	}

	public void setOlsonPath(String olsonPath){
		this.olsonPath = olsonPath;
	}

	public String getOlsonPath(){
		return olsonPath;
	}

	public void setCategories(Categories categories){
		this.categories = categories;
	}

	public Categories getCategories(){
		return categories;
	}

	public void setFree(Object free){
		this.free = free;
	}

	public Object getFree(){
		return free;
	}

	public void setOwner(String owner){
		this.owner = owner;
	}

	public String getOwner(){
		return owner;
	}

	public void setComments(Object comments){
		this.comments = comments;
	}

	public Object getComments(){
		return comments;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setPerformers(Object performers){
		this.performers = performers;
	}

	public Object getPerformers(){
		return performers;
	}

	public void setGroups(Object groups){
		this.groups = groups;
	}

	public Object getGroups(){
		return groups;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setTzId(Object tzId){
		this.tzId = tzId;
	}

	public Object getTzId(){
		return tzId;
	}

	public void setTzCity(Object tzCity){
		this.tzCity = tzCity;
	}

	public Object getTzCity(){
		return tzCity;
	}

	public void setCalendars(Object calendars){
		this.calendars = calendars;
	}

	public Object getCalendars(){
		return calendars;
	}

	public void setVenueDisplay(String venueDisplay){
		this.venueDisplay = venueDisplay;
	}

	public String getVenueDisplay(){
		return venueDisplay;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setCountryAbbr(String countryAbbr){
		this.countryAbbr = countryAbbr;
	}

	public String getCountryAbbr(){
		return countryAbbr;
	}

	public void setProperties(Object properties){
		this.properties = properties;
	}

	public Object getProperties(){
		return properties;
	}

	@Override
 	public String toString(){
		return 
			"Event{" +
			"country = '" + country + '\'' + 
			",withdrawn = '" + withdrawn + '\'' + 
			",children = '" + children + '\'' + 
			",venue_type = '" + venueType + '\'' + 
			",price = '" + price + '\'' + 
			",modified = '" + modified + '\'' + 
			",links = '" + links + '\'' + 
			",id = '" + id + '\'' + 
			",venue_id = '" + venueId + '\'' + 
			",longitude = '" + longitude + '\'' + 
			",images = '" + images + '\'' + 
			",going = '" + going + '\'' + 
			",created = '" + created + '\'' + 
			",tags = '" + tags + '\'' + 
			",recurrence = '" + recurrence + '\'' + 
			",start_time = '" + startTime + '\'' + 
			",region_abbr = '" + regionAbbr + '\'' + 
			",country_abbr2 = '" + countryAbbr2 + '\'' + 
			",region = '" + region + '\'' + 
			",parents = '" + parents + '\'' + 
			",venue_name = '" + venueName + '\'' + 
			",stop_time = '" + stopTime + '\'' + 
			",geocode_type = '" + geocodeType + '\'' + 
			",city = '" + city + '\'' + 
			",trackbacks = '" + trackbacks + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",privacy = '" + privacy + '\'' + 
			",description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			",withdrawn_note = '" + withdrawnNote + '\'' + 
			",tz_olson_path = '" + tzOlsonPath + '\'' + 
			",tz_country = '" + tzCountry + '\'' + 
			",all_day = '" + allDay + '\'' + 
			",olson_path = '" + olsonPath + '\'' + 
			",categories = '" + categories + '\'' + 
			",free = '" + free + '\'' + 
			",owner = '" + owner + '\'' + 
			",comments = '" + comments + '\'' + 
			",address = '" + address + '\'' + 
			",performers = '" + performers + '\'' + 
			",groups = '" + groups + '\'' + 
			",url = '" + url + '\'' + 
			",tz_id = '" + tzId + '\'' + 
			",tz_city = '" + tzCity + '\'' + 
			",calendars = '" + calendars + '\'' + 
			",venue_display = '" + venueDisplay + '\'' + 
			",postal_code = '" + postalCode + '\'' + 
			",country_abbr = '" + countryAbbr + '\'' + 
			",properties = '" + properties + '\'' + 
			"}";
		}
}