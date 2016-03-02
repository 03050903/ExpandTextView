package com.lcodecore.expandtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends BaseActivity {

    @Override
    public int setInflateId() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
