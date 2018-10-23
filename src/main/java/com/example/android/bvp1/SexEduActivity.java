package com.example.android.bvp1;


import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//public class SexEduActivity extends AppCompatActivity extends AppCompatActivity implements Sex_Education.OnFragmentInteractionListener, Legal_Education.OnFragmentInteractionListener, Voting_Education.OnFragmentInteractionListener, Health_Education.OnFragmentInteractionListener {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sex_edu);
//    }
//}
//
////package com.example.android.bvp3;



public class SexEduActivity extends AppCompatActivity implements AboutAndFacts.OnFragmentInteractionListener, RepHealth.OnFragmentInteractionListener, SafeSex.OnFragmentInteractionListener, LGBTsexedu.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sex_edu);
        TabLayout tabLayout= (TabLayout)findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("About & Facts"));
        tabLayout.addTab(tabLayout.newTab().setText("Sexual Health & Rights"));
        tabLayout.addTab(tabLayout.newTab().setText("Sexual Abuse"));
        tabLayout.addTab(tabLayout.newTab().setText("Helpline & LearnMore"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager=(ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter= new PageAdaptor(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}