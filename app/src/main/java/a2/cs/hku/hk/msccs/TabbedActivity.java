package a2.cs.hku.hk.msccs;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import a2.cs.hku.hk.msccs.fragments.AlumniFragment;
import a2.cs.hku.hk.msccs.fragments.ApplicantFragment;
import a2.cs.hku.hk.msccs.fragments.StudentFragment;

import static a2.cs.hku.hk.msccs.MainActivity.POS_ALUMNI;
import static a2.cs.hku.hk.msccs.MainActivity.POS_APPLICANT;
import static a2.cs.hku.hk.msccs.MainActivity.POS_STUDENT;

public class TabbedActivity extends FragmentActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    private Integer pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mTabLayout.setupWithViewPager(mViewPager);

        Intent intent = getIntent();
        pos = intent.getIntExtra("pos", 0);
        mTabLayout.getTabAt(pos).select();
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case POS_STUDENT:
                    return StudentFragment.newInstance();

                case POS_APPLICANT:
                    return ApplicantFragment.newInstance();

                case POS_ALUMNI:
                    return AlumniFragment.newInstance();

            }

            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case POS_STUDENT:
                    return "Student";

                case POS_APPLICANT:
                    return "Applicant";

                case POS_ALUMNI:
                    return "Alumni";
            }

            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }


}
