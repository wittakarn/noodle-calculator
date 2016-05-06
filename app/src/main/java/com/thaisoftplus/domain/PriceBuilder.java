package com.thaisoftplus.domain;

import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Wittakarn on 5/6/2016.
 */
public class PriceBuilder {

    private TextView count;
    private int weight;
    private long price;

    public PriceBuilder(TextView count, int weight){
        this.count = count;
        this.weight = weight;
    }

    public void build(){
        int iCount = Integer.parseInt(count.getText().toString());
        price = Long.valueOf(weight * iCount);
    }

    public TextView getCount() {
        return count;
    }

    public void setCount(TextView count) {
        this.count = count;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
