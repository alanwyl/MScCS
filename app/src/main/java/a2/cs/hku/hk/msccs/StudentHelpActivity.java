package a2.cs.hku.hk.msccs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

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

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"msccs@cs.hku.hk"});
                i.putExtra(Intent.EXTRA_SUBJECT, "I need help");
                i.putExtra(Intent.EXTRA_TEXT   , content);
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    //Toast.makeText(StudentHelpActivity., "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        String content;
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.die:
                content = "I want to die\n";
                if (checked){
                    email_content.append(content);
                }
                else{
                    int index = email_content.indexOf(content);
                    if (index!=-1){
                        email_content.replace(index, index + content.length(), "");
                    }
                }
                break;


                case R.id.builled:
                    content = "I got builled\n";
                    if (checked){
                        email_content.append(content);
                    }
                    else{
                        int index = email_content.indexOf(content);
                        if (index!=-1){
                            email_content.replace(index, index + content.length(), "");
                        }
                    }
                    break;

                case R.id.fuck:
                    content = "F*ck my Life\n";
                    if (checked){
                        email_content.append(content);
                    }
                    else{
                        int index = email_content.indexOf(content);
                        if (index!=-1){
                            email_content.replace(index, index + content.length(), "");
                        }
                    }
                    break;

            case R.id.sleep:
                content = "I want to sleep\n";
                if (checked){
                    email_content.append(content);
                }
                else{
                    int index = email_content.indexOf(content);
                    if (index!=-1){
                        email_content.replace(index, index + content.length(), "");
                    }
                }
                break;


        }
    }
}
