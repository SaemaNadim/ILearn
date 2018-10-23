package com.example.android.bvp1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdaptor extends FragmentStatePagerAdapter {
    int Nooftabs;
    public PageAdaptor(FragmentManager fm, int NumberofTabs) {
        super(fm);
        this.Nooftabs=NumberofTabs;
    }

//    public PageAdaptor(FragmentManager supportFragmentManager, int tabCount) {
//        super();
//    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                AboutAndFacts tab1 = new AboutAndFacts();
                return tab1;
            case 1:
                RepHealth tab2= new RepHealth();
                return tab2;
            case 2:
                SafeSex tab3= new SafeSex();
                return tab3;
//            case 2:
//                LGBTsexedu tab=new LGBTsexedu();
//                return tab4;
            case 3:
                LGBTsexedu tab4= new LGBTsexedu();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return Nooftabs;
    }

}
