package com.tts.mapsapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tts.mapsapp.Models.GeocodingResponse;
import com.tts.mapsapp.Models.Location;


//Will talk to an API
//Want to autowire to create a mapservice
//we don't want to haveto create a mapservice using a new MapService
//constructor. Instead we want SpringBoot to make one magically
//To do that, we have to tell SB it's okay to do so

@Service //Turns MapServicei nto a Bean so it's managed by Springboot's
		 //Inversion of control system
public class MapService {
	@Value("${api_key}") //grabs value from environemnt/config file
	private String apiKey;
	
	public void addCoordinates(Location location) {
		String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" + 
			    location.getCity() + "," + location.getState() + "&key=" + apiKey;
		RestTemplate restTemplate = new RestTemplate();
		GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
		Location coordinates = response.getResults().get(0).getGeometry().getLocation();
				//get request to url and pass type of obj we want returned
				//tries to map json from response to a specified object
				//coordinates traverses the json to get to the lat + long values in response
		location.setLat(coordinates.getLat());
		location.setLng(coordinates.getLng());
	}
}
