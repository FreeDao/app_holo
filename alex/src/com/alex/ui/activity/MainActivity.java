package com.alex.ui.activity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends BaseActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView textView= (TextView) findViewById(R.id.tv);
        textView.setText("aaa");
    }
}
