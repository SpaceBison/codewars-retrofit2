
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data<T> {

    @SerializedName("data")
    @Expose
    private List<T> mData;

    public List<T> getData() {
        return mData;
    }
}
