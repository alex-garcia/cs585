package com.example.cs585.cs585;

import android.text.format.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Time utility
 */
public class Clock {

    /**
     * Get current time
     * @return current time as a string.
     */
    public static String getTimeStamp() {
        Time now = new Time();
        now.setToNow();
        String sTime = now.format("%T");
        return sTime;
    }

    /**
     *
     * @param time1 The last time a previous action has taken place
     * @param time2 Current time action is taking place
     * @return Seconds between the two times
     */
    public static int getTimeDifference(String time1, String time2) throws ParseException {
        DateFormat df = new java.text.SimpleDateFormat("hh:mm:ss");
        Date date1 = df.parse(time1);
        Date date2 = df.parse(time2);
        int hours, minutes, seconds;

        long diff = date2.getTime() - date1.getTime();
        int timeInSeconds = (int)diff / 1000;

        hours = timeInSeconds / 3600;
        timeInSeconds = timeInSeconds - (hours * 3600);

        minutes = timeInSeconds / 60;
        timeInSeconds = timeInSeconds - (minutes * 60);

        seconds = timeInSeconds;
        return seconds;
    }

}