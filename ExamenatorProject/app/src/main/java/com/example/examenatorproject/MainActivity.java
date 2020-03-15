package com.example.examenatorproject;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout gridLayout = (GridLayout)findViewById(R.id.tableGrid);
        gridLayout.removeAllViews();

        Button button = null;
        gridLayout.setColumnCount(3);
        gridLayout.setRowCount(5);

        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 5; j++) {
                int s = R.style.ButtonQueMain;
                button = new Button(this, null, s);
                button.setText(String.format("Button %d", i));

                gridLayout.addView(button, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);


                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this, "Hello Kata", Toast.LENGTH_SHORT).show();

                    }});
            }
        }

    }



}
