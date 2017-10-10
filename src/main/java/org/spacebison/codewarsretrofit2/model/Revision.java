
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Revision {

    @SerializedName("_id")
    @Expose
    public String mId;
    @SerializedName("created_at")
    @Expose
    public String mCreatedAt;
    @SerializedName("message")
    @Expose
    public Object mMessage;
    @SerializedName("number")
    @Expose
    public Long mNumber;
    @SerializedName("revised_attributes")
    @Expose
    public RevisedAttributes mRevisedAttributes;
    @SerializedName("revised_embeds")
    @Expose
    public RevisedEmbeds mRevisedEmbeds;
    @SerializedName("tag")
    @Expose
    public Object mTag;
    @SerializedName("user_id")
    @Expose
    public String mUserId;

}
