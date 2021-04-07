package edu.birzeit.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
   private EditText firstName, lastName , adress ;
   private RadioGroup radioGroup ;
   private RadioButton radioButton ;
   private CheckBox yes , no ;
   String text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          firstName = findViewById(R.id.firstName) ;
          lastName = findViewById(R.id.lastName) ;
          adress = findViewById(R.id.adress) ;
          radioGroup = findViewById(R.id.radioGroup) ;
          yes = findViewById(R.id.yes) ;
          no = findViewById(R.id.no) ;
        Spinner spinner = findViewById(R.id.spinner1) ;
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.city, android.R.layout.simple_spinner_item) ;
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    public void savebtn(View view) {
        Spinner spinner = findViewById(R.id.spinner1) ;
        String fname =firstName.getText().toString().trim() ;
        String lname = lastName.getText().toString().trim();
        String adressString = adress.getText().toString().trim();
        radioGroup = findViewById(R.id.radioGroup) ;
        int radioId = radioGroup.getCheckedRadioButtonId() ;
        radioButton = findViewById(radioId) ;
        String radio = radioButton.getText().toString() ;
        text = spinner.getSelectedItem().toString() ;
        Intent intent = new Intent(this,Activity2.class) ;
        if (yes.isChecked()) {
            String yesStr = "Yes" ;
            intent.putExtra("Are you a student ?", yesStr) ;
        } else if (no.isChecked()) {
            String noStr = "No" ;
            intent.putExtra("Are you a student ?" , noStr ) ;
        }

        intent.putExtra("FirstName:" ,fname) ;
        intent.putExtra("LastName:",lname) ;
        intent.putExtra("Address:",adressString) ;
        intent.putExtra("Gender", radio) ;
        intent.putExtra("City" , text ) ;
        startActivity(intent);

    }
    public void clicked (View view) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        text = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}