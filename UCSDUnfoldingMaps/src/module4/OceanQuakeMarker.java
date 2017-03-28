package module4;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Pei-Hsuan Chu
 *
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = false;
	}
	

	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		// Drawing a centered square for Ocean earthquakes
		// DO NOT set the fill color.  That will be set in the EarthquakeMarker
		// class to indicate the depth of the earthquake.
		// Simply draw a centered square.
		
		// HINT: Notice the radius variable in the EarthquakeMarker class
		// and how it is set in the EarthquakeMarker constructor
		
		// TODO: Implement this method
		//pg.pushStyle();
		if (getMagnitude()<THRESHOLD_LIGHT){
			pg.rect((float)(x-(radius/2.0)), (float)(y-(radius/2.0)), (float)(0.7*radius), (float)(0.7*radius));
		}
		else if (getMagnitude()>=THRESHOLD_LIGHT && getMagnitude()<THRESHOLD_MODERATE){
			pg.rect((float)(x-(radius/2.0)), (float)(y-(radius/2.0)), radius, radius);
		}
		else{
			pg.rect((float)(x-(radius/2.0)), (float)(y-(radius/2.0)), (float)(1.3*radius),(float)(1.3* radius));
		}

		//pg.popStyle();
		
	}
	


	

}
