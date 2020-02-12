package com.ibrohimrashidov.anysensormonitoring;

import android.app.Activity;
import android.os.Bundle;

public class TempMonitoringScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temp_value);
        ActivityHelper.initialize(this);

//        LinearLayout linearLayout = findViewById(R.id.layOut);
//        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
//        animationDrawable.setEnterFadeDuration(2000);
//        animationDrawable.setExitFadeDuration(4000);
//        animationDrawable.start();

    }
}
