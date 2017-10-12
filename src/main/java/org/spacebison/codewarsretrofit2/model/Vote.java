
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vote {

    @SerializedName("_id")
    @Expose
    private String mId;
    @SerializedName("created_at")
    @Expose
    private String mCreatedAt;
    @SerializedName("updated_at")
    @Expose
    private String mUpdatedAt;
    @SerializedName("user_id")
    @Expose
    private String mUserId;
    @SerializedName("value")
    @Expose
    private Long mValue;

    public String getId() {
        return mId;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public String getUserId() {
        return mUserId;
    }

    public Long getValue() {
        return mValue;
    }
}
