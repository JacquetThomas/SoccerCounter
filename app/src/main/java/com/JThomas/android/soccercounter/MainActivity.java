package com.JThomas.android.soccercounter;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int numberOfCornerTeamA = 0;
    int numberOfCornerTeamB = 0;
    int numberOfPenaltyTeamA = 0;
    int numberOfPenaltyTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayCornerForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corner);
        scoreView.setText("Corner: " + score);
    }

    public void displayPenaltyForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalty);
        scoreView.setText("Penalty: " + score);
    }


    public void addOneForTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void addCornerTeamA(View view) {
        numberOfCornerTeamA += 1;
        displayCornerForTeamA(numberOfCornerTeamA);
    }

    public void addPenaltyTeamA(View view) {
        numberOfPenaltyTeamA += 1;
        displayPenaltyForTeamA(numberOfPenaltyTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPenaltyForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalty);
        scoreView.setText("Penalty: " + score);
    }

    public void displayCornerForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corner);
        scoreView.setText("Corner: " + score);
    }


    public void addOneForTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void addCornerTeamB(View view) {
        numberOfCornerTeamB += 1;
        displayCornerForTeamB(numberOfCornerTeamB);
    }

    public void addPenaltyTeamB(View view) {
        numberOfPenaltyTeamB += 1;
        displayPenaltyForTeamB(numberOfPenaltyTeamB);
    }


    /**
     * reset score for the two teams
     */

    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        numberOfCornerTeamA = 0;
        numberOfCornerTeamB = 0;
        numberOfPenaltyTeamA = 0;
        numberOfPenaltyTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayCornerForTeamA(numberOfCornerTeamA);
        displayCornerForTeamB(numberOfCornerTeamB);
        displayPenaltyForTeamA(numberOfPenaltyTeamA);
        displayPenaltyForTeamB(numberOfPenaltyTeamB);
    }
}