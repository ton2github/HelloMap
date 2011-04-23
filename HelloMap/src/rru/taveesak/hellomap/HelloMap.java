package rru.taveesak.hellomap;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

//import android.app.Activity;
import android.os.Bundle;

public class HelloMap extends MapActivity{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //ส่วนที่เพิ่มมา
        MapView mapView = (MapView)findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
    }
    
    
    
    @Override
    protected boolean isRouteDisplayed(){
    return false;
    }
}