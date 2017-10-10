
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Paged<T> {

    @SerializedName("totalPages")
    @Expose
    public Long mTotalPages;
    @SerializedName("totalItems")
    @Expose
    public Long mTotalItems;
    @SerializedName("data")
    @Expose
    public List<T> mData = new ArrayList<>();

}
