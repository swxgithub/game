package com.example.mygame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view){
        setContentView(R.layout.activity_main1);
    }
    public void fleeClick(View view){
        setContentView(R.layout.activity_main3);
    }

    static public int i=1;
    public void attackClick(View view){
        switch(i){
            case(1):((ImageView) findViewById(R.id.pig)).setImageResource(R.drawable.bg_grey);((TextView)findViewById(R.id.score)).setText("1");break;
            case(2):((ImageView) findViewById(R.id.cat)).setImageResource(R.drawable.bg_grey);((TextView)findViewById(R.id.score)).setText("2");break;
            case(3):((ImageView) findViewById(R.id.flower)).setImageResource(R.drawable.bg_grey);((TextView)findViewById(R.id.score)).setText("3");break;
            case(4):((ImageView) findViewById(R.id.bird)).setImageResource(R.drawable.bg_grey);((TextView)findViewById(R.id.score)).setText("4");break;
        }
        i =i + 1;
            //for(int a=0;a<100;a++){}
        if(i==5){
            setContentView(R.layout.activity_main2);
        }
    }
}
