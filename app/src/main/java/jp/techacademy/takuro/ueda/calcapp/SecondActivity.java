package jp.techacademy.takuro.ueda.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        double value1 = intent.getIntExtra("VALUE1", 0);
        double value2 = intent.getIntExtra("VALUE2", 0);
        //String value3 = intent.getIntExtra("VALUE3",calc);//

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(value1 + value2));
    }
}