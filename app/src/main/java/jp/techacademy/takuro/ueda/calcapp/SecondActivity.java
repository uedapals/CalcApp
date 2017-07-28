package jp.techacademy.takuro.ueda.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.util.Log;
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //emulatorで計算がうまくいかない（結果が全て0.0）→ログでValue1,2が0.0になっている//
        //Double.parseDouble//
        //intやdoubleをちょこちょこ変更してみる//
        Intent intent = getIntent();
        Double value1 = intent.getDoubleExtra("VALUE1", 0);
        Double value2 = intent.getDoubleExtra("VALUE2", 0);
        String value3 = intent.getStringExtra("VALUE3");

        Log.d("VALUE1", String.valueOf(value1));
        Log.d("VALUE2", String.valueOf(value2));
        Log.d("VALUE3", value3);

        double result = 0;
        if (value3.equals("+")){
            result = value1 + value2;
        }else if (value3.equals("-")){
            result = value1 - value2;
        }else if (value3.equals("*")){
            result = value1 * value2;
        }else if (value3.equals("/")){
            result = value1 / value2;
        }
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(result));
    }
}
