package com.wewashingt42.EDH_App;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class PlayerCountActivity extends AppCompatActivity {
    public static final int DEFAULT_PLAYER_LIFE_TOTAL = 20;
    private Button onePlayerButton;
    private Button twoPlayerButton;
    private Button threePlayerButton;
    private Button fourPlayerButton;
    private Button fivePlayerButton;
    private Button sixPlayerButton;
    private int lifeTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_player_count);

        Intent intent = getIntent();
        lifeTotal = intent.getIntExtra("PlayerLifeTotal", DEFAULT_PLAYER_LIFE_TOTAL);

        onePlayerButton = findViewById(R.id.onePlayerButton);
        twoPlayerButton = findViewById(R.id.twoPlayerButton);
        threePlayerButton = findViewById(R.id.threePlayerButton);
        fourPlayerButton = findViewById(R.id.fourPlayerButton);
        fivePlayerButton = findViewById(R.id.fivePlayerButton);
        sixPlayerButton = findViewById(R.id.sixPlayerButton);

        onePlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInGameActivity(1);
            }
        });
        twoPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInGameActivity(2);
            }
        });
        threePlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInGameActivity(3);
            }
        });
        fourPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInGameActivity(4);
            }
        });
        fivePlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInGameActivity(5);
            }
        });
        sixPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInGameActivity(6);
            }
        });
    }

    private void openInGameActivity(int playerCount) {
        Intent intent = new Intent(this, InGameActivity.class);
        intent.putExtra("PlayerCount", playerCount);
        intent.putExtra("PlayerLifeTotal", lifeTotal);
        startActivity(intent);
    }
}