package org.kazemicode.csumbcsonlinedegreerequirements;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayCourseDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_course_description);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        TextView tvDisplayCD = findViewById(R.id.tvDisplayCD);
        TextView tvHeadingDisplay = findViewById(R.id.tvHeadingDisplay);

        int courseNumber = Integer.parseInt(message);
        String courseName = "";
        String description = "Invalid course";
        if(courseNumber == 300)
        {
            description = getString(R.string.cst300_desc);
            courseName = getString(R.string.cst300);
        }
        else if (courseNumber == 338)
        {
            description = getString(R.string.cst338_desc);
            courseName = getString(R.string.cst338);
        }
        else if (courseNumber == 311)
        {
            description = getString(R.string.cst311_desc);
            courseName = getString(R.string.cst311);
        }
        else if(courseNumber == 334)
        {
            description = getString(R.string.cst334_desc);
            courseName = getString(R.string.cst334);
        }
        else if(courseNumber == 336)
        {
            description = getString(R.string.cst336_desc);
            courseName = getString(R.string.cst336);
        }
        else if(courseNumber == 363)
        {
            description = getString(R.string.cst363_desc);
            courseName = getString(R.string.cst363);
        }
        else if(courseNumber == 370)
        {
            description = getString(R.string.cst370_desc);
            courseName = getString(R.string.cst370);
        }
        else if(courseNumber == 383)
        {
            description = getString(R.string.cst383_desc);
            courseName = getString(R.string.cst383);
        }
        else if(courseNumber == 438)
        {
            description = getString(R.string.cst438_desc);
            courseName = getString(R.string.cst438);
        }
        else if(courseNumber == 325)
        {
            description = getString(R.string.cst325_desc);
            courseName = getString(R.string.cst325);
        }
        else if(courseNumber == 462)
        {
            description = getString(R.string.cst462_desc);
            courseName = getString(R.string.cst462);
        }
        else if(courseNumber == 499)
        {
            description = getString(R.string.cst499_desc);
            courseName = getString(R.string.cst499);
        }

        tvDisplayCD.setText(description);
        tvHeadingDisplay.setText(courseName);
    }
}
