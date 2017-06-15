package com.example.take.labwork2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent sendName = getIntent();
        String showName = sendName.getStringExtra("Name");
        TextView nameText = (TextView)findViewById(R.id.textView3);
        nameText.setText(showName);

        Intent sendNickname = getIntent();
        String showNickname = sendNickname.getStringExtra("Nickname");
        TextView nicknameText = (TextView)findViewById(R.id.textView4);
        nicknameText.setText(showNickname);

        Intent sendMail = getIntent();
        String showMail = sendMail.getStringExtra("Mail");
        TextView mailText = (TextView)findViewById(R.id.textView5);
        mailText.setText(showMail);

        Intent sendHobb = getIntent();
        String showHobb = sendHobb.getStringExtra("Hobb");
        TextView hobbText = (TextView)findViewById(R.id.textView6);
        hobbText.setText(showHobb);


    }
}
