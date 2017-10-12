
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreatedBy {

    @SerializedName("username")
    @Expose
    private String mUsername;
    @SerializedName("url")
    @Expose
    private String mUrl;

    public String getUsername() {
        return mUsername;
    }

    public String getUrl() {
        return mUrl;
    }
}
