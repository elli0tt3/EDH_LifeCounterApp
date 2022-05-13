package com.wewashingt42.EDH_App;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class InGameActivity extends AppCompatActivity {
    public static final int DEFAULT_PLAYER_LIFE_TOTAL = 20;
    public static final int DEFAULT_PLAYER_COUNT = 1;
    private int playerCount = 0;
    private int playerLifeTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_in_game);

        Intent intent = getIntent();
        playerLifeTotal = intent.getIntExtra("PlayerLifeTotal", DEFAULT_PLAYER_LIFE_TOTAL);
        playerCount = intent.getIntExtra("PlayerCount", DEFAULT_PLAYER_COUNT);
        //TextView testTextView = findViewById(R.id.testTextView);
        //testTextView.setText(String.valueOf(playerCount));
    }
}
