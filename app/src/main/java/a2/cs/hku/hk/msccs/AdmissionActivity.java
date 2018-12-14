package a2.cs.hku.hk.msccs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AdmissionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button buttonDeadlineMore = findViewById(R.id.application_deadline_more);
        buttonDeadlineMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.msc-cs.hku.hk/Admission/Procedures"));
                startActivity(intent);
            }
        });

        Button buttonCompositionFeeMore = findViewById(R.id.composition_fee_more);
        buttonCompositionFeeMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.msc-cs.hku.hk/Admission/Fees"));
                startActivity(intent);
            }
        });

        Button buttonProgrammeScheduleMore = findViewById(R.id.programme_schedule_more);
        buttonProgrammeScheduleMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.msc-cs.hku.hk/Curriculum/Schedule"));
                startActivity(intent);
            }
        });

        Button buttonRequirementMore = findViewById(R.id.btn_requirement_more);
        buttonRequirementMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.msc-cs.hku.hk/Admission/Requirements"));
                startActivity(intent);
            }
        });

        Button buttonLearningEnvironment = findViewById(R.id.btn_learning_environment);
        buttonLearningEnvironment.setOnClickListener(new View.OnClickListener() {
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
