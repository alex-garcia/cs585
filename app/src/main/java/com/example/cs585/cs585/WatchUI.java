package com.example.cs585.cs585;

import android.provider.ContactsContract;
import android.widget.Button;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;

public class WatchUI {
    static String[] action = new String[100];
    static int clickCount[] = new int[100];
    static int actionCount = 0;

    static String previousTime = Clock.getTimeStamp();
    static String[] clickSequence = new String[100];
    static int currentSequence = 0;

    //Initialize array for widgets to be monitored
    public static void initWatchUI(String actionID){
        action[actionCount] = actionID;
        actionCount++;
    }

    /**
     *
     * @param actionID ID of widget being examined
     * @param time The time the Widget was clicked/manipulated
     */
    public static void reportClick (String actionID, String time) throws ParseException {
        //Adds click to specific widget
        for (int i = 0; i < actionCount; i++) {
            if(action[i].equals(actionID)) {
                clickCount[i]++;
            }
        }

        //Records click sequence in a 3 second time window
        if(!previousTime.equals(null) && Clock.getTimeDifference(previousTime, time) >= 3) {
            previousTime = time;
            if(currentSequence >= 1) {
                System.out.println("Current Click Sequence \n ---------------------");
                for (int i = 0; i < currentSequence; i++) {
                    System.out.println(clickSequence[i]);
                }
                currentSequence = 0;
            }
        }
        else
        {
            clickSequence[currentSequence] = actionID + "\t\t" + time;
            currentSequence++;
            previousTime = time;
        }
    }

    //Displays click count
    public static void displayClicks(){
        System.out.println("Total click count for each widget being monitored:");
        for(int i = 0; i < actionCount; i++)
            System.out.println(action[i] + "\t\t" + clickCount[i]);
    }


}
