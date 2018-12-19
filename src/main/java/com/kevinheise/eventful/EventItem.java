package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The type Event item.
 */
@Generated("com.robohorse.robopojogenerator")
public class EventItem{

	@JsonProperty("comment_count")
	private Object commentCount;

	@JsonProperty("venue_name")
	private String venueName;

	@JsonProperty("stop_time")
	private Object stopTime;

	@JsonProperty("geocode_type")
	private String geocodeType;

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("link_count")
	private Object linkCount;

	@JsonProperty("privacy")
	private String privacy;

	@JsonProperty("description")
	private Object description;

	@JsonProperty("title")
	private String title;

	@JsonProperty("city_name")
	private String cityName;

	@JsonProperty("venue_address")
	private String venueAddress;

	@JsonProperty("tz_olson_path")
	private Object tzOlsonPath;

	@JsonProperty("tz_country")
	private Object tzCountry;

	@JsonProperty("all_day")
	private String allDay;

	@JsonProperty("country_name")
	private String countryName;

	@JsonProperty("modified")
	private String modified;

	@JsonProperty("olson_path")
	private String olsonPath;

	@JsonProperty("region_name")
	private String regionName;

	@JsonProperty("id")
	private String id;

	@JsonProperty("going_count")
	private Object goingCount;

	@JsonProperty("venue_id")
	private String venueId;

	@JsonProperty("longitude")
	private String longitude;

	@JsonProperty("owner")
	private String owner;

	@JsonProperty("image")
	private Image image;

	@JsonProperty("performers")
	private Performers performers;

	@JsonProperty("going")
	private Object going;

	@JsonProperty("created")
	private String created;

	@JsonProperty("groups")
	private Object groups;

	@JsonProperty("recur_string")
	private Object recurString;

	@JsonProperty("venue_url")
	private String venueUrl;

	@JsonProperty("url")
	private String url;

	@JsonProperty("tz_id")
	private Object tzId;

	@JsonProperty("tz_city")
	private Object tzCity;

	@JsonProperty("start_time")
	private LocalDateTime startTime;

	@JsonProperty("calendar_count")
	private Object calendarCount;

	@JsonProperty("calendars")
	private Object calendars;

	@JsonProperty("venue_display")
	private String venueDisplay;

	@JsonProperty("region_abbr")
	private String regionAbbr;

	@JsonProperty("country_abbr2")
	private String countryAbbr2;

	@JsonProperty("postal_code")
	private String postalCode;

	@JsonProperty("country_abbr")
	private String countryAbbr;

	@JsonProperty("watching_count")
	private Object watchingCount;

	/**
	 * Set comment count.
	 *
	 * @param commentCount the comment count
	 */
	public void setCommentCount(Object commentCount){
		this.commentCount = commentCount;
	}

	/**
	 * Get comment count object.
	 *
	 * @return the object
	 */
	public Object getCommentCount(){
		return commentCount;
	}

	/**
	 * Set venue name.
	 *
	 * @param venueName the venue name
	 */
	public void setVenueName(String venueName){
		this.venueName = venueName;
	}

	/**
	 * Get venue name string.
	 *
	 * @return the string
	 */
	public String getVenueName(){
		return venueName;
	}

	/**
	 * Set stop time.
	 *
	 * @param stopTime the stop time
	 */
	public void setStopTime(Object stopTime){
		this.stopTime = stopTime;
	}

	/**
	 * Get stop time object.
	 *
	 * @return the object
	 */
	public Object getStopTime(){
		return stopTime;
	}

	/**
	 * Set geocode type.
	 *
	 * @param geocodeType the geocode type
	 */
	public void setGeocodeType(String geocodeType){
		this.geocodeType = geocodeType;
	}

	/**
	 * Get geocode type string.
	 *
	 * @return the string
	 */
	public String getGeocodeType(){
		return geocodeType;
	}

	/**
	 * Set latitude.
	 *
	 * @param latitude the latitude
	 */
	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	/**
	 * Get latitude string.
	 *
	 * @return the string
	 */
	public String getLatitude(){
		return latitude;
	}

	/**
	 * Set link count.
	 *
	 * @param linkCount the link count
	 */
	public void setLinkCount(Object linkCount){
		this.linkCount = linkCount;
	}

	/**
	 * Get link count object.
	 *
	 * @return the object
	 */
	public Object getLinkCount(){
		return linkCount;
	}

	/**
	 * Set privacy.
	 *
	 * @param privacy the privacy
	 */
	public void setPrivacy(String privacy){
		this.privacy = privacy;
	}

	/**
	 * Get privacy string.
	 *
	 * @return the string
	 */
	public String getPrivacy(){
		return privacy;
	}

	/**
	 * Set description.
	 *
	 * @param description the description
	 */
	public void setDescription(Object description){
		this.description = description;
	}

	/**
	 * Get description object.
	 *
	 * @return the object
	 */
	public Object getDescription(){
		return description;
	}

	/**
	 * Set title.
	 *
	 * @param title the title
	 */
	public void setTitle(String title){
		this.title = title;
	}

	/**
	 * Get title string.
	 *
	 * @return the string
	 */
	public String getTitle(){
		return title;
	}

	/**
	 * Set city name.
	 *
	 * @param cityName the city name
	 */
	public void setCityName(String cityName){
		this.cityName = cityName;
	}

	/**
	 * Get city name string.
	 *
	 * @return the string
	 */
	public String getCityName(){
		return cityName;
	}

	/**
	 * Set venue address.
	 *
	 * @param venueAddress the venue address
	 */
	public void setVenueAddress(String venueAddress){
		this.venueAddress = venueAddress;
	}

	/**
	 * Get venue address string.
	 *
	 * @return the string
	 */
	public String getVenueAddress(){
		return venueAddress;
	}

	/**
	 * Set tz olson path.
	 *
	 * @param tzOlsonPath the tz olson path
	 */
	public void setTzOlsonPath(Object tzOlsonPath){
		this.tzOlsonPath = tzOlsonPath;
	}

	/**
	 * Get tz olson path object.
	 *
	 * @return the object
	 */
	public Object getTzOlsonPath(){
		return tzOlsonPath;
	}

	/**
	 * Set tz country.
	 *
	 * @param tzCountry the tz country
	 */
	public void setTzCountry(Object tzCountry){
		this.tzCountry = tzCountry;
	}

	/**
	 * Get tz country object.
	 *
	 * @return the object
	 */
	public Object getTzCountry(){
		return tzCountry;
	}

	/**
	 * Set all day.
	 *
	 * @param allDay the all day
	 */
	public void setAllDay(String allDay){
		this.allDay = allDay;
	}

	/**
	 * Get all day string.
	 *
	 * @return the string
	 */
	public String getAllDay(){
		return allDay;
	}

	/**
	 * Set country name.
	 *
	 * @param countryName the country name
	 */
	public void setCountryName(String countryName){
		this.countryName = countryName;
	}

	/**
	 * Get country name string.
	 *
	 * @return the string
	 */
	public String getCountryName(){
		return countryName;
	}

	/**
	 * Set modified.
	 *
	 * @param modified the modified
	 */
	public void setModified(String modified){
		this.modified = modified;
	}

	/**
	 * Get modified string.
	 *
	 * @return the string
	 */
	public String getModified(){
		return modified;
	}

	/**
	 * Set olson path.
	 *
	 * @param olsonPath the olson path
	 */
	public void setOlsonPath(String olsonPath){
		this.olsonPath = olsonPath;
	}

	/**
	 * Get olson path string.
	 *
	 * @return the string
	 */
	public String getOlsonPath(){
		return olsonPath;
	}

	/**
	 * Set region name.
	 *
	 * @param regionName the region name
	 */
	public void setRegionName(String regionName){
		this.regionName = regionName;
	}

	/**
	 * Get region name string.
	 *
	 * @return the string
	 */
	public String getRegionName(){
		return regionName;
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
	 * Set going count.
	 *
	 * @param goingCount the going count
	 */
	public void setGoingCount(Object goingCount){
		this.goingCount = goingCount;
	}

	/**
	 * Get going count object.
	 *
	 * @return the object
	 */
	public Object getGoingCount(){
		return goingCount;
	}

	/**
	 * Set venue id.
	 *
	 * @param venueId the venue id
	 */
	public void setVenueId(String venueId){
		this.venueId = venueId;
	}

	/**
	 * Get venue id string.
	 *
	 * @return the string
	 */
	public String getVenueId(){
		return venueId;
	}

	/**
	 * Set longitude.
	 *
	 * @param longitude the longitude
	 */
	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	/**
	 * Get longitude string.
	 *
	 * @return the string
	 */
	public String getLongitude(){
		return longitude;
	}

	/**
	 * Set owner.
	 *
	 * @param owner the owner
	 */
	public void setOwner(String owner){
		this.owner = owner;
	}

	/**
	 * Get owner string.
	 *
	 * @return the string
	 */
	public String getOwner(){
		return owner;
	}

	/**
	 * Set image.
	 *
	 * @param image the image
	 */
	public void setImage(Image image){
		this.image = image;
	}

	/**
	 * Get image image.
	 *
	 * @return the image
	 */
	public Image getImage(){
		return image;
	}

	/**
	 * Set performers.
	 *
	 * @param performers the performers
	 */
	public void setPerformers(Performers performers){
		this.performers = performers;
	}

	/**
	 * Get performers performers.
	 *
	 * @return the performers
	 */
	public Performers getPerformers(){
		return performers;
	}

	/**
	 * Set going.
	 *
	 * @param going the going
	 */
	public void setGoing(Object going){
		this.going = going;
	}

	/**
	 * Get going object.
	 *
	 * @return the object
	 */
	public Object getGoing(){
		return going;
	}

	/**
	 * Set created.
	 *
	 * @param created the created
	 */
	public void setCreated(String created){
		this.created = created;
	}

	/**
	 * Get created string.
	 *
	 * @return the string
	 */
	public String getCreated(){
		return created;
	}

	/**
	 * Set groups.
	 *
	 * @param groups the groups
	 */
	public void setGroups(Object groups){
		this.groups = groups;
	}

	/**
	 * Get groups object.
	 *
	 * @return the object
	 */
	public Object getGroups(){
		return groups;
	}

	/**
	 * Set recur string.
	 *
	 * @param recurString the recur string
	 */
	public void setRecurString(Object recurString){
		this.recurString = recurString;
	}

	/**
	 * Get recur string object.
	 *
	 * @return the object
	 */
	public Object getRecurString(){
		return recurString;
	}

	/**
	 * Set venue url.
	 *
	 * @param venueUrl the venue url
	 */
	public void setVenueUrl(String venueUrl){
		this.venueUrl = venueUrl;
	}

	/**
	 * Get venue url string.
	 *
	 * @return the string
	 */
	public String getVenueUrl(){
		return venueUrl;
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
	 * Set tz id.
	 *
	 * @param tzId the tz id
	 */
	public void setTzId(Object tzId){
		this.tzId = tzId;
	}

	/**
	 * Get tz id object.
	 *
	 * @return the object
	 */
	public Object getTzId(){
		return tzId;
	}

	/**
	 * Set tz city.
	 *
	 * @param tzCity the tz city
	 */
	public void setTzCity(Object tzCity){
		this.tzCity = tzCity;
	}

	/**
	 * Get tz city object.
	 *
	 * @return the object
	 */
	public Object getTzCity(){
		return tzCity;
	}

	/**
	 * Set start time.
	 *
	 * @param startTime the start time
	 */
	public void setStartTime(String startTime){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		this.startTime = LocalDateTime.parse(startTime, formatter);
	}

	/**
	 * Get start time local date time.
	 *
	 * @return the local date time
	 */
	public LocalDateTime getStartTime(){
		return startTime;
	}

	/**
	 * Set calendar count.
	 *
	 * @param calendarCount the calendar count
	 */
	public void setCalendarCount(Object calendarCount){
		this.calendarCount = calendarCount;
	}

	/**
	 * Get calendar count object.
	 *
	 * @return the object
	 */
	public Object getCalendarCount(){
		return calendarCount;
	}

	/**
	 * Set calendars.
	 *
	 * @param calendars the calendars
	 */
	public void setCalendars(Object calendars){
		this.calendars = calendars;
	}

	/**
	 * Get calendars object.
	 *
	 * @return the object
	 */
	public Object getCalendars(){
		return calendars;
	}

	/**
	 * Set venue display.
	 *
	 * @param venueDisplay the venue display
	 */
	public void setVenueDisplay(String venueDisplay){
		this.venueDisplay = venueDisplay;
	}

	/**
	 * Get venue display string.
	 *
	 * @return the string
	 */
	public String getVenueDisplay(){
		return venueDisplay;
	}

	/**
	 * Set region abbr.
	 *
	 * @param regionAbbr the region abbr
	 */
	public void setRegionAbbr(String regionAbbr){
		this.regionAbbr = regionAbbr;
	}

	/**
	 * Get region abbr string.
	 *
	 * @return the string
	 */
	public String getRegionAbbr(){
		return regionAbbr;
	}

	/**
	 * Set country abbr 2.
	 *
	 * @param countryAbbr2 the country abbr 2
	 */
	public void setCountryAbbr2(String countryAbbr2){
		this.countryAbbr2 = countryAbbr2;
	}

	/**
	 * Get country abbr 2 string.
	 *
	 * @return the string
	 */
	public String getCountryAbbr2(){
		return countryAbbr2;
	}

	/**
	 * Set postal code.
	 *
	 * @param postalCode the postal code
	 */
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	/**
	 * Get postal code string.
	 *
	 * @return the string
	 */
	public String getPostalCode(){
		return postalCode;
	}

	/**
	 * Set country abbr.
	 *
	 * @param countryAbbr the country abbr
	 */
	public void setCountryAbbr(String countryAbbr){
		this.countryAbbr = countryAbbr;
	}

	/**
	 * Get country abbr string.
	 *
	 * @return the string
	 */
	public String getCountryAbbr(){
		return countryAbbr;
	}

	/**
	 * Set watching count.
	 *
	 * @param watchingCount the watching count
	 */
	public void setWatchingCount(Object watchingCount){
		this.watchingCount = watchingCount;
	}

	/**
	 * Get watching count object.
	 *
	 * @return the object
	 */
	public Object getWatchingCount(){
		return watchingCount;
	}

	@Override
 	public String toString(){
		return 
			"EventItem{" + 
			"comment_count = '" + commentCount + '\'' + 
			",venue_name = '" + venueName + '\'' + 
			",stop_time = '" + stopTime + '\'' + 
			",geocode_type = '" + geocodeType + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",link_count = '" + linkCount + '\'' + 
			",privacy = '" + privacy + '\'' + 
			",description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			",city_name = '" + cityName + '\'' + 
			",venue_address = '" + venueAddress + '\'' + 
			",tz_olson_path = '" + tzOlsonPath + '\'' + 
			",tz_country = '" + tzCountry + '\'' + 
			",all_day = '" + allDay + '\'' + 
			",country_name = '" + countryName + '\'' + 
			",modified = '" + modified + '\'' + 
			",olson_path = '" + olsonPath + '\'' + 
			",region_name = '" + regionName + '\'' + 
			",id = '" + id + '\'' + 
			",going_count = '" + goingCount + '\'' + 
			",venue_id = '" + venueId + '\'' + 
			",longitude = '" + longitude + '\'' + 
			",owner = '" + owner + '\'' + 
			",image = '" + image + '\'' + 
			",performers = '" + performers + '\'' + 
			",going = '" + going + '\'' + 
			",created = '" + created + '\'' + 
			",groups = '" + groups + '\'' + 
			",recur_string = '" + recurString + '\'' + 
			",venue_url = '" + venueUrl + '\'' + 
			",url = '" + url + '\'' + 
			",tz_id = '" + tzId + '\'' + 
			",tz_city = '" + tzCity + '\'' + 
			",start_time = '" + startTime + '\'' + 
			",calendar_count = '" + calendarCount + '\'' + 
			",calendars = '" + calendars + '\'' + 
			",venue_display = '" + venueDisplay + '\'' + 
			",region_abbr = '" + regionAbbr + '\'' + 
			",country_abbr2 = '" + countryAbbr2 + '\'' + 
			",postal_code = '" + postalCode + '\'' + 
			",country_abbr = '" + countryAbbr + '\'' + 
			",watching_count = '" + watchingCount + '\'' + 
			"}";
		}
}