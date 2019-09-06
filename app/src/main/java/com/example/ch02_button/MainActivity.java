package com.example.ch02_button;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //int size =findViewById(R.id.tvt).getHeight();
    int size = 14;

    public void bigger(View v) {
        TextView txv;
        txv = (TextView)findViewById(R.id.tvt);
        txv.setTextSize(++size);
    }

    public  void  smaller(View v)
    {
        TextView txv;
        txv = (TextView)findViewById(R.id.tvt);
        txv.setTextSize(--size);

    }

}
