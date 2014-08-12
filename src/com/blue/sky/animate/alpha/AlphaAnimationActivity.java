package com.blue.sky.animate.alpha;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.blue.sky.animate.R;

// http://www.cnblogs.com/lcyhjx/p/3473836.html
public class AlphaAnimationActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alpha_activity);

        ImageView imageView = (ImageView) findViewById(R.id.alpha_image);
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
        alphaAnimation.setDuration(3000);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillBefore(false);
        animationSet.setFillAfter(true);
        imageView.startAnimation(animationSet);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha_fade_in_out);
        imageView.startAnimation(animation);
    }
}

