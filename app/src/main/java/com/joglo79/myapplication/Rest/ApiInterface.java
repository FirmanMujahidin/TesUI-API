package com.joglo79.myapplication.Rest;

import com.joglo79.myapplication.Model.Amenities_list;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by firma on 18-Jan-18.
 */

public interface ApiInterface {

    @POST("boh_amenities_list")
        Call<Amenities_list> pushList (
                @Header("Content-Type") String type,
                @Header("X-Parse-Application-Id") String parse,
                @Header("X-Parse-REST-API-Key") String RestApiKey,
                @Header("device_id") String device_id);

    @POST("boh_amenities_request")
        Call<Amenities_list> request (
            @Header("Content-Type") String type,
            @Header("X-Parse-Application-Id") String parse,
            @Header("X-Parse-REST-API-Key") String RestApiKey,
            @Header("device_id") String device_id,
            @Body JSONObject body);

}
