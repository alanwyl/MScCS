package a2.cs.hku.hk.msccs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class StudentHelpActivity extends AppCompatActivity {

    Button btn_submit;
    StringBuffer email_content= new StringBuffer("");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_help);

        btn_submit = (Button)findViewById(R.id.submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send email with default message
                String content = email_content.toString();
            }
        });
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.die:
                if (checked){
                    email_content.append("I want to die\n");
                }
                else{

                }
                break;


                case R.id.builled:
                if (checked){
                    email_content.append("I want to die\n");
                }
                else{

                }
                break;

                case R.id.fuck:
                if (checked){
                    email_content.append("I want to die\n");
                }
                else{

                }
                break;

            case R.id.sleep:
                if (checked){
                    email_content.append("I want to sleep\n");
                }
                else{

                }
                break;


        }
    }
}
