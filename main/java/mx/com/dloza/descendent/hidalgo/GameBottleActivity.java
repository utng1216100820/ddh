package mx.com.dloza.descendent.hidalgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import mx.com.dloza.descendent.R;

public class GameBottleActivity extends AppCompatActivity {
        ImageView bottle;
        Button launch;
        Random rand;
        int agle;
        boolean restart = false;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_game_bottle);
            rand = new Random();
            bottle = findViewById(R.id.bottle);
            launch = findViewById(R.id.launch);

            launch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (restart) {
                        agle = agle % 360;
                        RotateAnimation rotate = new RotateAnimation(agle, 360,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                        rotate.setFillAfter(true);
                        rotate.setDuration(360);
                        rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                        bottle.startAnimation(rotate);

                        launch.setText("GO");
                        restart = false;
                    }else{
                        agle = rand.nextInt(3600)+ 360;
                        RotateAnimation rotate = new RotateAnimation(0, agle,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                                RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                        rotate.setFillAfter(true);
                        rotate.setDuration(3600);
                        rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                        bottle.startAnimation(rotate);
                        restart = true;
                        launch.setText("RESET");

                    }
                }
            });
        }
    }
