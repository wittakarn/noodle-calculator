package com.thaisoftplus.event;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Wittakarn on 5/6/2016.
 */
public class OnMinusClickListener implements View.OnClickListener {
    private TextView viewCount;

    public OnMinusClickListener(TextView viewCount){
        this.viewCount = viewCount;
    }


    @Override
    public void onClick(View v) {
        int count = Integer.parseInt(viewCount.getText().toString());
        if(count > 0) count--;
        viewCount.setText(Integer.toString(count));
    }
}
