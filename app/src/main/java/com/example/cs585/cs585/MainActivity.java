package com.example.cs585.cs585;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import java.text.ParseException;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the IDs for each widget
        WatchUI.initWatchUI(getResources().getResourceEntryName(R.id.buttonA));
        WatchUI.initWatchUI(getResources().getResourceEntryName(R.id.buttonB));
        WatchUI.initWatchUI(getResources().getResourceEntryName(R.id.buttonC));
        WatchUI.initWatchUI(getResources().getResourceEntryName(R.id.checkBoxA));
        WatchUI.initWatchUI(getResources().getResourceEntryName(R.id.checkBoxB));
        WatchUI.initWatchUI(getResources().getResourceEntryName(R.id.checkBoxC));
        WatchUI.initWatchUI(getResources().getResourceEntryName(R.id.radioButtonA));
        WatchUI.initWatchUI(getResources().getResourceEntryName(R.id.radioButtonB));
        WatchUI.initWatchUI(getResources().getResourceEntryName(R.id.radioButtonC));


        //Watch clicks for button A
        final Button buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    WatchUI.reportClick(
                            getResources().getResourceEntryName(R.id.buttonA),
                            Clock.getTimeStamp());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

       //Watch clicks for button B
       final Button buttonB = (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    WatchUI.reportClick(getResources().getResourceEntryName(R.id.buttonB),
                            Clock.getTimeStamp());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        //Watch clicks for button C
        final Button buttonC = (Button) findViewById(R.id.buttonC);
        buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    WatchUI.reportClick(getResources().getResourceEntryName(R.id.buttonC),
                            Clock.getTimeStamp());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        //Watch clicks for Check Box A
        final CheckBox checkBoxA = (CheckBox) findViewById(R.id.checkBoxA);
        checkBoxA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    WatchUI.reportClick(getResources().getResourceEntryName(R.id.checkBoxA),
                            Clock.getTimeStamp());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        //Watch clicks for Check Box B
        final CheckBox checkBoxB = (CheckBox) findViewById(R.id.checkBoxB);
        checkBoxB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    WatchUI.reportClick(getResources().getResourceEntryName(R.id.checkBoxB),
                            Clock.getTimeStamp());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        //Watch clicks for Check Box C
        final CheckBox checkBoxC = (CheckBox) findViewById(R.id.checkBoxC);
        checkBoxC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    WatchUI.reportClick(getResources().getResourceEntryName(R.id.checkBoxC),
                            Clock.getTimeStamp());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        //Watch clicks for Radio Button A
        final RadioButton radioButtonA = (RadioButton) findViewById(R.id.radioButtonA);
        radioButtonA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    WatchUI.reportClick(getResources().getResourceEntryName(R.id.radioButtonA),
                            Clock.getTimeStamp());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        //Watch clicks for Radio Button B
        final RadioButton radioButtonB = (RadioButton) findViewById(R.id.radioButtonB);
        radioButtonB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    WatchUI.reportClick(getResources().getResourceEntryName(R.id.radioButtonB),
                            Clock.getTimeStamp());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        //Watch clicks for Radio Button C
        final RadioButton radioButtonC = (RadioButton) findViewById(R.id.radioButtonC);
        radioButtonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    WatchUI.reportClick(getResources().getResourceEntryName(R.id.radioButtonC),
                            Clock.getTimeStamp());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });

        //Display click counts for each widget monitored
        final Button buttonExit = (Button) findViewById(R.id.buttonExit);
        buttonExit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                WatchUI.displayClicks();
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
