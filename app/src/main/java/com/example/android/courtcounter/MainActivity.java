package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeam1 = 0;
    private int scoreTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display(boolean b) {
        TextView q;
        if (b) {
            q = (TextView) findViewById(R.id.scteam1);
            q.setText("" + scoreTeam1);
        } else {
            q = (TextView) findViewById(R.id.scteam2);
            q.setText("" + scoreTeam2);
        }
    }

    public void p3t1(View view) {
        scoreTeam1 = scoreTeam1 + 3;
        display(true);
    }

    public void p2t1(View view) {
        scoreTeam1 = scoreTeam1 + 2;
        display(true);
    }

    public void ftt1(View view) {
        scoreTeam1 = scoreTeam1 + 1;
        display(true);
    }

    public void p3t2(View view) {
        scoreTeam2 = scoreTeam2 + 3;
        display(false);
    }

    public void p2t2(View view) {
        scoreTeam2 = scoreTeam2 + 2;
        display(false);
    }

    public void ftt2(View view) {
        scoreTeam2 = scoreTeam2 + 1;
        display(false);
    }

    public void reset(View view)
    {
        scoreTeam2 = 0;
        scoreTeam1 = 0;
        display(true);
        display(false);
    }
}
