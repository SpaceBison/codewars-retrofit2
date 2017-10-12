package org.spacebison.codewarsretrofit2;

import com.google.gson.annotations.SerializedName;

public class TestUser {
    @SerializedName("apiKey")
    private String mApiKey;

    @SerializedName("name")
    private String mName;

    public String getApiKey() {
        return mApiKey;
    }

    public String getName() {
        return mName;
    }
}
