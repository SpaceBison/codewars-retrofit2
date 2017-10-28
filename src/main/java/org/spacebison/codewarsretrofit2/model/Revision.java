
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Revision {

    @SerializedName("_id")
    @Expose
    private String mId;
    @SerializedName("created_at")
    @Expose
    private Date mCreatedAt;
    @SerializedName("message")
    @Expose
    private String mMessage;
    @SerializedName("number")
    @Expose
    private Long mNumber;
    @SerializedName("revised_attributes")
    @Expose
    private RevisedAttributes mRevisedAttributes;
    @SerializedName("revised_embeds")
    @Expose
    private RevisedEmbeds mRevisedEmbeds;
    @SerializedName("tag")
    @Expose
    private String mTag;
    @SerializedName("user_id")
    @Expose
    private String mUserId;

    public String getId() {
        return mId;
    }

    public Date getCreatedAt() {
        return mCreatedAt;
    }

    public String getMessage() {
        return mMessage;
    }

    public Long getNumber() {
        return mNumber;
    }

    public RevisedAttributes getRevisedAttributes() {
        return mRevisedAttributes;
    }

    public RevisedEmbeds getRevisedEmbeds() {
        return mRevisedEmbeds;
    }

    public String getTag() {
        return mTag;
    }

    public String getUserId() {
        return mUserId;
    }
}
