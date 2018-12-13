package a2.cs.hku.hk.msccs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final int POS_STUDENT = 0;
    public static final int POS_APPLICANT = 1;
    public static final int POS_ALUMNI= 2;
    public static final int POS_OTHERS = 3;

    Button btn_student;
    Button btn_applicant;
    Button btn_alumni;
    Button btn_others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_student = (Button)findViewById(R.id.student);
        btn_applicant = (Button)findViewById(R.id.applicant);
        btn_alumni = (Button)findViewById(R.id.alummni);
        btn_others = (Button)findViewById(R.id.others);

        btn_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), TabbedActivity.class);
                myIntent.putExtra("pos", POS_STUDENT);
                startActivity(myIntent);
            }
        });

        btn_applicant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), TabbedActivity.class);
                myIntent.putExtra("pos", POS_APPLICANT);
                startActivity(myIntent);
            }
        });

        btn_alumni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), TabbedActivity.class);
                myIntent.putExtra("pos", POS_ALUMNI);
                startActivity(myIntent);
            }
        });

        btn_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), PlanActivity.class);
                startActivity(myIntent);
            }
        });

    }
}
