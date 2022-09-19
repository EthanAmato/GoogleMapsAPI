package com.tts.mapsapp.Models;


import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class GeocodingResponse {
	private ArrayList<Geocoding> results;
}
