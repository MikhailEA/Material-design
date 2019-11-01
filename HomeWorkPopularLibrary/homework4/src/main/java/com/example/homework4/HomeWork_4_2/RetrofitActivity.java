package com.example.homework4.HomeWork_4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.homework4.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RetrofitActivity extends AppCompatActivity {

    private static final String TAG = "RetrofitActivity";

    @BindView(R.id.image_view_activity_picasso)
    ImageView imageView;

    private RetrofitPresenter retrofitPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
    }

    @OnClick(R.id.button_activity_retrofit)
    public void onClickButton(View view) {
        Log.d(TAG, "onClickButton: ");
        retrofitPresenter.getString();
    }


}
