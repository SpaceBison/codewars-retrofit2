package org.spacebison.codewarsretrofit2;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestUser {
    @SerializedName("apiKey")
    private String mApiKey;

    @SerializedName("name")
    private String mName;

    static TestUser loadTestUser(String jsonResourcePath) throws IOException {
        try (Reader reader = new InputStreamReader(TestUser.class.getResourceAsStream(jsonResourcePath))) {
            return new Gson().fromJson(reader, TestUser.class);
        }
    }

    public String getApiKey() {
        return mApiKey;
    }

    public String getName() {
        return mName;
    }
}
