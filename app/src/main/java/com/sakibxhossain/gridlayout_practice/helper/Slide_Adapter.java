package com.sakibxhossain.gridlayout_practice.helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.sakibxhossain.gridlayout_practice.R;

public class Slide_Adapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public Slide_Adapter(Context context) {
        this.context = context;
    }

    int[] images = {
            R.drawable.search_place,
            R.drawable.make_a_call,
            R.drawable.search_place,
            R.drawable.sit_back_and_relax
    };

    int[] description = {
            R.string.first_slide_desc,
            R.string.second_slide_desc,
            R.string.third_slide_desc,
            R.string.fourth_slide_desc
    };

    int[] title = {
            R.string.first_slide_title,
            R.string.second_slide_title,
            R.string.third_slide_title,
            R.string.fourth_slide_title
    };

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (ConstraintLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        //Hooks
        ImageView imageView_Hooks = view.findViewById(R.id.onboarding_slide_image);
        TextView title_Hooks = view.findViewById(R.id.onboarding_slide_title);
        TextView description_Hooks = view.findViewById(R.id.onboarding_slide_description);

        imageView_Hooks.setImageResource(images[position]);
        title_Hooks.setText(title[position]);
        description_Hooks.setText(description[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}

