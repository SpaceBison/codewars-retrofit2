
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Language {

    @SerializedName("_id")
    @Expose
    public String mId;
    @SerializedName("answer")
    @Expose
    public String mAnswer;
    @SerializedName("code_challenge_review_id")
    @Expose
    public String mCodeChallengeReviewId;
    @SerializedName("created_at")
    @Expose
    public Object mCreatedAt;
    @SerializedName("example_fixture")
    @Expose
    public String mExampleFixture;
    @SerializedName("fixture")
    @Expose
    public String mFixture;
    @SerializedName("name")
    @Expose
    public String mName;
    @SerializedName("package")
    @Expose
    public String mPackage;
    @SerializedName("rank_applied_to_author")
    @Expose
    public Boolean mRankAppliedToAuthor;
    @SerializedName("setup")
    @Expose
    public String mSetup;
    @SerializedName("updated_at")
    @Expose
    public String mUpdatedAt;

}
