package module4;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for land earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Pei-Hsuan Chu
 *
 */
public class LandQuakeMarker extends EarthquakeMarker {
	
	
	public LandQuakeMarker(PointFeature quake) {
		
		// calling EarthquakeMarker constructor
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = true;
	}


	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		// Draw a centered circle for land quakes
		// DO NOT set the fill color here.  That will be set in the EarthquakeMarker
		// class to indicate the depth of the earthquake.
		// Simply draw a centered circle.
		
		// HINT: Notice the radius variable in the EarthquakeMarker class
		// and how it is set in the EarthquakeMarker constructor
		
		// TODO: Implement this method
		pg.pushStyle();
		if (getMagnitude()<THRESHOLD_LIGHT){
			pg.ellipse(x, y, (float)(0.7*radius), (float)(0.7*radius));
		}
		else if (getMagnitude()>=THRESHOLD_LIGHT && getMagnitude()<THRESHOLD_MODERATE){
			pg.ellipse(x, y, radius, radius);
		}
		else{
			pg.ellipse(x, y, (float)(1.3*radius), (float)(1.3*radius));
		}
		pg.popStyle();
		
	}
	

	// Get the country the earthquake is in
	public String getCountry() {
		return (String) getProperty("country");
	}



		
}