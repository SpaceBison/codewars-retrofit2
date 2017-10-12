
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rank {

    @SerializedName("id")
    @Expose
    private Long mId;
    @SerializedName("name")
    @Expose
    private String mName;
    @SerializedName("color")
    @Expose
    private String mColor;

    public Long getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getColor() {
        return mColor;
    }
}
