package com.example.testapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btn1(View view){
        Intent intent = new Intent(this, ScheduleActivity.class);
        startActivity(intent);
    }

    public void btn2(View view){
        String text = "In process...";
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public void btn3(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("SecretPage");
        builder.setMessage("Wanna visit my DrugsStore?");
        builder.setCancelable(false);
        builder.setPositiveButton("Oh yeah!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oiGVlvZHMfw"));
                startActivity(browserIntent);
            }
        });
        builder.setNegativeButton("NO!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}