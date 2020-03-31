package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mcount=0;
    private TextView Show_Count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d("MainActivity", "Hello World");
        Show_Count= (TextView)findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast= Toast.makeText(this,R.string.app_message, Toast.LENGTH_SHORT );
    }

    public void Countup(View view) {
        mcount++;
        if(Show_Count!=null)
            Show_Count.setText(Integer.toString(mcount));
    }
}
