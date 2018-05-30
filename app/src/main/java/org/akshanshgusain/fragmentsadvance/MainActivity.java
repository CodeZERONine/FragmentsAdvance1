package org.akshanshgusain.fragmentsadvance;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private SectionsSatePagerAdapter sectionsSatePagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sectionsSatePagerAdapter=new SectionsSatePagerAdapter(getSupportFragmentManager());
        viewPager=(ViewPager)findViewById(R.id.container);
        //setup pager
        setupViewPager(viewPager);
    }
    private void setupViewPager(ViewPager viewPager){
        SectionsSatePagerAdapter adapter= new SectionsSatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(),"Fragment1");
        adapter.addFragment(new Fragment2(),"Fragment2");
        adapter.addFragment(new Fragment3(),"Fragment3");
        viewPager.setAdapter(adapter);

    }
    public void setViewPager(int position){
        viewPager.setCurrentItem(position);
    }
}
