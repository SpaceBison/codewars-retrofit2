
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Extra {

    @SerializedName("status")
    @Expose
    private String mStatus;
    @SerializedName("beta")
    @Expose
    private Boolean mBeta;
    @SerializedName("published")
    @Expose
    private Boolean mPublished;

    public String getStatus() {
        return mStatus;
    }

    public Boolean getBeta() {
        return mBeta;
    }

    public Boolean getPublished() {
        return mPublished;
    }
}
