package com.wewashingt42.EDH_App;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class OnePlayerInGameActivity extends AppCompatActivity {
    public static final int DEFAULT_PLAYER_LIFE_TOTAL = 20;
    public static final int DEFAULT_PLAYER_COUNT = 1;
    //private int playerCount = 1;
    private int playerLifeTotal = 0;
    private Button addLifeButton;
    private Button subLifeButton;
    private TextView lifeTotalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_1p_in_game);

        Intent intent = getIntent();
        playerLifeTotal = intent.getIntExtra("PlayerLifeTotal", DEFAULT_PLAYER_LIFE_TOTAL);
        //playerCount = intent.getIntExtra("PlayerCount", DEFAULT_PLAYER_COUNT);
        lifeTotalTextView = findViewById(R.id.lifeTotalTextView);
        lifeTotalTextView.setText(Integer.toString(playerLifeTotal));

        addLifeButton = findViewById(R.id.addLifeButton);
        subLifeButton = findViewById(R.id.subLifeButton);


        addLifeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerLifeTotal++;
                lifeTotalTextView.setText(Integer.toString(playerLifeTotal));
            }
        });

        subLifeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerLifeTotal--;
                lifeTotalTextView.setText(Integer.toString(playerLifeTotal));
            }
        });



    }
}
