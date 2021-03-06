package com.ls.api;

/**
 * Created by Varun Kumar on 7/27/2017.
 */

public class DatabaseUrl {


    private volatile static DatabaseUrl uniqueInstance;

    public static final String API_VERSION = "v1";

    public static String url = "https://raw.githubusercontent.com/heysadboy/open-event-apps/master/samples/googleio2017.json";

    private DatabaseUrl() {
    }

    public static DatabaseUrl getInstance() {
        if (uniqueInstance == null) {
            synchronized (DatabaseUrl.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DatabaseUrl();
                }
            }
        }
        return uniqueInstance;
    }

    public String getConferenceData(String page) {
        return url;
    }


}
