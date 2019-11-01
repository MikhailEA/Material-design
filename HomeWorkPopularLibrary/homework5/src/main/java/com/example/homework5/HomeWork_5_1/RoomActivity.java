package com.example.homework5.HomeWork_5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.homework5.R;

public class RoomActivity extends AppCompatActivity {

    private RoomPresenter roomPresenter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        textView = findViewById(R.id.text_view_activity_room);

        roomPresenter = new RoomPresenter();
    }

    public void putData1(View view) {
        roomPresenter.putData();
    }

    public void getData1(View view) { roomPresenter.getData(); }

    public void deleteData1(View view) {roomPresenter.deleteData(); }


}
