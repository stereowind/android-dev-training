package com.stereowind.training.helloconstraint;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button zeroButton;
    private Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        zeroButton = findViewById(R.id.button_zero);
        countButton = findViewById(R.id.button_count);
        if (savedInstanceState != null) {
            mShowCount.setText(savedInstanceState.getString("current_number"));
            setmCount(mShowCount);
        }
        colorCheck();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("current_number", Integer.toString(mCount));
    }

    public void setmCount(TextView value) {
        // Change internal counter variable to the one set in counter TextView
        mCount = Integer.parseInt(value.getText().toString());
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        colorCheck();
    }

    public void resetToZero(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        colorCheck();
    }

    private void colorCheck() {
        if (mCount != 0) {
            zeroButton.setBackgroundColor(getResources().getColor(R.color.zeroButtonActive));
        } else {
            zeroButton.setBackgroundColor(getResources().getColor(R.color.zeroButtonOut));
        }
        if (mCount%2 != 0) {
            countButton.setBackgroundColor(Color.RED); // Odd number
        } else {
            countButton.setBackgroundColor(Color.GREEN); // Even number
        }
    }
}
