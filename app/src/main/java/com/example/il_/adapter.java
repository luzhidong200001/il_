package com.example.il_;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<Bean.ListBean> arrayList;
    private Context co;

    public OnitemClick onitemClick;

    public OnitemClick getOnitemClick() {
        return onitemClick;
    }

    public void setOnitemClick(OnitemClick onitemClick) {
        this.onitemClick = onitemClick;
    }

    public adapter(ArrayList<Bean.ListBean> arrayList, Context co) {
        this.arrayList = arrayList;
        this.co = co;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(co).inflate(R.layout.itemnu, null);
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        viewholder viewholder= (adapter.viewholder) holder;
        Glide.with(co).load(arrayList.get(position).getImage_url()).into(viewholder.viewById);
        viewholder.viewById1.setText(arrayList.get(position).getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onitemClick.onitemclick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    private class viewholder extends RecyclerView.ViewHolder {

        private final ImageView viewById;
        private final TextView viewById1;

        public viewholder(View inflate) {
            super(inflate);
            viewById = inflate.findViewById(R.id.i);
            viewById1 = inflate.findViewById(R.id.t);
        }
    }
    public interface OnitemClick{
        void onitemclick(int position);
    }
}
