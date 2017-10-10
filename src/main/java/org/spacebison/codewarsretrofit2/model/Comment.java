
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Comment {

    @SerializedName("_id")
    @Expose
    public String mId;
    @SerializedName("comment_reference_id")
    @Expose
    public String mCommentReferenceId;
    @SerializedName("created_at")
    @Expose
    public String mCreatedAt;
    @SerializedName("edit_count")
    @Expose
    public Long mEditCount;
    @SerializedName("extra")
    @Expose
    public Extra mExtra;
    @SerializedName("label")
    @Expose
    public Object mLabel;
    @SerializedName("last_edited_on")
    @Expose
    public Object mLastEditedOn;
    @SerializedName("markdown")
    @Expose
    public String mMarkdown;
    @SerializedName("masked")
    @Expose
    public Object mMasked;
    @SerializedName("masked_by_id")
    @Expose
    public Object mMaskedById;
    @SerializedName("state")
    @Expose
    public String mState;
    @SerializedName("updated_at")
    @Expose
    public String mUpdatedAt;
    @SerializedName("user_id")
    @Expose
    public String mUserId;
    @SerializedName("votes")
    @Expose
    public List<Vote> mVotes = new ArrayList<Vote>();
    @SerializedName("votes_score")
    @Expose
    public Long mVotesScore;
    @SerializedName("comments")
    @Expose
    public List<Comment> mComments = new ArrayList<>();

}
