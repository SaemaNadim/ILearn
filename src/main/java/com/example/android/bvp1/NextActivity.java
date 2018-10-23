package com.example.android.bvp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class NextActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        b1 = (Button) findViewById(R.id.b11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sexeduactivity = new Intent(NextActivity.this, SexEduActivity.class);
                startActivity(sexeduactivity);
            }
        });
//        b2 = (Button) findViewById(R.id.b21);
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent legaleduactivity = new Intent(NextActivity.this,LegalEduActivity.class);
//                startActivity(legaleduactivity);
//            }
//        });
//        b3 = (Button) findViewById(R.id.b31);
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent votingeduactivity = new Intent(MainActivity.this, VotingEduActivity.class);
//                startActivity(votingeduactivity);
//            }
//        });
//        b4 = (Button) findViewById(R.id.b41);
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent healtheduactivity = new Intent(MainActivity.this, HealthEduActivity.class);
//                startActivity(healtheduactivity);
//            }
//        });
    }
}
