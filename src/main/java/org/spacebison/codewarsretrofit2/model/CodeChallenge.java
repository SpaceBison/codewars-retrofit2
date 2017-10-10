package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CodeChallenge {

    @SerializedName("id")
    @Expose
    private String mId;
    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("slug")
    @Expose
    private String mSlug;
    @SerializedName("category")
    @Expose
    private String mCategory;
    @SerializedName("publishedAt")
    @Expose
    private String mPublishedAt;
    @SerializedName("approvedAt")
    @Expose
    private String mApprovedAt;
    @SerializedName("languages")
    @Expose
    private List<String> mLanguages = new ArrayList<String>();
    @SerializedName("url")
    @Expose
    private String mUrl;
    @SerializedName("rank")
    @Expose
    private Rank mRank;
    @SerializedName("createdBy")
    @Expose
    private CreatedBy mCreatedBy;
    @SerializedName("approvedBy")
    @Expose
    private String mApprovedBy;
    @SerializedName("description")
    @Expose
    private String mDescription;
    @SerializedName("totalAttempts")
    @Expose
    private Long mTotalAttempts;
    @SerializedName("totalCompleted")
    @Expose
    private Long mTotalCompleted;
    @SerializedName("totalStars")
    @Expose
    private Long mTotalStars;
    @SerializedName("tags")
    @Expose
    private List<String> mTags = new ArrayList<String>();

    public String getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getSlug() {
        return mSlug;
    }

    public String getCategory() {
        return mCategory;
    }

    public String getPublishedAt() {
        return mPublishedAt;
    }

    public String getApprovedAt() {
        return mApprovedAt;
    }

    public List<String> getLanguages() {
        return mLanguages;
    }

    public String getUrl() {
        return mUrl;
    }

    public Rank getRank() {
        return mRank;
    }

    public CreatedBy getCreatedBy() {
        return mCreatedBy;
    }

    public String getApprovedBy() {
        return mApprovedBy;
    }

    public String getDescription() {
        return mDescription;
    }

    public Long getTotalAttempts() {
        return mTotalAttempts;
    }

    public Long getTotalCompleted() {
        return mTotalCompleted;
    }

    public Long getTotalStars() {
        return mTotalStars;
    }

    public List<String> getTags() {
        return mTags;
    }
}
