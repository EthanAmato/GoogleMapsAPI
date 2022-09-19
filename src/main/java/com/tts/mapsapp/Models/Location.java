package com.tts.mapsapp.Models;

import lombok.Data;

//In this project, Location is used in multipurpose way
//bc location store lat + lng in a way that can be received
//via that getForObject call... but the project 
//uses location for city and state
@Data
public class Location {
	private String city;
    private String state;
    private String lat;
    private String lng;
	
}
