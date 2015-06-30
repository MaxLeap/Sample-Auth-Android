package as.leap.sample.auth;

import android.app.Application;

import as.leap.LASConfig;
import as.leap.LASFacebookUtils;


public class App extends Application {

    public static final String APP_ID = "Replace this with your App Id";
    public static final String API_KEY = "Replace this with your Rest Key";
    public static final String FACEBOOK_APP_ID = "Replace this with your facebook app id";
    public static final String FACEBOOK_SECRET_KEY = "Replace this with your facebook secret key";

    @Override
    public void onCreate() {
        super.onCreate();

        if (APP_ID.startsWith("Replace") || API_KEY.startsWith("Replace")) {
            throw new IllegalArgumentException("Please replace with your app id and api key first before" +
                    "using LAS SDK.");
        }

        LASConfig.setLogLevel(LASConfig.LOG_LEVEL_DEBUG);
        LASConfig.initialize(this, APP_ID, API_KEY);

        // Set your Facebook App Id in strings.xml
        LASFacebookUtils.initialize(FACEBOOK_APP_ID, FACEBOOK_SECRET_KEY);

    }

}
