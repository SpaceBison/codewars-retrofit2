
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LanguageEmbed {

    @SerializedName("package")
    @Expose
    public String mPackage;
    @SerializedName("setup")
    @Expose
    public String mSetup;
    @SerializedName("answer")
    @Expose
    public String mAnswer;
    @SerializedName("fixture")
    @Expose
    public String mFixture;

}
