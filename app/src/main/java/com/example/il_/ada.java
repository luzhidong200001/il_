package com.example.il_;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class ada extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> arrayList;
    private ArrayList<String> list;

    public ada(@NonNull FragmentManager fm, ArrayList<Fragment> arrayList, ArrayList<String> list) {
        super(fm);
        this.arrayList = arrayList;
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}
