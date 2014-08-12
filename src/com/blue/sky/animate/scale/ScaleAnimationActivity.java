package com.blue.sky.animate.scale;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.blue.sky.animate.R;

// http://www.cnblogs.com/lcyhjx/p/3473836.html
public class ScaleAnimationActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alpha_activity);

        ImageView imageView = (ImageView) findViewById(R.id.alpha_image);
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1, 0.5f, 1, 0.5f,
                Animation.RELATIVE_TO_SELF, 1f,
                Animation.RELATIVE_TO_SELF, 1f);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(3000);
        imageView.startAnimation(animationSet);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale_activity);
        imageView.startAnimation(animation);

    }
}

