package com.joglo79.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.joglo79.myapplication.Adapter.GetListAdapter;
import com.joglo79.myapplication.Model.Amenities_list;
import com.joglo79.myapplication.Rest.ApiClient;
import com.joglo79.myapplication.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Context context = null;
    ApiInterface mApiInterface;
    RecyclerView mRecyclerView;
    Button mButton;
    RecyclerView.LayoutManager mLayoutManager;
    List<Amenities_list> mAmenitiesAdapter;
    GetListAdapter mLayoutAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.mRecyclerView);
        mButton = findViewById(R.id.mBtn);
        mApiInterface = ApiClient.initRetrofit();
        refresh();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

    }

    void showDialog(){
        final Dialog dialog = new Dialog(MainActivity.this,R.style.CustomDialogTheme);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.item_aminetis_popup);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(true);
        dialog.show();


        Button btnBtmYes =  dialog.findViewById(R.id.btnBtmYes);
        Button btnBtmNo =  dialog.findViewById(R.id.btnBtmNo);

        btnBtmYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Diganti pakai popup selanjutnya
                dismis();
            }
        });

        btnBtmNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

//        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
//        int dialogWidth = (int)(displayMetrics.widthPixels * 0.50);
//        int dialogHeight = (int)(displayMetrics.heightPixels * 0.50);
//        dialog.getWindow().setLayout(dialogWidth, dialogHeight);

        dialog.show();
    }

    void dismis(){
        final Dialog dialog = new Dialog(MainActivity.this,R.style.CustomDialogTheme);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.item_dismis_popup);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(true);
        dialog.show();

        Button btnBtmDismis =  dialog.findViewById(R.id.btnBtDismis);

        btnBtmDismis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent in = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(in);
            }
        });

        dialog.show();
    }



    void refresh(){
        final Call<Amenities_list> listCall = mApiInterface.pushList("application/json","app", "master", "9ddbac20813a2a17");
        listCall.enqueue(new Callback<Amenities_list>() {
            @Override
            public void onResponse(Call<Amenities_list> call, Response<Amenities_list> response) {
                List<Amenities_list.Datum> datumList = response.body().getResult().getSuccess().getResult().getData();

                Log.d(TAG, "onResponse: " + response.body().getResult().getStatus());

                if (response.isSuccessful()){
                    mLayoutAdapter = new GetListAdapter(datumList, getApplicationContext());
                    mLayoutManager = new LinearLayoutManager(getApplicationContext());
                    mRecyclerView.setLayoutManager(mLayoutManager);
                    mRecyclerView.setAdapter(mLayoutAdapter);
                }
            }

            @Override
            public void onFailure(Call<Amenities_list> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
            }
        });
    }




}
