package com.example.laure.flashcard3;

import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                ((TextView) findViewById(R.id.answer1)).setVisibility(View.VISIBLE);
                ((TextView) findViewById(R.id.flashcard_question)).setVisibility(View.INVISIBLE);
                //view.setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.answer1).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                findViewById(R.id.answer1).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
            }
        });



    }
}
