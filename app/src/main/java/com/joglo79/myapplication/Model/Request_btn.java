package com.joglo79.myapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import okhttp3.internal.http2.Header;

/**
 * Created by firma on 18-Jan-18.
 */

public class Request_btn {
    @SerializedName("__type")
    @Expose
    private String type;
    @SerializedName("className")
    @Expose
    private String className;
    @SerializedName("objectId")
    @Expose
    private String objectId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public class Product {

        @SerializedName("__type")
        @Expose
        private String type;
        @SerializedName("className")
        @Expose
        private String className;
        @SerializedName("objectId")
        @Expose
        private String objectId;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public String getObjectId() {
            return objectId;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

    }

    public class RequestBtn {

        @SerializedName("result")
        @Expose
        private Result result;

        public Result getResult() {
            return result;
        }

        public void setResult(Result result) {
            this.result = result;
        }

    }

    public class Result {

        @SerializedName("header")
        @Expose
        private Header header;
        @SerializedName("product")
        @Expose
        private Product product;
        @SerializedName("quantity")
        @Expose
        private Integer quantity;
        @SerializedName("createdAt")
        @Expose
        private String createdAt;
        @SerializedName("updatedAt")
        @Expose
        private String updatedAt;
        @SerializedName("objectId")
        @Expose
        private String objectId;
        @SerializedName("__type")
        @Expose
        private String type;
        @SerializedName("className")
        @Expose
        private String className;

        public Header getHeader() {
            return header;
        }

        public void setHeader(Header header) {
            this.header = header;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getObjectId() {
            return objectId;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

    }
}
