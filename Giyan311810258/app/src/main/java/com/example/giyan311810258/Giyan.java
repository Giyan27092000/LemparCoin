package com.example.giyan311810258;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FilterWriter;
import java.util.Random;

public class Giyan extends Activity implements View.OnClickListener {

    private Button buttonlempar;
    private Button buttonrefeat;
    private Button buttonexit;
    private Random acak;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        acak = new Random();
        setContentView(R.layout.giyananjay);
        buttonlempar = (Button) findViewById(R.id.button1);
        buttonrefeat = (Button) findViewById(R.id.button2);
        buttonexit = (Button) findViewById(R.id.button);
        buttonlempar.setOnClickListener(this);
        buttonrefeat.setOnClickListener(this);
        buttonexit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == buttonlempar) {

            Log.d("CLICK EVENT", "lempar button diClick");
            TextView tw = (TextView) findViewById(R.id.textView3);
            ImageView iwe = (ImageView) findViewById(R.id.imageView2);

            if (acak.nextDouble() < 0.5) {
                tw.setText("kepala");
                iwe.setImageResource(R.drawable.head);
            } else {
                tw.setText("cross");
                iwe.setImageResource(R.drawable.tail);
            }

            buttonlempar.setVisibility(View.INVISIBLE);
            buttonrefeat.setVisibility(View.VISIBLE);
            buttonexit.setVisibility(View.VISIBLE);

        } else if (view == buttonrefeat) {

            TextView tw=(TextView)findViewById(R.id.textView3);
            ImageView iwe=(ImageView)findViewById(R.id.imageView2);

            buttonlempar.setVisibility(view.VISIBLE);
            buttonrefeat.setVisibility(view.INVISIBLE);
            buttonexit.setVisibility(view.INVISIBLE);

        }else if (view== buttonexit) {
            this.finish();
        }
    }
}





