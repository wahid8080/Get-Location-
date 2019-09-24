package com.example.testgetlocation;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button findButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findButton = findViewById(R.id.grtlocation);

        findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GPSTracker gpsTracker = new GPSTracker(getApplicationContext());
                Location l = gpsTracker.getLocation();

                if (l != null)
                {
                    double latitute = l.getLatitude();
                    double lagatitute = l.getLongitude();
                    Toast.makeText(MainActivity.this,"Latitude : "+latitute +"\nLongitude"+lagatitute,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
