package com.example.flagsoftheworld;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class BaseFragmentPagerAdapter extends FragmentPagerAdapter {
    public BaseFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return new ListFragment();
        else if(position==1)
            return new LeaderFragment();
        else
            return new QuizFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){
        if(position==0)
            return "Flags";
        else if(position==1)
            return "Leaderboard";
        else
            return "Quiz";
    }
}
