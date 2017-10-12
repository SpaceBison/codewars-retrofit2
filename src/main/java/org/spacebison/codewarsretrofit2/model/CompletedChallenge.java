
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CompletedChallenge {

    @SerializedName("id")
    @Expose
    private String mId;
    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("slug")
    @Expose
    private String mSlug;
    @SerializedName("completedAt")
    @Expose
    private String mCompletedAt;
    @SerializedName("completedLanguages")
    @Expose
    private List<String> mCompletedLanguages = new ArrayList<String>();

    public String getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getSlug() {
        return mSlug;
    }

    public String getCompletedAt() {
        return mCompletedAt;
    }

    public List<String> getCompletedLanguages() {
        return mCompletedLanguages;
    }
}
