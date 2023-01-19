package com.example.testapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class ScheduleActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

    }

    public void monday_btn(View view){
        MondayFragment mondayFragment = new MondayFragment();
        setNewFragment(mondayFragment);
    }
    public void tuesday_btn(View view){
        TuesdayFragment tuesdayFragment = new TuesdayFragment();
        setNewFragment(tuesdayFragment);
    }

    public  void wednesday_btn(View view){
        WednesdayFragment wednesdayFragment = new WednesdayFragment();
        setNewFragment(wednesdayFragment);
    }

    public  void thursday_btn(View view){
        ThursdayFragment thursdayFragment = new ThursdayFragment();
        setNewFragment(thursdayFragment);
    }

    public  void friday_btn(View view){
        FridayFragment fridayFragment = new FridayFragment();
        setNewFragment(fridayFragment);
    }

    public  void saturday_btn(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(ScheduleActivity.this);
        builder.setTitle("Saturday");
        builder.setMessage("You don't study at saturdays anymore!");
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void setNewFragment(Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout, fragment);
        ft.commit();
    }

    public void back_btn(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}