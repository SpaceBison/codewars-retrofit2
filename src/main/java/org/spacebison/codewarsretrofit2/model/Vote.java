
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Vote {

    @SerializedName("_id")
    @Expose
    private String mId;
    @SerializedName("created_at")
    @Expose
    private Date mCreatedAt;
    @SerializedName("updated_at")
    @Expose
    private Date mUpdatedAt;
    @SerializedName("user_id")
    @Expose
    private String mUserId;
    @SerializedName("value")
    @Expose
    private Long mValue;

    public String getId() {
        return mId;
    }

    public Date getCreatedAt() {
        return mCreatedAt;
    }

    public Date getUpdatedAt() {
        return mUpdatedAt;
    }

    public String getUserId() {
        return mUserId;
    }

    public Long getValue() {
        return mValue;
    }
}
