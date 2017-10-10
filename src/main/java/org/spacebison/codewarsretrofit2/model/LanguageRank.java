
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LanguageRank {

    @SerializedName("rank")
    @Expose
    private Long mRank;
    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("color")
    @Expose
    private String mColor;
    @SerializedName("score")
    @Expose
    private Long mScore;

    public Long getRank() {
        return mRank;
    }

    public String getName() {
        return mName;
    }

    public String getColor() {
        return mColor;
    }

    public Long getScore() {
        return mScore;
    }

}
