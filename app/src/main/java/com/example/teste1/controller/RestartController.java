package com.example.teste1.controller;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class RestartController implements View.OnClickListener {

    private Intent intent;
    private Activity activity;

    public RestartController(Intent intent, Activity activity){
        this.intent = intent;
        this.activity = activity;
    }

    @Override
    public void onClick(View view) {
        restart(intent, activity);
    }

    private void restart (Intent intent, Activity activity) {
        activity.finish();
        activity.startActivity(intent);
    }

}
