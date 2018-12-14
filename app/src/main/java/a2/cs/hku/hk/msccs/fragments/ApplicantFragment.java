package a2.cs.hku.hk.msccs.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import a2.cs.hku.hk.msccs.AdmissionActivity;
import a2.cs.hku.hk.msccs.PlanActivity;
import a2.cs.hku.hk.msccs.R;

public class ApplicantFragment extends Fragment {
    public ApplicantFragment() {
    }

    public static ApplicantFragment newInstance() {
        return new ApplicantFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // activity_applicant
        View rootView = inflater.inflate(R.layout.fragment_applicant, container, false);

        Button btnAdmission = (Button) rootView.findViewById(R.id.btn_admission);
        btnAdmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AdmissionActivity.class);
                startActivity(intent);
            }
        });

        Button btnPlan = (Button) rootView.findViewById(R.id.btn_plan);
        btnPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PlanActivity.class);
                startActivity(intent);
            }
        });

        Button btnMore = (Button) rootView.findViewById(R.id.btn_overview_more);
        btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.msc-cs.hku.hk/Curriculum/Programme-Overview"));
                startActivity(intent);
            }
        });

        return rootView;
    }
}
