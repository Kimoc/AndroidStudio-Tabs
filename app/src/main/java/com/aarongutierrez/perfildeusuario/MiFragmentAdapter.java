package com.aarongutierrez.perfildeusuario;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MiFragmentAdapter extends FragmentPagerAdapter {

    private int N_PAGES = 3;
    public MiFragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 1:
                PlaceholderFragment fragment = new PlaceholderFragment();
                return fragment;

        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
