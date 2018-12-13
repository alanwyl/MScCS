package a2.cs.hku.hk.msccs.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import a2.cs.hku.hk.msccs.R;

public class AlumniFragment extends Fragment {

    Button btn_donate;
    Button btn_associate;
    Button btn_activities;
    Button btn_donate_tohku;
    Button btn_donate_tome;

    public AlumniFragment() {
    }

    public static AlumniFragment newInstance() {
        return new AlumniFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // activity_applicant
        View rootView = inflater.inflate(R.layout.fragment_alumni, container, false);


        btn_donate = (Button) rootView.findViewById(R.id.donate);
        btn_associate = (Button) rootView.findViewById(R.id.associate);
        btn_activities = (Button) rootView.findViewById(R.id.activities);

        btn_donate_tohku = (Button) rootView.findViewById(R.id.donate_tohku);
        btn_donate_tome = (Button) rootView.findViewById(R.id.donate_tome);

        final View donate_view = rootView.findViewById(R.id.donateview);

        btn_donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (donate_view.getVisibility() == View.VISIBLE){
                    //set not visible
                    donate_view.setVisibility(View.GONE);
                }else{
                    //set visible
                    donate_view.setVisibility(View.VISIBLE);

                }
            }
        });

        btn_donate_tohku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"msccs@cs.hku.hk"});
                i.putExtra(Intent.EXTRA_SUBJECT, "I need help");
                //i.putExtra(Intent.EXTRA_TEXT   , content);
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    //Toast.makeText(StudentHelpActivity., "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_donate_tome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://hk.search.yahoo.com/search?fr=yfp-search-sb-bucket-836746&p=財務比較"));
                startActivity(intent);
            }
        });

        btn_associate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.msc-cs.hku.hk/GradAlumni/AlumniAssociation"));
                startActivity(intent);
            }
        });

        btn_activities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.msc-cs.hku.hk/GradAlumni/Activities"));
                startActivity(intent);
            }
        });


        return rootView;
    }
}
