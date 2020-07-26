package com.example.il_;

import android.content.Intent;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.il_.Ba.BaseFragment;
import com.example.il_.pr.Pre;
import com.example.il_.vie.Vie;

import java.util.ArrayList;

import butterknife.BindView;

public class GataFragment extends BaseFragment<Pre> implements Vie {
    @BindView(R.id.lin123)
    RecyclerView recyclerView;
    @BindView(R.id.txt_tv)
    TextView tv;

    private ArrayList<Bean.ListBean> arrayList;
    private com.example.il_.adapter adapter;

    @Override
    protected void initdata() {
        pre.get();
    }

    @Override
    protected void initview() {
        arrayList = new ArrayList<>();
        adapter = new adapter(arrayList, getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        adapter.setOnitemClick(new adapter.OnitemClick() {
            @Override
            public void onitemclick(int position) {
//                startActivity(new Intent(getActivity(),Activity.class));
            }
        });
    }

    @Override
    protected void initpre() {
        pre=new Pre();
    }

    @Override
    protected int get() {
        return R.layout.fragment1;
    }

    @Override
    public void onsucess(ArrayList<Bean.ListBean> arrayList1) {
        if (arrayList1!=null) {
            arrayList.addAll(arrayList1);
            adapter.notifyDataSetChanged();
        }
    }
}
