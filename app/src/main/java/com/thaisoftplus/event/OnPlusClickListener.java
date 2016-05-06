package com.thaisoftplus.event;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Wittakarn on 5/6/2016.
 */
public class OnPlusClickListener implements View.OnClickListener {
    private TextView viewCount;

    public OnPlusClickListener(TextView viewCount){
        this.viewCount = viewCount;
    }


    @Override
    public void onClick(View v) {
        int count = Integer.parseInt(viewCount.getText().toString());
        count++;
        viewCount.setText(Integer.toString(count));
    }
}
