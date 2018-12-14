package a2.cs.hku.hk.msccs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ConnectionActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);

        Button buttonSubmit = findViewById(R.id.btn_connection_submit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer emailContent = new StringBuffer();

                for (int id : new Integer[] {R.id.chk_chat, R.id.chk_tour, R.id.chk_class, R.id.chk_alumni, R.id.chk_phone}) {
                    CheckBox checkBox = findViewById(id);
                    if (checkBox.isChecked()) {
                        emailContent.append(getStringForCheckbox(id) + "\n");
                    }
                }

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"msccs@cs.hku.hk"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Let's Talk");
                i.putExtra(Intent.EXTRA_TEXT   , emailContent.toString());
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                }
            }
        });



    }

    private String getStringForCheckbox(int id) {
        switch(id) {
            case R.id.chk_chat:
                return getString(R.string.connection_chat);
            case R.id.chk_tour:
                return getString(R.string.connection_tour);
            case R.id.chk_class:
                return getString(R.string.connection_class);
            case R.id.chk_alumni:
                return getString(R.string.connection_alumni_chat);
            case R.id.chk_phone:
                return getString(R.string.connection_phone);
        }
        return "";
    }

}
