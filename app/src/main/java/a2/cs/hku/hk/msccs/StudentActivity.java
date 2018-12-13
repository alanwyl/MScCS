package a2.cs.hku.hk.msccs;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentActivity extends AppCompatActivity {

    Button btn_course;
    Button btn_msc_intranet;
    Button btn_portal;
    Button btn_links;
    Button btn_help;
    Button btn_environment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        btn_course = (Button)findViewById(R.id.course);
        btn_msc_intranet = (Button)findViewById(R.id.msc_intranet);
        btn_portal = (Button)findViewById(R.id.portal);
        btn_links = (Button)findViewById(R.id.links);
        btn_help = (Button)findViewById(R.id.help);
        btn_environment = (Button)findViewById(R.id.environment);

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
                Intent myIntent = new Intent(v.getContext(), StudentLinkActivity.class);
                startActivity(myIntent);
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

    }
}
