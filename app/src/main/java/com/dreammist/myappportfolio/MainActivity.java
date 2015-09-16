package com.dreammist.myappportfolio;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.nio.charset.Charset;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = getApplicationContext();
        final CharSequence introText = "This button will launch my ";
        ActionBar actionBar = getActionBar();
        //actionBar.setBackgroundDrawable(new ColorDrawable(Color.RED));

        Button spotifyButton = (Button) findViewById(R.id.spotify_button);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence toastText = introText + "Spotify Streamer app!";
                Toast toast = Toast.makeText(context,toastText,Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button launchScoresButton = (Button) findViewById(R.id.scores_button);
        launchScoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence toastText = introText + "Football Scores app!";
                Toast toast = Toast.makeText(context,toastText,Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button launchLibraryButton = (Button) findViewById(R.id.library_button);
        launchLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence toastText = introText + "Library app!";
                Toast toast = Toast.makeText(context,toastText,Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button launchBuildItBiggerButton = (Button) findViewById(R.id.build_it_button);
        launchBuildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence toastText = introText + "Build It Bigger app!";
                Toast toast = Toast.makeText(context,toastText,Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button launchXYZReaderButton = (Button) findViewById(R.id.xyz_button);
        launchXYZReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence toastText = introText + "XYZ Reader app!";
                Toast toast = Toast.makeText(context,toastText,Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button launchCapstoneProjectButton = (Button) findViewById(R.id.capstone_button);
        launchCapstoneProjectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence toastText = introText + "capstone project app!";
                Toast toast = Toast.makeText(context,toastText,Toast.LENGTH_SHORT);
                toast.show();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
