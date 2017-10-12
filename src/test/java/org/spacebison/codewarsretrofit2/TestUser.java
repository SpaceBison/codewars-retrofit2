package org.spacebison.codewarsretrofit2;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("apiKey")
    private String mApiKey;

    public String getApiKey() {
        return mApiKey;
    }
}
