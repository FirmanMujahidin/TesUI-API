package com.joglo79.myapplication.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.joglo79.myapplication.Model.Amenities_list;
import com.joglo79.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by firma on 18-Jan-18.
 */

public class GetListAdapter extends RecyclerView.Adapter<GetListAdapter.MyViewHolder> {

    List<Amenities_list.Datum> mResultList;
    private Context mContext;
    private boolean isSelectedAll;

    public GetListAdapter(List<Amenities_list.Datum> mResultList, Context mContext) {
        this.mResultList = mResultList;
        this.mContext = mContext;
    }

    public void selectAll(){
        Log.d("onClickSelectAll","yes");
        isSelectedAll = true;
        notifyDataSetChanged();
    }

    @Override
    public GetListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Amenities_list.Datum item = mResultList.get(position);

        holder.mTeks.setText(item.getTitle());
//        holder.mCheckBox.setChecked(imageModelArrayList.add(position));
//        holder.mCheckBox.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!isSelectedAll) holder.mCheckBox.setChecked(false);
//                else holder.mCheckBox.setChecked(true);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return mResultList == null ? 0 : mResultList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public CheckBox mCheckBox;
        public TextView mTeks;

        public MyViewHolder(View itemView) {
            super(itemView);

            mCheckBox =  itemView.findViewById(R.id.checkbox);
            mTeks =  itemView.findViewById(R.id.teks);
        }
    }
}
