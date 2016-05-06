package thaisoftplus.com.noodlecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.thaisoftplus.domain.PriceBuilder;
import com.thaisoftplus.event.OnCalculateClickListener;
import com.thaisoftplus.event.OnMinusClickListener;
import com.thaisoftplus.event.OnPlusClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button pinkPlus, pinkMinus;
    Button bluePlus, blueMinus;
    Button markPlus, markMinus;
    Button soupPlus, soupMinus;
    Button ribsRiceNPlus, ribsRiceNMinus;
    Button ribsRiceSPlus, ribsRiceSMinus;
    Button ricePlus, riceMinus;
    Button ball10Plus, ball10Minus;
    Button ball20Plus, ball20Minus;
    Button ball30Plus, ball30Minus;
    Button ball50Plus, ball50Minus;
    Button fishFirePlus, fishFireMinus;
    Button oWaterPlus, oWaterMinus;
    Button guavaPlus, guavaMinus;
    Button icePlus, iceMinus;
    Button calculate;
    Button reload;

    TextView pinkCount;
    TextView blueCount;
    TextView markCount;
    TextView soupCount;
    TextView ribsRiceNCount;
    TextView ribsRiceSCount;
    TextView riceCount;
    TextView ball10Count;
    TextView ball20Count;
    TextView ball30Count;
    TextView ball50Count;
    TextView fishFireCount;
    TextView oWaterCount;
    TextView guavaCount;
    TextView iceCount;
    TextView totalPrice;

    EditText otherPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialVariable();
        initialButtonEvent();
    }

    private void initialVariable() {
        pinkCount = (TextView) findViewById(R.id.pinkCount);
        pinkCount.setText("0");
        blueCount = (TextView) findViewById(R.id.blueCount);
        blueCount.setText("0");
        markCount = (TextView) findViewById(R.id.markCount);
        markCount.setText("0");
        soupCount = (TextView) findViewById(R.id.soupCount);
        soupCount.setText("0");
        ribsRiceNCount = (TextView) findViewById(R.id.ribsRiceNCount);
        ribsRiceNCount.setText("0");
        ribsRiceSCount = (TextView) findViewById(R.id.ribsRiceSCount);
        ribsRiceSCount.setText("0");
        riceCount = (TextView) findViewById(R.id.riceCount);
        riceCount.setText("0");
        ball10Count = (TextView) findViewById(R.id.ball10Count);
        ball10Count.setText("0");
        ball20Count = (TextView) findViewById(R.id.ball20Count);
        ball20Count.setText("0");
        ball30Count = (TextView) findViewById(R.id.ball30Count);
        ball30Count.setText("0");
        ball50Count = (TextView) findViewById(R.id.ball50Count);
        ball50Count.setText("0");
        fishFireCount = (TextView) findViewById(R.id.fishFireCount);
        fishFireCount.setText("0");
        oWaterCount = (TextView) findViewById(R.id.oWaterCount);
        oWaterCount.setText("0");
        guavaCount = (TextView) findViewById(R.id.guavaCount);
        guavaCount.setText("0");
        iceCount = (TextView) findViewById(R.id.iceCount);
        iceCount.setText("0");
        totalPrice = (TextView) findViewById(R.id.totalPrice);
        totalPrice.setText("0");

        pinkPlus = (Button) findViewById(R.id.pinkPlus);
        pinkMinus = (Button) findViewById(R.id.pinkMinus);
        bluePlus = (Button) findViewById(R.id.bluePlus);
        blueMinus = (Button) findViewById(R.id.blueMinus);
        markPlus = (Button) findViewById(R.id.markPlus);
        markMinus = (Button) findViewById(R.id.markMinus);
        soupPlus = (Button) findViewById(R.id.soupPlus);
        soupMinus = (Button) findViewById(R.id.soupMinus);
        ribsRiceNPlus = (Button) findViewById(R.id.ribsRiceNPlus);
        ribsRiceNMinus = (Button) findViewById(R.id.ribsRiceNMinus);
        ribsRiceSPlus = (Button) findViewById(R.id.ribsRiceSPlus);
        ribsRiceSMinus = (Button) findViewById(R.id.ribsRiceSMinus);
        ricePlus = (Button) findViewById(R.id.ricePlus);
        riceMinus = (Button) findViewById(R.id.riceMinus);
        ball10Plus = (Button) findViewById(R.id.ball10Plus);
        ball10Minus = (Button) findViewById(R.id.ball10Minus);
        ball20Plus = (Button) findViewById(R.id.ball20Plus);
        ball20Minus = (Button) findViewById(R.id.ball20Minus);
        ball30Plus = (Button) findViewById(R.id.ball30Plus);
        ball30Minus = (Button) findViewById(R.id.ball30Minus);
        ball50Plus = (Button) findViewById(R.id.ball50Plus);
        ball50Minus = (Button) findViewById(R.id.ball50Minus);
        fishFirePlus = (Button) findViewById(R.id.fishFirePlus);
        fishFireMinus = (Button) findViewById(R.id.fishFireMinus);
        oWaterPlus = (Button) findViewById(R.id.oWaterPlus);
        oWaterMinus = (Button) findViewById(R.id.oWaterMinus);
        guavaPlus = (Button) findViewById(R.id.guavaPlus);
        guavaMinus = (Button) findViewById(R.id.guavaMinus);
        icePlus = (Button) findViewById(R.id.icePlus);
        iceMinus = (Button) findViewById(R.id.iceMinus);
        calculate = (Button) findViewById(R.id.calculate);
        reload = (Button) findViewById(R.id.reload);

        otherPrice = (EditText) findViewById(R.id.otherPrice);
        otherPrice.setText("");
    }

    private void initialButtonEvent() {
        pinkPlus.setOnClickListener(new OnPlusClickListener(pinkCount));
        pinkMinus.setOnClickListener(new OnMinusClickListener(pinkCount));
        bluePlus.setOnClickListener(new OnPlusClickListener(blueCount));
        blueMinus.setOnClickListener(new OnMinusClickListener(blueCount));
        markPlus.setOnClickListener(new OnPlusClickListener(markCount));
        markMinus.setOnClickListener(new OnMinusClickListener(markCount));
        soupPlus.setOnClickListener(new OnPlusClickListener(soupCount));
        soupMinus.setOnClickListener(new OnMinusClickListener(soupCount));
        ribsRiceNPlus.setOnClickListener(new OnPlusClickListener(ribsRiceNCount));
        ribsRiceNMinus.setOnClickListener(new OnMinusClickListener(ribsRiceNCount));
        ribsRiceSPlus.setOnClickListener(new OnPlusClickListener(ribsRiceSCount));
        ribsRiceSMinus.setOnClickListener(new OnMinusClickListener(ribsRiceSCount));
        ricePlus.setOnClickListener(new OnPlusClickListener(riceCount));
        riceMinus.setOnClickListener(new OnMinusClickListener(riceCount));
        ball10Plus.setOnClickListener(new OnPlusClickListener(ball10Count));
        ball10Minus.setOnClickListener(new OnMinusClickListener(ball10Count));
        ball20Plus.setOnClickListener(new OnPlusClickListener(ball20Count));
        ball20Minus.setOnClickListener(new OnMinusClickListener(ball20Count));
        ball30Plus.setOnClickListener(new OnPlusClickListener(ball30Count));
        ball30Minus.setOnClickListener(new OnMinusClickListener(ball30Count));
        ball50Plus.setOnClickListener(new OnPlusClickListener(ball50Count));
        ball50Minus.setOnClickListener(new OnMinusClickListener(ball50Count));
        fishFirePlus.setOnClickListener(new OnPlusClickListener(fishFireCount));
        fishFireMinus.setOnClickListener(new OnMinusClickListener(fishFireCount));
        oWaterPlus.setOnClickListener(new OnPlusClickListener(oWaterCount));
        oWaterMinus.setOnClickListener(new OnMinusClickListener(oWaterCount));
        guavaPlus.setOnClickListener(new OnPlusClickListener(guavaCount));
        guavaMinus.setOnClickListener(new OnMinusClickListener(guavaCount));
        icePlus.setOnClickListener(new OnPlusClickListener(iceCount));
        iceMinus.setOnClickListener(new OnMinusClickListener(iceCount));

        List<PriceBuilder> priceBuilders = populatePriceBuilder();
        calculate.setOnClickListener(new OnCalculateClickListener(totalPrice, otherPrice, priceBuilders));

        reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initialVariable();
                initialButtonEvent();
            }
        });
    }

    private List<PriceBuilder> populatePriceBuilder(){
        List<PriceBuilder> priceBuilders = new ArrayList<PriceBuilder>();

        priceBuilders.add(new PriceBuilder(pinkCount, 40));
        priceBuilders.add(new PriceBuilder(blueCount, 50));
        priceBuilders.add(new PriceBuilder(markCount, 60));
        priceBuilders.add(new PriceBuilder(soupCount, 5));
        priceBuilders.add(new PriceBuilder(ribsRiceNCount, 40));
        priceBuilders.add(new PriceBuilder(ribsRiceSCount, 50));
        priceBuilders.add(new PriceBuilder(riceCount, 10));
        priceBuilders.add(new PriceBuilder(ball10Count, 25));
        priceBuilders.add(new PriceBuilder(ball20Count, 50));
        priceBuilders.add(new PriceBuilder(ball30Count, 70));
        priceBuilders.add(new PriceBuilder(ball50Count, 115));
        priceBuilders.add(new PriceBuilder(fishFireCount, 20));
        priceBuilders.add(new PriceBuilder(oWaterCount, 10));
        priceBuilders.add(new PriceBuilder(guavaCount, 20));
        priceBuilders.add(new PriceBuilder(iceCount, 2));

        return priceBuilders;
    }
}
