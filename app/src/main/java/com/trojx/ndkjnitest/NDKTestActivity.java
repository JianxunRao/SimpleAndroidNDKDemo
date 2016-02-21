package com.trojx.ndkjnitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/2/21.
 */
public class NDKTestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndk_test);

        TextView textView= (TextView) findViewById(R.id.tv);
        NDKUtils utils=new NDKUtils();
        String stringFromC=utils.getStringFromC();
        textView.setText(stringFromC);
    }
}
