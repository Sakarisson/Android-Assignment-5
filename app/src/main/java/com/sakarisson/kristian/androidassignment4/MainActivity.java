package com.sakarisson.kristian.androidassignment4;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DialpadView dialpadView = findViewById(R.id.dialpadView);
        // initializeListeners();
    }

    /*private void initializeListeners() {
        ImageView[] buttons = {
                findViewById(R.id.imageView0),
                findViewById(R.id.imageView1),
                findViewById(R.id.imageView2),
                findViewById(R.id.imageView3),
                findViewById(R.id.imageView4),
                findViewById(R.id.imageView5),
                findViewById(R.id.imageView6),
                findViewById(R.id.imageView7),
                findViewById(R.id.imageView8),
                findViewById(R.id.imageView9),
                findViewById(R.id.imageViewStar),
                findViewById(R.id.imageViewPound),
        };
        for (ImageView button : buttons) {
            initializeIndividualListener(button);
        }
    }

    private void initializeIndividualListener(final ImageView button) {
        View.OnClickListener buttonListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonWasClicked(button);
            }
        };
        button.setOnClickListener(buttonListener);
    }

    private void buttonWasClicked(final ImageView button) {
        // Run new thread for color switcharoo
        new Thread(new Runnable() {
            public void run() {
                try {
                    button.setBackgroundColor(Color.rgb(100, 100, 100));
                    Thread.sleep(150);
                    button.setBackgroundColor(Color.rgb(255, 255, 255));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }).start();
    }*/
}
