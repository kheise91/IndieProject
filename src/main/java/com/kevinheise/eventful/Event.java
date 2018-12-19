package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The type Event.
 */
@Generated("com.robohorse.robopojogenerator")
public class Event{

	@JsonProperty("country")
	private String country;

	@JsonProperty("withdrawn")
	private String withdrawn;

	@JsonProperty("children")
	private Object children;

	@JsonProperty("venue_type")
	private String venueType;

	@JsonProperty("price")
	private Object price;

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
	private Images images;

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
	private Object description;

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
	private Performers performers;

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

	/**
	 * Set country.
	 *
	 * @param country the country
	 */
	public void setCountry(String country){
		this.country = country;
	}

	/**
	 * Get country string.
	 *
	 * @return the string
	 */
	public String getCountry(){
		return country;
	}

	/**
	 * Set withdrawn.
	 *
	 * @param withdrawn the withdrawn
	 */
	public void setWithdrawn(String withdrawn){
		this.withdrawn = withdrawn;
	}

	/**
	 * Get withdrawn string.
	 *
	 * @return the string
	 */
	public String getWithdrawn(){
		return withdrawn;
	}

	/**
	 * Set children.
	 *
	 * @param children the children
	 */
	public void setChildren(Object children){
		this.children = children;
	}

	/**
	 * Get children object.
	 *
	 * @return the object
	 */
	public Object getChildren(){
		return children;
	}

	/**
	 * Set venue type.
	 *
	 * @param venueType the venue type
	 */
	public void setVenueType(String venueType){
		this.venueType = venueType;
	}

	/**
	 * Get venue type string.
	 *
	 * @return the string
	 */
	public String getVenueType(){
		return venueType;
	}

	/**
	 * Set price.
	 *
	 * @param price the price
	 */
	public void setPrice(Object price){
		this.price = price;
	}

	/**
	 * Get price object.
	 *
	 * @return the object
	 */
	public Object getPrice(){
		return price;
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
	 * Set links.
	 *
	 * @param links the links
	 */
	public void setLinks(Links links){
		this.links = links;
	}

	/**
	 * Get links links.
	 *
	 * @return the links
	 */
	public Links getLinks(){
		return links;
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
	 * Set images.
	 *
	 * @param images the images
	 */
	public void setImages(Images images){
		this.images = images;
	}

	/**
	 * Get images images.
	 *
	 * @return the images
	 */
	public Images getImages(){
		return images;
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
	 * Set tags.
	 *
	 * @param tags the tags
	 */
	public void setTags(Tags tags){
		this.tags = tags;
	}

	/**
	 * Get tags tags.
	 *
	 * @return the tags
	 */
	public Tags getTags(){
		return tags;
	}

	/**
	 * Set recurrence.
	 *
	 * @param recurrence the recurrence
	 */
	public void setRecurrence(Object recurrence){
		this.recurrence = recurrence;
	}

	/**
	 * Get recurrence object.
	 *
	 * @return the object
	 */
	public Object getRecurrence(){
		return recurrence;
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
	 * Set region.
	 *
	 * @param region the region
	 */
	public void setRegion(String region){
		this.region = region;
	}

	/**
	 * Get region string.
	 *
	 * @return the string
	 */
	public String getRegion(){
		return region;
	}

	/**
	 * Set parents.
	 *
	 * @param parents the parents
	 */
	public void setParents(Object parents){
		this.parents = parents;
	}

	/**
	 * Get parents object.
	 *
	 * @return the object
	 */
	public Object getParents(){
		return parents;
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
	 * Set city.
	 *
	 * @param city the city
	 */
	public void setCity(String city){
		this.city = city;
	}

	/**
	 * Get city string.
	 *
	 * @return the string
	 */
	public String getCity(){
		return city;
	}

	/**
	 * Set trackbacks.
	 *
	 * @param trackbacks the trackbacks
	 */
	public void setTrackbacks(Object trackbacks){
		this.trackbacks = trackbacks;
	}

	/**
	 * Get trackbacks object.
	 *
	 * @return the object
	 */
	public Object getTrackbacks(){
		return trackbacks;
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
	 * Set withdrawn note.
	 *
	 * @param withdrawnNote the withdrawn note
	 */
	public void setWithdrawnNote(Object withdrawnNote){
		this.withdrawnNote = withdrawnNote;
	}

	/**
	 * Get withdrawn note object.
	 *
	 * @return the object
	 */
	public Object getWithdrawnNote(){
		return withdrawnNote;
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
	 * Set categories.
	 *
	 * @param categories the categories
	 */
	public void setCategories(Categories categories){
		this.categories = categories;
	}

	/**
	 * Get categories categories.
	 *
	 * @return the categories
	 */
	public Categories getCategories(){
		return categories;
	}

	/**
	 * Set free.
	 *
	 * @param free the free
	 */
	public void setFree(Object free){
		this.free = free;
	}

	/**
	 * Get free object.
	 *
	 * @return the object
	 */
	public Object getFree(){
		return free;
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
	 * Set comments.
	 *
	 * @param comments the comments
	 */
	public void setComments(Object comments){
		this.comments = comments;
	}

	/**
	 * Get comments object.
	 *
	 * @return the object
	 */
	public Object getComments(){
		return comments;
	}

	/**
	 * Set address.
	 *
	 * @param address the address
	 */
	public void setAddress(String address){
		this.address = address;
	}

	/**
	 * Get address string.
	 *
	 * @return the string
	 */
	public String getAddress(){
		return address;
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
	 * Set properties.
	 *
	 * @param properties the properties
	 */
	public void setProperties(Object properties){
		this.properties = properties;
	}

	/**
	 * Get properties object.
	 *
	 * @return the object
	 */
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