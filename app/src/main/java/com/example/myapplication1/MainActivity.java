package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void loginClick(View view) {
        String USERNAME="edureka";
        String PASSWORD="edureka123";

        Button b1 = (Button) findViewById(R.id.button);

        EditText userName = (EditText) findViewById(R.id.editText_userName);
        EditText passWord = (EditText) findViewById(R.id.editText_passWord);
        TextView result = (TextView) findViewById(R.id.textView_result);
        String name=userName.getText().toString();
        String pw=passWord.getText().toString();

        if(name.equals(USERNAME) && pw.equals(PASSWORD))
        {
            result.setText("    Login Successfull");
            b1.setEnabled(false);
        }
        else
        {
            result.setText("    Invalid input");
        }

    }
}

