package com.thaisoftplus.event;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.thaisoftplus.domain.PriceBuilder;

import java.util.List;

/**
 * Created by Wittakarn on 5/6/2016.
 */
public class OnCalculateClickListener implements View.OnClickListener {

    private TextView totalPrice;
    private List<PriceBuilder> priceBuilders;
    private EditText otherPrice;

    public OnCalculateClickListener(TextView totalPrice, EditText otherPrice, List<PriceBuilder> priceBuilders){
        this.totalPrice = totalPrice;
        this.otherPrice = otherPrice;
        this.priceBuilders = priceBuilders;
    }


    @Override
    public void onClick(View v) {
        long total = 0;
        System.out.println("priceBuilders.size() = " + priceBuilders.size());
        for (PriceBuilder priceBuilder: priceBuilders) {
            priceBuilder.build();
            total = total + priceBuilder.getPrice();
        }

        long lOtherPrice = 0;
        if(otherPrice.getText() != null && !otherPrice.getText().toString().equals("")){
            lOtherPrice = Long.parseLong(otherPrice.getText().toString());
        }
        total = total + lOtherPrice;

        totalPrice.setText(Long.toString(total));
    }
}
