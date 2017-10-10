
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreatedBy {

    @SerializedName("username")
    @Expose
    public String username;
    @SerializedName("url")
    @Expose
    public String url;

}
