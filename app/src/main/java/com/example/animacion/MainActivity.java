package com.example.animacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titulo;
    TextView titulo2;
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo = (TextView) findViewById(R.id.titulo);
        titulo2 = (TextView) findViewById(R.id.titulo2);
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);

        Animation animacion_titulo = AnimationUtils.loadAnimation(this,R.anim.animacion_titulo);
        titulo.startAnimation(animacion_titulo);

        Animation animacion_img1 = AnimationUtils.loadAnimation(this,R.anim.animacion_img1);
        img1.startAnimation(animacion_img1);

        Animation animacion_img2 = AnimationUtils.loadAnimation(this,R.anim.animacion_img2);
        img2.startAnimation(animacion_img2);

        Animation animacion_img3 = AnimationUtils.loadAnimation(this,R.anim.animacion_img3);
        img3.startAnimation(animacion_img3);

        Animation animacion_img4 = AnimationUtils.loadAnimation(this,R.anim.animacion_img4);
        img4.startAnimation(animacion_img4);

        Animation animacion_titulo2 = AnimationUtils.loadAnimation(this,R.anim.animacion_titulo2);
        titulo2.startAnimation(animacion_titulo2);


        animacion_titulo2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            public void onAnimationEnd(Animation animation) {
                titulo.setVisibility(View.GONE);
                img1.setVisibility(View.GONE);
                img2.setVisibility(View.GONE);
                img3.setVisibility(View.GONE);
                img4.setVisibility(View.GONE);
                titulo2.setVisibility(View.GONE);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}