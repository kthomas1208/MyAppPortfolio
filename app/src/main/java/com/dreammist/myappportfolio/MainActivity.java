package com.dreammist.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.nio.charset.Charset;

public class MainActivity extends Activity {

    //Toast variable
    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /**
     * Builds and displays the string for the toast
     * @param appName the name of the app to be launched
     */
    public void displayToast(CharSequence appName) {
        //build toast string
        CharSequence toastMessage = "This button will launch " + appName + "!";

        //clear any existing toast
        if(mAppToast!=null) mAppToast.cancel();

        //create and display toast
        mAppToast = Toast.makeText(this,toastMessage,Toast.LENGTH_SHORT);
        mAppToast.show();
    }

    /**
     * Handles button press from each button by showing a toast
     * @param v the view from which you can get the button
     */
    public void showToast(View v) {
        switch(v.getId()) {
            case R.id.spotify_button:
            case R.id.scores_button:
            case R.id.library_button:
            case R.id.build_it_button:
            case R.id.xyz_button:
            case R.id.capstone_button:
                displayToast(((Button)v).getText()); //all buttons will display a toast w/ app name
                break;
            default:
                break;
        }
    }
}
