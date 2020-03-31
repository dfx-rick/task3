package com.example.task32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mcount=0;
    private TextView mshowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowCount=(TextView)findViewById(R.id.show_count);
    }

    public void toast(View view) {
        Toast toast=Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
    }

    public void count(View view) {
        ++mcount;
        if(mshowCount!=null)
            mshowCount.setText(Integer.toString(mcount));
    }
}
