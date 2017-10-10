
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CompletedChallenge {

    @SerializedName("id")
    @Expose
    public String mId;
    @SerializedName("name")
    @Expose
    public String mName;
    @SerializedName("slug")
    @Expose
    public String mSlug;
    @SerializedName("completedAt")
    @Expose
    public String mCompletedAt;
    @SerializedName("completedLanguages")
    @Expose
    public List<String> mCompletedLanguages = new ArrayList<String>();

}
