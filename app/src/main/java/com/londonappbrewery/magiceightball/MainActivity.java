package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = (Button) findViewById(R.id.askButton);

        final ImageView ball = (ImageView) findViewById(R.id.ballImageView);

        final TextView text = (TextView) findViewById(R.id.textView1);

        final int[] ballArray =
                {
                        R.drawable.ball1,
                        R.drawable.ball2,
                        R.drawable.ball3,
                        R.drawable.ball4,
                        R.drawable.ball5
                };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(4);
                number = randomNumberGenerator.nextInt(5);
                int imageResourceId = ballArray[number];
                ball.setImageResource(imageResourceId);
                Log.d("8Ball", "The Ball is ball" + (number + 1));
            }
        });
    }
}
