
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Ranks {

    @SerializedName("overall")
    @Expose
    private LanguageRank mOverall;
    @SerializedName("mLanguages")
    @Expose
    private Map<String, LanguageRank> mLanguages = new HashMap<>();

    public LanguageRank getOverall() {
        return mOverall;
    }

    public Map<String, LanguageRank> getLanguages() {
        return mLanguages;
    }
}
