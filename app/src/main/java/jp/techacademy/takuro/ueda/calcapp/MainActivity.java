package jp.techacademy.takuro.ueda.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText = (EditText) findViewById(R.id.editText);
        mEditText2 = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View v) {
        String calc = null;
        if (v.getId() == R.id.button1) {
            calc = "+";
        } else if (v.getId() == R.id.button2) {
            calc = "-";
        } else if (v.getId() == R.id.button3) {
            calc = "*";
        } else if (v.getId() == R.id.button4) {
            calc = "/";
        }

        Double value1 = Double.parseDouble(mEditText.getText().toString());
        Double value2 = Double.parseDouble(mEditText2.getText().toString());
        String value3 = calc;

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
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("result",result);
        startActivity(intent);
    }
}

/*1つ目の画面では、数値入力用の2つのEditTextと、四則計算それぞれのボタンを4つ作成してください
4つの四則計算ボタンのどれかをタップすると、2つ目の画面へ移動させてTextViewで対応する計算結果を表示してください
数値は小数点に対応してください*/