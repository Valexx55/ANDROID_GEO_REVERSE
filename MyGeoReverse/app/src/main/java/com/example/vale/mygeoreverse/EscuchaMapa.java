package com.example.vale.mygeoreverse;

import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;


public class EscuchaMapa implements GoogleMap.OnMapClickListener{


    private LocationManager lm;

    public EscuchaMapa (LocationManager lm)
    {
        this.lm = lm;
    }

    @Override
    public void onMapClick(LatLng l) {

        Log.d(getClass().getCanonicalName(), "Loc pulsada = " + l.toString());
        Location loc = new Location(LocationManager.GPS_PROVIDER);
        loc.setLatitude(l.latitude);
        loc.setLongitude(l.longitude);
        loc.setAltitude(0);
        loc.setAccuracy(10f);
        loc.setElapsedRealtimeNanos(System.nanoTime());
        loc.setTime(System.currentTimeMillis());
        lm.setTestProviderLocation(LocationManager.GPS_PROVIDER, loc);
    }
}
