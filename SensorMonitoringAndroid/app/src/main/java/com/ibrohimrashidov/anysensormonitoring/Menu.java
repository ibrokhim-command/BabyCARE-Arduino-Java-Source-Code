package com.ibrohimrashidov.anysensormonitoring;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void blueToothConnection (View v){
        Intent myIntent = new Intent(getBaseContext(),   MainActivity.class);
        startActivity(myIntent);
    }

    public void GasSensorValue (View v){
        Intent myIntent = new Intent(getBaseContext(),   MonitoringScreen.class);
        startActivity(myIntent);
    }

    public void VoiceValue (View v){
        Intent myIntent = new Intent(getBaseContext(),   VoiceMonitoringScreen.class);
        startActivity(myIntent);
    }

    public void information (View v){
        Intent myIntent = new Intent(getBaseContext(),   Information.class);
        startActivity(myIntent);
    }

    public void temperature (View v){
        Intent myIntent = new Intent(getBaseContext(),   TempMonitoringScreen.class);
        startActivity(myIntent);
    }
}
