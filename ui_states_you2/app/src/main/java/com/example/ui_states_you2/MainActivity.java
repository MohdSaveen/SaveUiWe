package com.example.ui_states_you2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEtclick;
    private TextView mTvclick;
    private Button mBtnlcick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtclick = findViewById(R.id.etclick);
        mTvclick = findViewById(R.id.tvclick);
        mBtnlcick = findViewById(R.id.btnclick);
        mEtclick.setText("Masai School");
        mEtclick.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()>=6){
                    Toast.makeText(MainActivity.this,mEtclick.getText(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        mBtnlcick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvclick.setText("Button Clicked");
            }
        });

    }


}