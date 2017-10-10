
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vote {

    @SerializedName("_id")
    @Expose
    public String mId;
    @SerializedName("created_at")
    @Expose
    public String mCreatedAt;
    @SerializedName("updated_at")
    @Expose
    public String mUpdatedAt;
    @SerializedName("user_id")
    @Expose
    public String mUserId;
    @SerializedName("value")
    @Expose
    public Long mValue;

}
