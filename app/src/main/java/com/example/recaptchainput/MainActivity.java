package com.example.recaptchainput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.library.RecaptchaInputView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecaptchaInputView input=findViewById(R.id.input);
        input.setCompleteListener(new RecaptchaInputView.OnCompleteLinster() {
            @Override
            public void onComplete(String str) {
                Toast.makeText(MainActivity.this, ""+str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
