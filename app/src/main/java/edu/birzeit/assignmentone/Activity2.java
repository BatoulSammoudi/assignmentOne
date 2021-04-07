package edu.birzeit.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
 private TextView firstName ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        firstName = findViewById(R.id.firstName) ;
        String data = getIntent().getStringExtra("FirstName") ;
        String last = getIntent().getStringExtra("LastName") ;
        String address = getIntent().getStringExtra("Address") ;
        String gender = getIntent().getStringExtra("Gender") ;
        String city = getIntent().getStringExtra("City") ;

        firstName.setText(data);

    }
}