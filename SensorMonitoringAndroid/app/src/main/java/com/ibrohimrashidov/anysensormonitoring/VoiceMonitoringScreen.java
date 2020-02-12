package com.ibrohimrashidov.anysensormonitoring;

import android.app.Activity;
import android.app.ProgressDialog;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.UUID;

public class VoiceMonitoringScreen extends Activity {

    private static final String TAG = "BlueTest5-MainActivity";
    private int mMaxChars = 50000;//Default
    private UUID mDeviceUUID;
    private BluetoothSocket mBTSocket;
    private boolean mIsUserInitiatedDisconnect = false;
    private TextView mTxtReceive;
    private boolean mIsBluetoothConnected = false;

    private BluetoothDevice mDevice;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.voice_value);
        ActivityHelper.initialize(this);


//        LinearLayout linearLayout = findViewById(R.id.layoUt);
//        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
//        animationDrawable.setEnterFadeDuration(2000);
//        animationDrawable.setExitFadeDuration(4000);
//        animationDrawable.start();

//        Intent intent = getIntent();
//        Bundle b = intent.getExtras();
//        mDevice = b.getParcelable(MainActivity.DEVICE_EXTRA);
//        mDeviceUUID = UUID.fromString(b.getString(MainActivity.DEVICE_UUID));
//        mMaxChars = b.getInt(MainActivity.BUFFER_SIZE);
//        Log.d(TAG, "Ready");
//        mTxtReceive = (TextView) findViewById(R.id.txtVoice);

    }

}
