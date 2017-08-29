package com.classliu.androidoreo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.classliu.androidoreo.tab.NotificationActivity;
import com.classliu.androidoreo.tab.PictureInPictureActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_picinpic).setOnClickListener(this);
        findViewById(R.id.btn_notifcation).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_picinpic:
                startActivity(new Intent(this, PictureInPictureActivity.class));
                break;
            case R.id.btn_notifcation:
                startActivity(new Intent(this, NotificationActivity.class));
                break;
        }
    }
}
