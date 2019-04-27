package com.icordium.server.controller;

import java.util.Calendar;
import java.util.Date;

public class DataGenerator {
    public static String getTimeMilescound() {
        return new Date().getTime() + "";
    }

    public static double getMinusVal(Object o) {
        try {
            double parseDouble = Double.parseDouble(o.toString());
            if (parseDouble > 0.00) {
                return parseDouble * -1;
            }
            return parseDouble;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static double getPlusVal(Object o) {
        try {
            double parseDouble = Double.parseDouble(o.toString());
            if (parseDouble < 0.00) {
                return parseDouble * -1;
            }
            return parseDouble;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static Date getFirstDateOfCurrentMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }

    public static Date addHoursToJavaUtilDate(Date date, int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, hours);
        return calendar.getTime();
    }
}