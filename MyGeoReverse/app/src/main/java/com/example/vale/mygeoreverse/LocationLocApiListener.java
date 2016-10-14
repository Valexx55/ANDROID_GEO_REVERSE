package com.example.vale.mygeoreverse;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by vale on 28/08/16.
 */
public class LocationLocApiListener implements LocationListener {

    private Context context;

    public LocationLocApiListener (Context context)
    {
        this.context = context;
    }

    @Override
    public void onLocationChanged(Location l) {

        Log.d(getClass().getCanonicalName(), "Loc CAMBIADA = " + l.toString());
        ((MainActivity)this.context).handleNewLocation(l);
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
