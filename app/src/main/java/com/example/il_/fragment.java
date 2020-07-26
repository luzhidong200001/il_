package com.example.il_;

import android.content.Intent;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.il_.Ba.BaseFragment;
import com.example.il_.pr.Pre;
import com.example.il_.vie.Vie;

import java.util.ArrayList;
import java.util.Collections;

import butterknife.BindView;

public class fragment extends BaseFragment<Pre> implements Vie {

    private ArrayList<Bean.ListBean> listBeanArrayList;
    private FragmeAdapte fragmeAdapte;

    @Override
    protected void initdata() {
        pre.get();
    }
    @BindView(R.id.re)
    RecyclerView recyclerView;
    @Override
    protected void initview() {
        listBeanArrayList = new ArrayList<>();
        fragmeAdapte = new FragmeAdapte(listBeanArrayList,getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(fragmeAdapte);
        fragmeAdapte.setOnitemclick(new FragmeAdapte.onitemclick() {
            @Override
            public void onitemclick(int position) {
//                Intent intent = new Intent(getActivity(), Activity.class);
//                startActivity(intent);
//                listBeanArrayList.remove(position);
//                listBeanArrayList
//                Collections.swap(listBeanArrayList, position, );
                listBeanArrayList.add(position, listBeanArrayList.get(position));
                fragmeAdapte.notifyItemChanged(position, listBeanArrayList.size()-position);
            }
        });
    } boolean in;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser){
            Toast.makeText(getActivity(), "A", Toast.LENGTH_LONG).show();
            in=false;
        }

    }

    @Override
    protected void initpre() {
        pre=new Pre();
    }

    @Override
    protected int get() {
        return R.layout.frag;
    }

    @Override
    public void onsucess(ArrayList<Bean.ListBean> arrayList) {
        if (arrayList!=null){
            listBeanArrayList.addAll(arrayList);
            fragmeAdapte.notifyDataSetChanged();
        }
    }
}
