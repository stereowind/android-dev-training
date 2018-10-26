package com.stereowind.training.scrollingtext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.stereowind.training.scrollingtext.extra.MESSAGE";
    private String mTextToSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendText1(View view) {
        Intent intent = new Intent(this, TextDisplay.class);
        mTextToSend = getString(R.string.text_1);
        intent.putExtra(EXTRA_MESSAGE, mTextToSend);
        startActivity(intent);
    }

    public void sendText2(View view) {
        Intent intent = new Intent(this, TextDisplay.class);
        mTextToSend = getString(R.string.text_2);
        intent.putExtra(EXTRA_MESSAGE, mTextToSend);
        startActivity(intent);
    }

    public void sendText3(View view) {
        Intent intent = new Intent(this, TextDisplay.class);
        mTextToSend = getString(R.string.text_3);
        intent.putExtra(EXTRA_MESSAGE, mTextToSend);
        startActivity(intent);
    }

}
