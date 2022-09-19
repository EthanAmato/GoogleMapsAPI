
function initMap() {
	let image = {url: "/redArrow.svg", scaledSize: new google.maps.Size(60,60)}
	let map = new google.maps.Map(document.getElementById('map'), { //instantiate JS obj at div id=map
		center: coords, //with properties of lat/long and the zoom
		zoom: 15,
		scrollwheel: false
		//lower zoom = larger amounts of land w/ lower resolution
		//zoom: 0 is entire earth while higher numbers narrow in on specific areas
		//max zoom is 21
	});
	
	
	let marker = new google.maps.Marker({ //puts the red arrow pin at coords given pos + a map to write it on
		position: coords,
		map: map, //
		icon: image,
		animation: google.maps.Animation.BOUNCE
	});
	
	let contentString = `<h2>${city}, ${state}</h2>`
	
	let infoWindow = new google.maps.InfoWindow({
		content: contentString
	});
	
	google.maps.event.addListener(marker,'click',
		function() { 
			infoWindow.open(map, marker)
		})
}


function initMap() {
	let image = {url: "/redArrow.svg", scaledSize: new google.maps.Size(60,60)}
	let map = new google.maps.Map(document.getElementById('map'), { //instantiate JS obj at div id=map
		center: coords, //with properties of lat/long and the zoom
		zoom: 15,
		scrollwheel: false
		//lower zoom = larger amounts of land w/ lower resolution
		//zoom: 0 is entire earth while higher numbers narrow in on specific areas
		//max zoom is 21
	});
	
	
	let marker = new google.maps.Marker({ //puts the red arrow pin at coords given pos + a map to write it on
		position: coords,
		map: map, //
		icon: image,
		animation: google.maps.Animation.BOUNCE
	});
	
	let contentString = `<h2>${city}, ${state}</h2>`
	
	let infoWindow = new google.maps.InfoWindow({
		content: contentString
	});
	
	google.maps.event.addListener(marker,'click',
		function() { 
			infoWindow.open(map, marker)
		})
}

