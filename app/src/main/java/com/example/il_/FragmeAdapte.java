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

public class FragmeAdapte extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Bean.ListBean> arrayList;
    private Context cot;

    public onitemclick onitemclick;

    public FragmeAdapte.onitemclick getOnitemclick() {
        return onitemclick;
    }

    public void setOnitemclick(FragmeAdapte.onitemclick onitemclick) {
        this.onitemclick = onitemclick;
    }

    public FragmeAdapte(ArrayList<Bean.ListBean> arrayList, Context cot) {
        this.arrayList = arrayList;
        this.cot = cot;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(cot).inflate(R.layout.item1, null);
        return  new viewhld(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        viewhld viewhld= (FragmeAdapte.viewhld) holder;
        viewhld.viewById.setText(arrayList.get(position).getDescription());
        Glide.with(cot).load(arrayList.get(position).getImage_url()).into(viewhld.viewById1);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onitemclick.onitemclick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public interface onitemclick{
        void onitemclick(int position);
    }
    private class viewhld extends RecyclerView.ViewHolder {

        private final TextView viewById;
        private final ImageView viewById1;

        public viewhld(View inflate) {
            super(inflate);
            viewById = inflate.findViewById(R.id.te);
            viewById1 = inflate.findViewById(R.id.im);
        }
    }
}
