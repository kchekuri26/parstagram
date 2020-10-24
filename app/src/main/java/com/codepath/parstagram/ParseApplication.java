package com.codepath.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        //Register your parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
            .applicationId("G2m85ZcEizQ6SWniI81jFQp5e16UXL9vtLsLrvrx")
            .clientKey("RtSHZoxTCG6EFfsmo7q4jWO1JPsFfjcxHYCjIoWE")
            .server("https://parseapi.back4app.com")
            .build()
        );
    }
}
