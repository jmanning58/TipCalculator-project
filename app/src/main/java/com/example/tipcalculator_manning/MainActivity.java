package com.example.tipcalculator_manning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 1;
    private String TAG="MainActivity";
    private Button calculateB;
    private Button resetB;
    private Button quitB;
    private Intent i;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editText = findViewById(R.id.amount_line);

        this.calculateB = findViewById(R.id.calculateButton);
        i = new Intent(this, Calculate.class);

        calculateB.setOnClickListener(v -> {
            startActivity(i);
            startActivityForResult(i, REQUEST_CODE);
        });

//        resetB.setOnClickListener(v -> {
//
//        });

//        quitB.setOnClickListener(v -> {
//            finish();
//            System.exit(0);
//        });
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.i("MainActivity", "Result Code: " + resultCode);

        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            Bundle extras = data.getExtras();

            if(extras != null) {

            }
        }
    }







    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "I entered onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "I entered onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "I entered onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "I entered onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "I entered onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "I entered onDestroy()");
    }
}