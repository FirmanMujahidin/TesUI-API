package com.joglo79.myapplication.Model;

import android.graphics.Picture;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.xml.transform.Result;

/**
 * Created by firma on 18-Jan-18.
 */

public class Amenities_list {

    @SerializedName("result")
    @Expose
    private Result result;
    private boolean selected;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    // Tambah manual
    public boolean isSelected() {
        return selected;
    }

    public int getQyt() {
        return getQyt();
    }

    public class Category {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class Datum {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("discount")
        @Expose
        private Integer discount;
        @SerializedName("price")
        @Expose
        private Integer price;
        @SerializedName("rating")
        @Expose
        private Integer rating;
        @SerializedName("picture")
        @Expose
        private Picture picture;
        @SerializedName("outlet_id")
        @Expose
        private String outletId;
        @SerializedName("outlet_name")
        @Expose
        private String outletName;
        @SerializedName("outlet_type_id")
        @Expose
        private String outletTypeId;
        @SerializedName("outlet_type_name")
        @Expose
        private String outletTypeName;
        @SerializedName("outlet_type_can_reservation")
        @Expose
        private Boolean outletTypeCanReservation;
        @SerializedName("is_nett")
        @Expose
        private Boolean isNett;
        @SerializedName("price_plus")
        @Expose
        private Integer pricePlus;
        @SerializedName("price_nett")
        @Expose
        private Integer priceNett;
        @SerializedName("short_description")
        @Expose
        private String shortDescription;
        @SerializedName("long_description")
        @Expose
        private String longDescription;
        @SerializedName("category")
        @Expose
        private Category category;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Integer getDiscount() {
            return discount;
        }

        public void setDiscount(Integer discount) {
            this.discount = discount;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Integer getRating() {
            return rating;
        }

        public void setRating(Integer rating) {
            this.rating = rating;
        }

        public Picture getPicture() {
            return picture;
        }

        public void setPicture(Picture picture) {
            this.picture = picture;
        }

        public String getOutletId() {
            return outletId;
        }

        public void setOutletId(String outletId) {
            this.outletId = outletId;
        }

        public String getOutletName() {
            return outletName;
        }

        public void setOutletName(String outletName) {
            this.outletName = outletName;
        }

        public String getOutletTypeId() {
            return outletTypeId;
        }

        public void setOutletTypeId(String outletTypeId) {
            this.outletTypeId = outletTypeId;
        }

        public String getOutletTypeName() {
            return outletTypeName;
        }

        public void setOutletTypeName(String outletTypeName) {
            this.outletTypeName = outletTypeName;
        }

        public Boolean getOutletTypeCanReservation() {
            return outletTypeCanReservation;
        }

        public void setOutletTypeCanReservation(Boolean outletTypeCanReservation) {
            this.outletTypeCanReservation = outletTypeCanReservation;
        }

        public Boolean getIsNett() {
            return isNett;
        }

        public void setIsNett(Boolean isNett) {
            this.isNett = isNett;
        }

        public Integer getPricePlus() {
            return pricePlus;
        }

        public void setPricePlus(Integer pricePlus) {
            this.pricePlus = pricePlus;
        }

        public Integer getPriceNett() {
            return priceNett;
        }

        public void setPriceNett(Integer priceNett) {
            this.priceNett = priceNett;
        }

        public String getShortDescription() {
            return shortDescription;
        }

        public void setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
        }

        public String getLongDescription() {
            return longDescription;
        }

        public void setLongDescription(String longDescription) {
            this.longDescription = longDescription;
        }

        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }

    }

    public class Error {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("message")
        @Expose
        private String message;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

    public class Picture {

        @SerializedName("__type")
        @Expose
        private String type;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("url")
        @Expose
        private String url;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    public class Result {

        @SerializedName("status")
        @Expose
        private Boolean status;
        @SerializedName("error")
        @Expose
        private Error error;
        @SerializedName("success")
        @Expose
        private Success success;

        public Boolean getStatus() {
            return status;
        }

        public void setStatus(Boolean status) {
            this.status = status;
        }

        public Error getError() {
            return error;
        }

        public void setError(Error error) {
            this.error = error;
        }

        public Success getSuccess() {
            return success;
        }

        public void setSuccess(Success success) {
            this.success = success;
        }

    }

    public class Result_ {

        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("data")
        @Expose
        private List<Datum> data = null;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public List<Datum> getData() {
            return data;
        }

        public void setData(List<Datum> data) {
            this.data = data;
        }

    }

    public class Success {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("result")
        @Expose
        private Result_ result;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Result_ getResult() {
            return result;
        }

        public void setResult(Result_ result) {
            this.result = result;
        }

    }
}

