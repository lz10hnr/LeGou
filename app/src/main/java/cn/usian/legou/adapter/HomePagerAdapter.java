package cn.usian.legou.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import cn.usian.legou.base.BaseFragment;

/**
 * Created by TuLing on 2017/3/13.
 */
public class HomePagerAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> fragments;
    private List<String> titles;
    public HomePagerAdapter(FragmentManager fm, List<BaseFragment> fragments,List<String> titles) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get( fragments.size());
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}