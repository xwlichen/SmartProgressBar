package com.smart.view.ratio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.smart.view.R;
import com.smart.view.progressbar.support.SupportProgressLayout;

public class MainActivity extends AppCompatActivity {

    private SupportProgressLayout mSinaSportLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratio);
        mSinaSportLayout = (SupportProgressLayout) findViewById(R.id.layout);
        mSinaSportLayout.setOnSinaSportListener(new SupportProgressLayout.OnSinaSportListener() {
            @Override
            public void onLeftClick(TextView tvLeft) {
                mSinaSportLayout.incrementLeftProgressValue(20);
                tvLeft.setText(mSinaSportLayout.getLeftProgressValue() + "");
            }

            @Override
            public void onRightClick(TextView tvRight) {
                mSinaSportLayout.incrementRightProgressValue(20);
                tvRight.setText(mSinaSportLayout.getRightProgressValue() + "");
            }
        });
    }


}
