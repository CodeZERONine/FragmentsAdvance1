package org.akshanshgusain.fragmentsadvance;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsSatePagerAdapter extends FragmentStatePagerAdapter {
    private List<String> mFragmentTitleList=new ArrayList<>();
    private List<Fragment> mFragmentList= new ArrayList<>();

     public SectionsSatePagerAdapter(FragmentManager fm) {
        super(fm);
    }
    public void addFragment(Fragment fragment, String title)
    {
         mFragmentList.add(fragment);
         mFragmentTitleList.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
