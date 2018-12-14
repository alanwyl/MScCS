package a2.cs.hku.hk.msccs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class PlanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button buttonConnect = findViewById(R.id.btn_plan_connect);
        buttonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.msc-cs.hku.hk/StuRes/Environment"));
                startActivity(intent);
            }
        });

        Button buttonOverviewDetail = findViewById(R.id.btn_overview_detail);
        buttonOverviewDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.msc-cs.hku.hk/Curriculum/Programme-Overview"));
                startActivity(intent);
            }
        });

        Button buttonAboutHKU = findViewById(R.id.btn_about_hku);
        buttonAboutHKU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.msc-cs.hku.hk/About/AboutHKU"));
                startActivity(intent);
            }
        });

        Button buttonFaculty = findViewById(R.id.btn_faculty);
        buttonFaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://engg.hku.hk/"));
                startActivity(intent);
            }
        });

        Button buttonMessage = findViewById(R.id.btn_message);
        buttonMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.msc-cs.hku.hk/About/MessageFromDirector"));
                startActivity(intent);
            }
        });




        /*
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
        */
    }

}
