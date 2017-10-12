
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Paged<T> {

    @SerializedName("totalPages")
    @Expose
    private Long mTotalPages;
    @SerializedName("totalItems")
    @Expose
    private Long mTotalItems;
    @SerializedName("data")
    @Expose
    private List<T> mData = new ArrayList<>();

    public Long getTotalPages() {
        return mTotalPages;
    }

    public Long getTotalItems() {
        return mTotalItems;
    }

    public List<T> getData() {
        return mData;
    }
}
