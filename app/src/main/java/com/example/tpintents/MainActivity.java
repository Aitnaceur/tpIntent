package com.example.tpintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editNomPrenom, editEmail, editPhone, editAdresse;
    private Spinner villeSpinner;
    private Button btn;
    private String ville;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editNomPrenom = findViewById(R.id.nomPrenom);
        editEmail = findViewById(R.id.email);
        editPhone = findViewById(R.id.phone);
        editAdresse = findViewById(R.id.adresse);
        villeSpinner = findViewById(R.id.villeSpinner);
        btn = findViewById(R.id.btn);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String ville = villeSpinner.getSelectedItem().toString();

               String nomPrenom = editNomPrenom.getText().toString();
               String email = editEmail.getText().toString();
               String phone = editPhone.getText().toString();
               String adresse = editAdresse.getText().toString();

               Intent intent = new Intent(MainActivity.this, SecondActivity.class);
               intent.putExtra("NomPrenom", nomPrenom);
               intent.putExtra("Email", email);
               intent.putExtra("Phone", phone);
               intent.putExtra("Adresse", adresse);
               intent.putExtra("Ville", ville);

               startActivity(intent);
           }
       });




    }
}