package org.kazemicode.csumbcsonlinedegreerequirements;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "org.kazemicode.csumbonlinedegreerequirements.MESSAGE";

    //Button btnSubmit = findViewById(R.id.btnSubmit);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayCourseDescriptionActivity.class);
        TextView tvDisplayCD = findViewById(R.id.tvDisplayCD);
        EditText courseNumber = findViewById(R.id.etCourseNumber);
        String message = courseNumber.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
