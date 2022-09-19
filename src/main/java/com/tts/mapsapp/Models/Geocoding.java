package com.tts.mapsapp.Models;

import java.util.List;

import lombok.Data;

@Data
public class Geocoding {
	private Geometry geometry;
	//private List<AddressComponent> address_components;
	public String place_id;
	private List<String> types;
}
