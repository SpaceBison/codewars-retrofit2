
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class RevisedEmbeds {

    @SerializedName("languages")
    @Expose
    private Map<String, LanguageEmbed> mLanguages = new HashMap<>();

    public Map<String, LanguageEmbed> getLanguages() {
        return mLanguages;
    }
}
