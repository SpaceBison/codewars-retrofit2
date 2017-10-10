
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class AuthoredChallenge {

    @SerializedName("_id")
    @Expose
    public String mId;
    @SerializedName("_slugs")
    @Expose
    public List<String> mSlugs = new ArrayList<String>();
    @SerializedName("admin_tags")
    @Expose
    public Object mAdminTags;
    @SerializedName("api_version")
    @Expose
    public Long mApiVersion;
    @SerializedName("approvals_count")
    @Expose
    public Long mApprovalsCount;
    @SerializedName("approved_at")
    @Expose
    public String mApprovedAt;
    @SerializedName("approved_by_id")
    @Expose
    public String mApprovedById;
    @SerializedName("average_completion")
    @Expose
    public Float mAverageCompletion;
    @SerializedName("beta_status")
    @Expose
    public String mBetaStatus;
    @SerializedName("category")
    @Expose
    public String mCategory;
    @SerializedName("comments")
    @Expose
    public List<Comment> mComments = new ArrayList<Comment>();
    @SerializedName("created_at")
    @Expose
    public String mCreatedAt;
    @SerializedName("created_by_id")
    @Expose
    public String mCreatedById;
    @SerializedName("description")
    @Expose
    public String mDescription;
    @SerializedName("estimated_rank")
    @Expose
    public Object mEstimatedRank;
    @SerializedName("forks_count")
    @Expose
    public Long mForksCount;
    @SerializedName("input")
    @Expose
    public String mInput;
    @SerializedName("languages")
    @Expose
    public List<Language> mLanguages = new ArrayList<Language>();
    @SerializedName("last_published_at")
    @Expose
    public String mLastPublishedAt;
    @SerializedName("last_revision_number")
    @Expose
    public Long mLastRevisionNumber;
    @SerializedName("name")
    @Expose
    public String mName;
    @SerializedName("output")
    @Expose
    public String mOutput;
    @SerializedName("published_at")
    @Expose
    public String mPublishedAt;
    @SerializedName("published_status")
    @Expose
    public String mPublishedStatus;
    @SerializedName("rank")
    @Expose
    public Long mRank;
    @SerializedName("rank_applied_to_author")
    @Expose
    public Boolean mRankAppliedToAuthor;
    @SerializedName("rank_applied_to_author_at")
    @Expose
    public String mRankAppliedToAuthorAt;
    @SerializedName("rejections_count")
    @Expose
    public Long mRejectionsCount;
    @SerializedName("retired_at")
    @Expose
    public Object mRetiredAt;
    @SerializedName("retired_by_id")
    @Expose
    public Object mRetiredById;
    @SerializedName("revisions")
    @Expose
    public List<Revision> mRevisions = new ArrayList<Revision>();
    @SerializedName("state")
    @Expose
    public String mState;
    @SerializedName("status")
    @Expose
    public String mStatus;
    @SerializedName("system_tags")
    @Expose
    public List<String> mSystemTags = new ArrayList<String>();
    @SerializedName("tags")
    @Expose
    public List<Object> mTags = new ArrayList<Object>();
    @SerializedName("total_attempts")
    @Expose
    public Long mTotalAttempts;
    @SerializedName("total_compete_attempts")
    @Expose
    public Long mTotalCompeteAttempts;
    @SerializedName("total_compete_completed")
    @Expose
    public Long mTotalCompeteCompleted;
    @SerializedName("total_compete_skipped")
    @Expose
    public Long mTotalCompeteSkipped;
    @SerializedName("total_completed")
    @Expose
    public Long mTotalCompleted;
    @SerializedName("total_down_votes")
    @Expose
    public Long mTotalDownVotes;
    @SerializedName("total_favorites")
    @Expose
    public Long mTotalFavorites;
    @SerializedName("total_feedback")
    @Expose
    public Long mTotalFeedback;
    @SerializedName("total_flag_votes")
    @Expose
    public Long mTotalFlagVotes;
    @SerializedName("total_players")
    @Expose
    public Long mTotalPlayers;
    @SerializedName("total_plays")
    @Expose
    public Long mTotalPlays;
    @SerializedName("total_seconds")
    @Expose
    public Float mTotalSeconds;
    @SerializedName("total_skips")
    @Expose
    public Long mTotalSkips;
    @SerializedName("total_stars")
    @Expose
    public Long mTotalStars;
    @SerializedName("total_up_votes")
    @Expose
    public Long mTotalUpVotes;
    @SerializedName("total_vote_score")
    @Expose
    public Long mTotalVoteScore;
    @SerializedName("training_schedule_ids")
    @Expose
    public List<String> mTrainingScheduleIds = new ArrayList<String>();
    @SerializedName("updated_at")
    @Expose
    public String mUpdatedAt;
}
