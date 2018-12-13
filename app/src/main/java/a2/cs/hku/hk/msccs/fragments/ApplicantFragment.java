package a2.cs.hku.hk.msccs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText(getString(R.string.section_format, "Applicant"));
        return rootView;
    }
}
