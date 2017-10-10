
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RevisedAttributes {

    @SerializedName("name")
    @Expose
    public String mName;
    @SerializedName("description")
    @Expose
    public String mDescription;
    @SerializedName("category")
    @Expose
    public String mCategory;
    @SerializedName("status")
    @Expose
    public String mStatus;
    @SerializedName("tags")
    @Expose
    public List<Object> mTags = new ArrayList<Object>();

}
