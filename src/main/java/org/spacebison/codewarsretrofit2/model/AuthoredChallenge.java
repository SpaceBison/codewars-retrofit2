
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class AuthoredChallenge {

    @SerializedName("_id")
    @Expose
    private String mId;
    @SerializedName("_slugs")
    @Expose
    private List<String> mSlugs = new ArrayList<String>();
    @SerializedName("admin_tags")
    @Expose
    private Object mAdminTags;
    @SerializedName("api_version")
    @Expose
    private Long mApiVersion;
    @SerializedName("approvals_count")
    @Expose
    private Long mApprovalsCount;
    @SerializedName("approved_at")
    @Expose
    private String mApprovedAt;
    @SerializedName("approved_by_id")
    @Expose
    private String mApprovedById;
    @SerializedName("average_completion")
    @Expose
    private Float mAverageCompletion;
    @SerializedName("beta_status")
    @Expose
    private String mBetaStatus;
    @SerializedName("category")
    @Expose
    private String mCategory;
    @SerializedName("comments")
    @Expose
    private List<Comment> mComments = new ArrayList<Comment>();
    @SerializedName("created_at")
    @Expose
    private String mCreatedAt;
    @SerializedName("created_by_id")
    @Expose
    private String mCreatedById;
    @SerializedName("description")
    @Expose
    private String mDescription;
    @SerializedName("estimated_rank")
    @Expose
    private Object mEstimatedRank;
    @SerializedName("forks_count")
    @Expose
    private Long mForksCount;
    @SerializedName("input")
    @Expose
    private String mInput;
    @SerializedName("languages")
    @Expose
    private List<String> mLanguages = new ArrayList<>();
    @SerializedName("last_published_at")
    @Expose
    private String mLastPublishedAt;
    @SerializedName("last_revision_number")
    @Expose
    private Long mLastRevisionNumber;
    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("output")
    @Expose
    private String mOutput;
    @SerializedName("published_at")
    @Expose
    private String mPublishedAt;
    @SerializedName("published_status")
    @Expose
    private String mPublishedStatus;
    @SerializedName("rank")
    @Expose
    private Long mRank;
    @SerializedName("rank_applied_to_author")
    @Expose
    private Boolean mRankAppliedToAuthor;
    @SerializedName("rank_applied_to_author_at")
    @Expose
    private String mRankAppliedToAuthorAt;
    @SerializedName("rejections_count")
    @Expose
    private Long mRejectionsCount;
    @SerializedName("retired_at")
    @Expose
    private Object mRetiredAt;
    @SerializedName("retired_by_id")
    @Expose
    private Object mRetiredById;
    @SerializedName("revisions")
    @Expose
    private List<Revision> mRevisions = new ArrayList<Revision>();
    @SerializedName("state")
    @Expose
    private String mState;
    @SerializedName("status")
    @Expose
    private String mStatus;
    @SerializedName("system_tags")
    @Expose
    private List<String> mSystemTags = new ArrayList<String>();
    @SerializedName("tags")
    @Expose
    private List<Object> mTags = new ArrayList<Object>();
    @SerializedName("total_attempts")
    @Expose
    private Long mTotalAttempts;
    @SerializedName("total_compete_attempts")
    @Expose
    private Long mTotalCompeteAttempts;
    @SerializedName("total_compete_completed")
    @Expose
    private Long mTotalCompeteCompleted;
    @SerializedName("total_compete_skipped")
    @Expose
    private Long mTotalCompeteSkipped;
    @SerializedName("total_completed")
    @Expose
    private Long mTotalCompleted;
    @SerializedName("total_down_votes")
    @Expose
    private Long mTotalDownVotes;
    @SerializedName("total_favorites")
    @Expose
    private Long mTotalFavorites;
    @SerializedName("total_feedback")
    @Expose
    private Long mTotalFeedback;
    @SerializedName("total_flag_votes")
    @Expose
    private Long mTotalFlagVotes;
    @SerializedName("total_players")
    @Expose
    private Long mTotalPlayers;
    @SerializedName("total_plays")
    @Expose
    private Long mTotalPlays;
    @SerializedName("total_seconds")
    @Expose
    private Float mTotalSeconds;
    @SerializedName("total_skips")
    @Expose
    private Long mTotalSkips;
    @SerializedName("total_stars")
    @Expose
    private Long mTotalStars;
    @SerializedName("total_up_votes")
    @Expose
    private Long mTotalUpVotes;
    @SerializedName("total_vote_score")
    @Expose
    private Long mTotalVoteScore;
    @SerializedName("training_schedule_ids")
    @Expose
    private List<String> mTrainingScheduleIds = new ArrayList<String>();
    @SerializedName("updated_at")
    @Expose
    private String mUpdatedAt;

    public String getId() {
        return mId;
    }

    public List<String> getSlugs() {
        return mSlugs;
    }

    public Object getAdminTags() {
        return mAdminTags;
    }

    public Long getApiVersion() {
        return mApiVersion;
    }

    public Long getApprovalsCount() {
        return mApprovalsCount;
    }

    public String getApprovedAt() {
        return mApprovedAt;
    }

    public String getApprovedById() {
        return mApprovedById;
    }

    public Float getAverageCompletion() {
        return mAverageCompletion;
    }

    public String getBetaStatus() {
        return mBetaStatus;
    }

    public String getCategory() {
        return mCategory;
    }

    public List<Comment> getComments() {
        return mComments;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public String getCreatedById() {
        return mCreatedById;
    }

    public String getDescription() {
        return mDescription;
    }

    public Object getEstimatedRank() {
        return mEstimatedRank;
    }

    public Long getForksCount() {
        return mForksCount;
    }

    public String getInput() {
        return mInput;
    }

    public List<String> getLanguages() {
        return mLanguages;
    }

    public String getLastPublishedAt() {
        return mLastPublishedAt;
    }

    public Long getLastRevisionNumber() {
        return mLastRevisionNumber;
    }

    public String getName() {
        return mName;
    }

    public String getOutput() {
        return mOutput;
    }

    public String getPublishedAt() {
        return mPublishedAt;
    }

    public String getPublishedStatus() {
        return mPublishedStatus;
    }

    public Long getRank() {
        return mRank;
    }

    public Boolean getRankAppliedToAuthor() {
        return mRankAppliedToAuthor;
    }

    public String getRankAppliedToAuthorAt() {
        return mRankAppliedToAuthorAt;
    }

    public Long getRejectionsCount() {
        return mRejectionsCount;
    }

    public Object getRetiredAt() {
        return mRetiredAt;
    }

    public Object getRetiredById() {
        return mRetiredById;
    }

    public List<Revision> getRevisions() {
        return mRevisions;
    }

    public String getState() {
        return mState;
    }

    public String getStatus() {
        return mStatus;
    }

    public List<String> getSystemTags() {
        return mSystemTags;
    }

    public List<Object> getTags() {
        return mTags;
    }

    public Long getTotalAttempts() {
        return mTotalAttempts;
    }

    public Long getTotalCompeteAttempts() {
        return mTotalCompeteAttempts;
    }

    public Long getTotalCompeteCompleted() {
        return mTotalCompeteCompleted;
    }

    public Long getTotalCompeteSkipped() {
        return mTotalCompeteSkipped;
    }

    public Long getTotalCompleted() {
        return mTotalCompleted;
    }

    public Long getTotalDownVotes() {
        return mTotalDownVotes;
    }

    public Long getTotalFavorites() {
        return mTotalFavorites;
    }

    public Long getTotalFeedback() {
        return mTotalFeedback;
    }

    public Long getTotalFlagVotes() {
        return mTotalFlagVotes;
    }

    public Long getTotalPlayers() {
        return mTotalPlayers;
    }

    public Long getTotalPlays() {
        return mTotalPlays;
    }

    public Float getTotalSeconds() {
        return mTotalSeconds;
    }

    public Long getTotalSkips() {
        return mTotalSkips;
    }

    public Long getTotalStars() {
        return mTotalStars;
    }

    public Long getTotalUpVotes() {
        return mTotalUpVotes;
    }

    public Long getTotalVoteScore() {
        return mTotalVoteScore;
    }

    public List<String> getTrainingScheduleIds() {
        return mTrainingScheduleIds;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }
}
