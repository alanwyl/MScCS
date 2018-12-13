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
import a2.cs.hku.hk.msccs.StudentCourseActivity;
import a2.cs.hku.hk.msccs.StudentHelpActivity;

public class StudentFragment extends Fragment {
    Button btn_course;
    Button btn_msc_intranet;
    Button btn_portal;
    Button btn_links;
    Button btn_help;
    Button btn_environment;

    TextView link_content;

    public StudentFragment() {
    }

    public static StudentFragment newInstance() {
        return new StudentFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // activity_applicant
        View rootView = inflater.inflate(R.layout.fragment_student, container, false);

        btn_course = (Button) rootView.findViewById(R.id.course);
        btn_msc_intranet = (Button) rootView.findViewById(R.id.msc_intranet);
        btn_portal = (Button) rootView.findViewById(R.id.portal);
        btn_links = (Button ) rootView.findViewById(R.id.links);
        btn_help = (Button) rootView.findViewById(R.id.help);
        btn_environment = (Button) rootView.findViewById(R.id.environment);

        link_content = (TextView)rootView.findViewById(R.id.links_content);

        btn_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), StudentCourseActivity.class);
                startActivity(myIntent);
            }
        });

        btn_msc_intranet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://msccs.cs.hku.hk/"));
                startActivity(intent);
            }
        });

        btn_portal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.hku.hk/portal"));
                startActivity(intent);
            }
        });

        btn_links.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (link_content.getVisibility() == View.VISIBLE){
                    //set not visible
                    link_content.setVisibility(View.GONE);
                }else{
                    //set visible
                    link_content.setVisibility(View.VISIBLE);

                }
            }
        });

        btn_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), StudentHelpActivity.class);
                startActivity(myIntent);
            }
        });

        btn_environment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.msc-cs.hku.hk/StuRes/Environment"));
                startActivity(intent);
            }
        });

        return rootView;
    }
}
