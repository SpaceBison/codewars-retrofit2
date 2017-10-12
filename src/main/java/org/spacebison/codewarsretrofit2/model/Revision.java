
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Revision {

    @SerializedName("_id")
    @Expose
    private String mId;
    @SerializedName("created_at")
    @Expose
    private String mCreatedAt;
    @SerializedName("message")
    @Expose
    private Object mMessage;
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
    private Object mTag;
    @SerializedName("user_id")
    @Expose
    private String mUserId;

    public String getId() {
        return mId;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public Object getMessage() {
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

    public Object getTag() {
        return mTag;
    }

    public String getUserId() {
        return mUserId;
    }
}
