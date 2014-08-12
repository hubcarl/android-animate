package com.blue.sky.animate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import com.blue.sky.animate.scale.ScaleAnimationActivity;

/**
 * 在Android系统中，Animation包含4个基本动画效果：
     1、  AlphaAnimation淡入淡出效果
     2、  ScaleAnimation缩放效果
     3、  RotateAnimation旋转效果
     4、  TranslateAnimation移动效果
*/
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final View showView = findViewById(R.id.txt_face_in);
        final View hideView = findViewById(R.id.txt_face_out);

        showView.setAlpha(0f);
        showView.setVisibility(View.VISIBLE);
        showView.animate()
                .alpha(1f)
                .setDuration(5000)
                .setListener(null);

        hideView.animate()
                .alpha(0f)
                .setDuration(5000)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        hideView.setVisibility(View.GONE);
                    }
                });

        new CountDownTimer(2000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ScaleAnimationActivity.class);
                startActivity(intent);

                int VERSION = Integer.parseInt(android.os.Build.VERSION.SDK);
                if (VERSION >= 5) {
                    MainActivity.this.overridePendingTransition(R.anim.activity_face_in, R.anim.activity_face_out);
                }
                finish();
            }
        }.start();
    }
}

