package com.sandyu.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumbers;

    public void makeToast(String string) {
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }

    public void guess(View view){

        EditText guessEdtText = (EditText) findViewById(R.id.guessEdtText);

        int guessInt = Integer.parseInt(guessEdtText.getText().toString());

        if (guessInt > randomNumbers) {
           makeToast("Lower !");
        } else if (guessInt < randomNumbers) {
           makeToast("Higher !");
        } else {
            makeToast("Thats Right ! Try Again !");

            Random rand = new Random();
            randomNumbers = rand.nextInt(20) + 1;


        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

         randomNumbers = rand.nextInt(20) + 1;
    }
}
