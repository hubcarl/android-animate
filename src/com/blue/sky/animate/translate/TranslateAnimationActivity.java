package com.blue.sky.animate.translate;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.blue.sky.animate.R;

/**
 * Created by Administrator on 2014/8/12.
 */
public class TranslateAnimationActivity extends Activity {


    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alpha_activity);

        ImageView imageView = (ImageView) findViewById(R.id.alpha_image);
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 1.0f,
                Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, 1.0f);
        translateAnimation.setDuration(3000);
        animationSet.addAnimation(translateAnimation);
        imageView.startAnimation(animationSet);
        Animation animation = (Animation) AnimationUtils.loadAnimation(this, R.anim.translate_activity);
        imageView.startAnimation(animation);
    }
}