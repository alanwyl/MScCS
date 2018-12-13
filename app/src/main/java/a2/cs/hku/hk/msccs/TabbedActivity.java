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
import a2.cs.hku.hk.msccs.fragments.OthersFragment;
import a2.cs.hku.hk.msccs.fragments.StudentFragment;

import static a2.cs.hku.hk.msccs.MainActivity.POS_ALUMNI;
import static a2.cs.hku.hk.msccs.MainActivity.POS_APPLICANT;
import static a2.cs.hku.hk.msccs.MainActivity.POS_OTHERS;
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
//        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener (){
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });

        Intent intent = getIntent();
        pos = intent.getIntExtra("pos", 0);
        mTabLayout.getTabAt(pos).select();

        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tabbed, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */

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

                case POS_OTHERS:
                    return OthersFragment.newInstance();
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

                case POS_OTHERS:
                    return "Others";
            }

            return null;
        }

        @Override
        public int getCount() {
            return 4;
        }
    }


}
