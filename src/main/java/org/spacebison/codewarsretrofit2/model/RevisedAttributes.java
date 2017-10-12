
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RevisedAttributes {

    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("description")
    @Expose
    private String mDescription;
    @SerializedName("category")
    @Expose
    private String mCategory;
    @SerializedName("status")
    @Expose
    private String mStatus;
    @SerializedName("tags")
    @Expose
    private List<Object> mTags = new ArrayList<Object>();

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getCategory() {
        return mCategory;
    }

    public String getStatus() {
        return mStatus;
    }

    public List<Object> getTags() {
        return mTags;
    }
}
