package com.icordium.server.controller;


/**
 * Created by ISH on 8/31/2018.
 */
public class DataTypeValidator {
    public static int parseInt(Object objects) {
        try {
            return Integer.parseInt(objects.toString());
        } catch (Exception e) {
            return 0;
        }
    }

    public static double parseDouble(Object objects) {
        try {
            return Double.parseDouble(objects.toString());
        } catch (Exception e) {
            return 0.00;
        }
    }

    public static float parseFloat(Object objects) {
        try {
            return Float.parseFloat(objects.toString());
        } catch (Exception e) {
            return 0.00F;
        }
    }

    public static boolean parseBoolean(Object objects) {
        try {
            return Boolean.parseBoolean(String.valueOf(objects));
        } catch (Exception e) {
            return false;
        }
    }

    public static int parseCheckBoxxtoInt(Object objects) {
        return (String.valueOf(objects).equals("on") ? 1 : 0);
    }

}