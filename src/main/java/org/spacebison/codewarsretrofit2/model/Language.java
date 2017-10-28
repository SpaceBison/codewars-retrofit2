
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Language {

    @SerializedName("_id")
    @Expose
    private String mId;
    @SerializedName("answer")
    @Expose
    private String mAnswer;
    @SerializedName("code_challenge_review_id")
    @Expose
    private String mCodeChallengeReviewId;
    @SerializedName("created_at")
    @Expose
    private Date mCreatedAt;
    @SerializedName("example_fixture")
    @Expose
    private String mExampleFixture;
    @SerializedName("fixture")
    @Expose
    private String mFixture;
    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("package")
    @Expose
    private String mPackage;
    @SerializedName("rank_applied_to_author")
    @Expose
    private Boolean mRankAppliedToAuthor;
    @SerializedName("setup")
    @Expose
    private String mSetup;
    @SerializedName("updated_at")
    @Expose
    private String mUpdatedAt;

    public String getId() {
        return mId;
    }

    public String getAnswer() {
        return mAnswer;
    }

    public String getCodeChallengeReviewId() {
        return mCodeChallengeReviewId;
    }

    public Date getCreatedAt() {
        return mCreatedAt;
    }

    public String getExampleFixture() {
        return mExampleFixture;
    }

    public String getFixture() {
        return mFixture;
    }

    public String getName() {
        return mName;
    }

    public String getPackage() {
        return mPackage;
    }

    public Boolean getRankAppliedToAuthor() {
        return mRankAppliedToAuthor;
    }

    public String getSetup() {
        return mSetup;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }
}
