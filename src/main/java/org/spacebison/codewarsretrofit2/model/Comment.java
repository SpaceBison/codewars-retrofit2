
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comment {

    @SerializedName("_id")
    @Expose
    private String mId;
    @SerializedName("comment_reference_id")
    @Expose
    private String mCommentReferenceId;
    @SerializedName("created_at")
    @Expose
    private Date mCreatedAt;
    @SerializedName("edit_count")
    @Expose
    private Long mEditCount;
    @SerializedName("extra")
    @Expose
    private Extra mExtra;
    @SerializedName("label")
    @Expose
    private Object mLabel;
    @SerializedName("last_edited_on")
    @Expose
    private Object mLastEditedOn;
    @SerializedName("markdown")
    @Expose
    private String mMarkdown;
    @SerializedName("masked")
    @Expose
    private Object mMasked;
    @SerializedName("masked_by_id")
    @Expose
    private Object mMaskedById;
    @SerializedName("state")
    @Expose
    private String mState;
    @SerializedName("updated_at")
    @Expose
    private String mUpdatedAt;
    @SerializedName("user_id")
    @Expose
    private String mUserId;
    @SerializedName("votes")
    @Expose
    private List<Vote> mVotes = new ArrayList<Vote>();
    @SerializedName("votes_score")
    @Expose
    private Long mVotesScore;
    @SerializedName("comments")
    @Expose
    private List<Comment> mComments = new ArrayList<>();

    public String getId() {
        return mId;
    }

    public String getCommentReferenceId() {
        return mCommentReferenceId;
    }

    public Date getCreatedAt() {
        return mCreatedAt;
    }

    public Long getEditCount() {
        return mEditCount;
    }

    public Extra getExtra() {
        return mExtra;
    }

    public Object getLabel() {
        return mLabel;
    }

    public Object getLastEditedOn() {
        return mLastEditedOn;
    }

    public String getMarkdown() {
        return mMarkdown;
    }

    public Object getMasked() {
        return mMasked;
    }

    public Object getMaskedById() {
        return mMaskedById;
    }

    public String getState() {
        return mState;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public String getUserId() {
        return mUserId;
    }

    public List<Vote> getVotes() {
        return mVotes;
    }

    public Long getVotesScore() {
        return mVotesScore;
    }

    public List<Comment> getComments() {
        return mComments;
    }
}
