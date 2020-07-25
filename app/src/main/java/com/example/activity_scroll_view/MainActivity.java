package com.example.activity_scroll_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button_click);
        final LinearLayout linearLayout=findViewById(R.id.linear_layout);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView=new TextView(view.getContext());
                textView.setText("Scrool View ");
                linearLayout.addView(textView);
            }
        });
    }
}