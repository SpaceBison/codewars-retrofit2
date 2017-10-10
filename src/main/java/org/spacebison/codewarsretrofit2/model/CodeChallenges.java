
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CodeChallenges {

    @SerializedName("totalAuthored")
    @Expose
    private Long mTotalAuthored;
    @SerializedName("totalCompleted")
    @Expose
    private Long mTotalCompleted;

    public Long getTotalAuthored() {
        return mTotalAuthored;
    }

    public Long getTotalCompleted() {
        return mTotalCompleted;
    }

}
