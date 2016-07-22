package com.example.android.appp;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    public void showNext1(View view) {
        // Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.showing_image);
        imageView.setImageResource(R.drawable.bird);

        // Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.showing_text);
        textView.setText("Mong Kok - \nBird Garden");
    }

    public void showNext2(View view) {
        // Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.showing_image);
        imageView.setImageResource(R.drawable.bridge);

        // Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.showing_text);
        textView.setText("Tsing Yi -\n Tsing Ma Bridge");
    }
    public void showNext3(View view) {
        // Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.showing_image);
        imageView.setImageResource(R.drawable.cable);

        // Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.showing_text);
        textView.setText("Central -\n The Peak");
    }
    public void showNext4(View view) {
        // Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.showing_image);
        imageView.setImageResource(R.drawable.heritage);

        // Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.showing_text);
        textView.setText("Tsim Sha Tsui -\n 1881 Heritage");
    }
    public void showNext5(View view) {
        // Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.showing_image);
        imageView.setImageResource(R.drawable.vh);

        // Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.showing_text);
        textView.setText("Tsim Sha Tsui - \nVictoria Harbour");
    }
    public void showNext6(View view) {
        // Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.showing_image);
        imageView.setImageResource(R.drawable.snack);

        // Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.showing_text);
        textView.setText("Tsim Sha Tsui - \nFish Balls and Egg Waffles");
    }


}
