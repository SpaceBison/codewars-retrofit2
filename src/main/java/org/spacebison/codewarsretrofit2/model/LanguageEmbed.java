
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LanguageEmbed {

    @SerializedName("package")
    @Expose
    private String mPackage;
    @SerializedName("setup")
    @Expose
    private String mSetup;
    @SerializedName("answer")
    @Expose
    private String mAnswer;
    @SerializedName("fixture")
    @Expose
    private String mFixture;

    public String getPackage() {
        return mPackage;
    }

    public String getSetup() {
        return mSetup;
    }

    public String getAnswer() {
        return mAnswer;
    }

    public String getFixture() {
        return mFixture;
    }
}
