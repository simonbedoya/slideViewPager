package biz.somos.slideviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import biz.somos.slideviewpager.Fragments.OneFragment;
import biz.somos.slideviewpager.Fragments.SecondFragment;
import biz.somos.slideviewpager.Fragments.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    protected TabLayout tabLayout;
    protected ViewPager viewPager;
    protected ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new OneFragment(), "One");
        viewPagerAdapter.addFragment(new SecondFragment(), "Second");
        viewPagerAdapter.addFragment(new ThirdFragment(), "Third");

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}
