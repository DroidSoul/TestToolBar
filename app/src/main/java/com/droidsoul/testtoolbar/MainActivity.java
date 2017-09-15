package com.droidsoul.testtoolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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
        if (id == R.id.iReleaseDate) {
            Toast.makeText(this, "release_Date", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (id == R.id.iRating) {
            Toast.makeText(this, "rating", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id == R.id.iPopularity) {
            Toast.makeText(this, "popularity", Toast.LENGTH_SHORT).show();
            return true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }
    }
}
