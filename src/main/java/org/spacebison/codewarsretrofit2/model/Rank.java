
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rank {

    @SerializedName("id")
    @Expose
    public Long mId;
    @SerializedName("name")
    @Expose
    public String mName;
    @SerializedName("color")
    @Expose
    public String mColor;

}
