package com.wewashingt42.EDH_App;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class TwoPlayerInGameActivity extends AppCompatActivity {
    public static final int DEFAULT_PLAYER_LIFE_TOTAL = 20;
    private int player1_LifeTotal = 0;
    private int player2_LifeTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_2p_in_game);

        Intent intent = getIntent();
        player1_LifeTotal = intent.getIntExtra("PlayerLifeTotal", DEFAULT_PLAYER_LIFE_TOTAL);
        player2_LifeTotal = player1_LifeTotal;

    }
}