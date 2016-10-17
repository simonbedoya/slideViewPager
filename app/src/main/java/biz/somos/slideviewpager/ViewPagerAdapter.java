package biz.somos.slideviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sbv23 on 16/10/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitle = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    public void addFragment (Fragment fragment, String titleFragment){
        fragmentList.add(fragment);
        fragmentTitle.add(titleFragment);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }
}
