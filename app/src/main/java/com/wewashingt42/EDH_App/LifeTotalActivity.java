package com.wewashingt42.EDH_App;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class LifeTotalActivity extends AppCompatActivity {
    private Button fortyLifeButton;
    private Button thirtyLifeButton;
    private Button twentyLifeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_life_total);

        fortyLifeButton = findViewById(R.id.fortyLifeButton);
        thirtyLifeButton = findViewById(R.id.thirtyLifeButton);
        twentyLifeButton = findViewById(R.id.twentyLifeButton);

        fortyLifeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayerCountActivity(40);
            }
        });
        thirtyLifeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayerCountActivity(30);
            }
        });
        twentyLifeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayerCountActivity(20);
            }
        });
    }

    private void openPlayerCountActivity(int lifeTotal) {
        Intent intent = new Intent(this, PlayerCountActivity.class);
        intent.putExtra("PlayerLifeTotal", lifeTotal);
        startActivity(intent);
    }
}