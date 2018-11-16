package com.example.navkaran.easyattendance;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private Intent intent;
    private String userRole, userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sp = getSharedPreferences("CONTAINER",Context.MODE_PRIVATE);
        //Retrieve the user role and ID from shared preferences. If there's no info, returns "none"
        userRole = sp.getString("userRole", "none");
        userID = sp.getString("userID", "none");
        //userRole = sp.getString("a", "student");


        if(userRole.equals("teacher")){
            intent = new Intent(this, CourseListActivity.class);
            intent.putExtra("userRole", userRole);
            intent.putExtra("userID", userID);
            startActivity(intent);
        }else if(userRole.equals("student")){
            intent = new Intent(this, CheckAttendanceActivity.class);
            intent.putExtra("userRole", userRole);
            intent.putExtra("userID", userID);
            startActivity(intent);
        }else{
            intent = new Intent(this, SelectUserType.class);
            startActivity(intent);
        }


    }
}
