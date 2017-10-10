
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {

    @SerializedName("username")
    @Expose
    private String mUsername;
    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("honor")
    @Expose
    private Long mHonor;
    @SerializedName("clan")
    @Expose
    private String mClan;
    @SerializedName("leaderboardPosition")
    @Expose
    private Long mLeaderboardPosition;
    @SerializedName("skills")
    @Expose
    private List<String> mSkills = null;
    @SerializedName("ranks")
    @Expose
    private Ranks mRanks;
    @SerializedName("codeChallenges")
    @Expose
    private CodeChallenges mCodeChallenges;

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        this.mUsername = username;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public Long getHonor() {
        return mHonor;
    }

    public void setHonor(Long honor) {
        this.mHonor = honor;
    }

    public String getClan() {
        return mClan;
    }

    public void setClan(String clan) {
        this.mClan = clan;
    }

    public Long getLeaderboardPosition() {
        return mLeaderboardPosition;
    }

    public void setLeaderboardPosition(Long leaderboardPosition) {
        this.mLeaderboardPosition = leaderboardPosition;
    }

    public List<String> getSkills() {
        return mSkills;
    }

    public void setSkills(List<String> skills) {
        this.mSkills = skills;
    }

    public Ranks getRanks() {
        return mRanks;
    }

    public void setRanks(Ranks ranks) {
        this.mRanks = ranks;
    }

    public CodeChallenges getCodeChallenges() {
        return mCodeChallenges;
    }

    public void setCodeChallenges(CodeChallenges codeChallenges) {
        this.mCodeChallenges = codeChallenges;
    }

}
