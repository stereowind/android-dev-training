package com.stereowind.training.scrollingtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addComment(View view) {
        Toast addCommentText = Toast.makeText(this, "Imagine that you comment is added here!", Toast.LENGTH_LONG);
        addCommentText.show();
    }
}
