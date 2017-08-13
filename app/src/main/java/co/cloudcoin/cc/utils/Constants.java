package co.cloudcoin.cc.utils;

/**
 * Created by navrajsingh on 8/13/17.
 */

public class Constants {
    public static String DEV_MODE_PRODUCTION ="Production";
    public static String DEV_MODE_DEVELOPMENT ="Development";
    public static String DEV_MODE =DEV_MODE_DEVELOPMENT;

    public static String SERVER_URL_PRODUCTION = "";
    public static String SERVER_URL_DEVELOPMENT = "";


    public static String GetServerURL() {
        if(DEV_MODE.equalsIgnoreCase(DEV_MODE_DEVELOPMENT))
            return SERVER_URL_DEVELOPMENT;
        else
            return SERVER_URL_PRODUCTION;
    }
}
