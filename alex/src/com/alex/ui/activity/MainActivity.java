package com.alex.ui.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends BaseActivity {
    /**
     * Called when the activity is first created.
     */
    @InjectView(R.id.tv)
    TextView tv;
    @InjectView(R.id.button)
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ButterKnife.inject(this);
        button.setText("bbb");
        tv.setText("ttt");
    }
}
