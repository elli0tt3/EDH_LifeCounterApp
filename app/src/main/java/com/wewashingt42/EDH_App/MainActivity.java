package com.wewashingt42.EDH_App;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button startGameButton;
    private Button settingsButton;
    public static int TEST = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        startGameButton = (Button) findViewById(R.id.startGameButton);
        settingsButton = (Button) findViewById(R.id.settingsButton);

        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLifeTotalActivity();
            }
        });
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
            }
        });

    }


    private void openLifeTotalActivity() {
        Intent intent = new Intent(this, LifeTotalActivity.class);
        startActivity(intent);
    }

    private void openSettingsActivity() {
        //eventually will open an activity with settings
    }
}

