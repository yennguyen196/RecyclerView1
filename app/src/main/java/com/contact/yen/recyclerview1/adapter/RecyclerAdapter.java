package com.contact.yen.recyclerview1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.contact.yen.recyclerview1.R;
import com.contact.yen.recyclerview1.model.ObjectImage;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private List<ObjectImage> arrObjectImage;

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView1;
        private TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mImageView1 = itemView.findViewById(R.id.image_view1);
            mTextView = itemView.findViewById(R.id.text_view);
        }
    }
    public RecyclerAdapter(Context context, ArrayList<ObjectImage> arrImage) {
        this.arrObjectImage = arrImage;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hero,null);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mImageView1.setImageResource(arrObjectImage.get(position).getmImageId());
        holder.mTextView.setText(arrObjectImage.get(position).getmName());
    }

    @Override
    public int getItemCount() {
        return arrObjectImage.size();
    }
}
