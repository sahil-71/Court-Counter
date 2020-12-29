package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int scoreA){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void Add3ToA(View view){
        scoreA += 3;
        displayForTeamA(scoreA);
    }
    public void Add2ToA(View view){
        scoreA += 2;
        displayForTeamA(scoreA);
    }
    public void Add1ToA(View view){
        scoreA += 1;
        displayForTeamA(scoreA);
    }


    public void displayForTeamB(int scoreB){
        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void Add3ToB(View view){
        scoreB += 3;
        displayForTeamB(scoreB);
    }
    public void Add2ToB(View view){
        scoreB += 2;
        displayForTeamB(scoreB);
    }
    public void Add1ToB(View view){
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}