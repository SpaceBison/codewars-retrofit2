
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class RevisedEmbeds {

    @SerializedName("languages")
    @Expose
    public Map<String, LanguageEmbed> mLanguages = new HashMap<>();

}
