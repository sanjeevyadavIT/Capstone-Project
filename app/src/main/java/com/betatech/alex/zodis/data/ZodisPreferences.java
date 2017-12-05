package com.betatech.alex.zodis.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.betatech.alex.zodis.R;

/**
 * Created by lenovo on 11/29/2017.
 */

public class ZodisPreferences {

    private static final String PREF_DB_STATUS = "db";
    private static final String PREF_LOGGED_IN = "loggedIn";
    private static final String PREF_USER_NAME = "user_name";
    private static final String PREF_USER_PHOTO_URL = "user_photo_url";
    private static final String PREF_XP_EARN = "xp";
    private static final String PREF_FIRST_TIME = "first_time_app_open";


    /* Get first time status : true or false*/
    public static Boolean getFirstTimePref(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);

        return sp.getBoolean(PREF_FIRST_TIME,false);
    }

    public static void saveFirstTimePref(Context context, boolean status) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();

        editor.putBoolean(PREF_FIRST_TIME, status);
        editor.apply();
    }

    /* Get database status : filled or empty*/
    public static Boolean getDatabaseStatusPref(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);

        return sp.getBoolean(PREF_DB_STATUS,false);
    }

    public static void saveDatabaseStatusPref(Context context, boolean status) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();

        editor.putBoolean(PREF_DB_STATUS, status);
        editor.apply();
    }

    /* Get logged in status : true or false*/
    public static Boolean getLoggedInPref(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);

        return sp.getBoolean(PREF_LOGGED_IN,false);
    }

    public static void saveLoggedInPref(Context context, boolean status) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();

        editor.putBoolean(PREF_LOGGED_IN, status);
        editor.apply();
    }

    /* Get xp earn : integer*/
    public static int getXpEarnPref(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);

        return sp.getInt(PREF_XP_EARN,0);
    }

    public static void incrementXpPref(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();
        int xp = sp.getInt(PREF_XP_EARN,0);
        editor.putInt(PREF_XP_EARN, xp+10);
        editor.apply();
    }

    /* Get user name*/
    public static String getUserNamePref(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);

        return sp.getString(PREF_USER_NAME,context.getString(R.string.default_user_name));
    }

    public static void saveUserNamePref(Context context, String name) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();

        editor.putString(PREF_USER_NAME, name);
        editor.apply();
    }

    /* Get user photo url*/
    public static String getPhotoUrlPref(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);

        return sp.getString(PREF_USER_PHOTO_URL,"");
    }

    public static void savePhotoUrlPref(Context context, String url) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();

        editor.putString(PREF_USER_PHOTO_URL, url);
        editor.apply();
    }
}
