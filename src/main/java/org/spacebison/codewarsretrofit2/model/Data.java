
package org.spacebison.codewarsretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data<T> {

    @SerializedName("data")
    @Expose
    private T mData;

    public T getData() {
        return mData;
    }

    public void setData(T data) {
        mData = data;
    }
}
