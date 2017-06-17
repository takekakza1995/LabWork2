package com.example.take.labwork2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    String gradeSelect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button)findViewById(R.id.button);


        Spinner spinnerGrade = (Spinner)findViewById(R.id.spinnerGrade);
        final String[] grade = getResources().getStringArray(R.array.grade);

        ArrayAdapter<String> adapterGrade = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,grade);
        spinnerGrade.setAdapter(adapterGrade);

        spinnerGrade.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gradeSelect = grade[position];

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });






        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText)findViewById(R.id.textName);
                EditText nickName = (EditText)findViewById(R.id.textNickname);
                EditText mail = (EditText)findViewById(R.id.textMail);
                EditText hobb = (EditText)findViewById(R.id.textHobby);


                String text = name.getText().toString();
                String text2 = nickName.getText().toString();
                String text3 = mail.getText().toString();
                String text4 = hobb.getText().toString();



                Intent send = new Intent(MainActivity.this,Activity2.class);

                send.putExtra("Name",text);
                send.putExtra("Nickname",text2);
                send.putExtra("Mail",text3);
                send.putExtra("Hobb",text4);
                send.putExtra("Grade",gradeSelect);

              //  startActivity((sendName),(sendNickname),(sendMail),(sendHobb));
                startActivity(send);


            }
        });
    }
}
