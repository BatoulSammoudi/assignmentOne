package edu.birzeit.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
 private TextView firstName , lastName , address ,gender , student , city ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        firstName = findViewById(R.id.firstName) ;
        lastName = findViewById(R.id.lastName) ;
        address = findViewById(R.id.address) ;
        gender = findViewById(R.id.gender) ;
        student = findViewById(R.id.student) ;
        city = findViewById(R.id.city) ;
        String data = getIntent().getStringExtra("FirstName") ;
        String last = getIntent().getStringExtra("LastName") ;
        String address2 = getIntent().getStringExtra("Address") ;
        String gender2 = getIntent().getStringExtra("Gender") ;
        String city2 = getIntent().getStringExtra("City") ;
        String student2 = getIntent().getStringExtra("Are you a student ?") ;

        firstName.setText(data);
        lastName.setText(last);
        address.setText(address2);
        gender.setText(gender2);
        student.setText(student2);
        city.setText(city2);

    }
}