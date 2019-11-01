package com.example.homework4.HomeWork_4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.homework4.R;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PicassoActivity extends AppCompatActivity {

    @BindView(R.id.image_view_activity_picasso)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_glide_activity_picasso)
    public void onClickButton(View view){
        Picasso
                .get()
                .load("https://avatars1.githubusercontent.com/u/48789545?v=4")
                .into(imageView);
    }
}
