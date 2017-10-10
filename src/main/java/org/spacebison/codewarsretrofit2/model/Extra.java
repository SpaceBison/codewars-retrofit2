
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Extra {

    @SerializedName("status")
    @Expose
    public String mStatus;
    @SerializedName("beta")
    @Expose
    public Boolean mBeta;
    @SerializedName("published")
    @Expose
    public Boolean mPublished;

}
