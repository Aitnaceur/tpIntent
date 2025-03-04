package com.example.tpintents;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    private TextView resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        resultat = findViewById(R.id.resultat);

        String nomPrenom = getIntent().getStringExtra("NomPrenom");
        String email = getIntent().getStringExtra("Email");
        String phone = getIntent().getStringExtra("Phone");
        String adresse = getIntent().getStringExtra("Adresse");
        String ville = getIntent().getStringExtra("Ville");

        String resultText = "Nom & Prenom : " + nomPrenom + "\n"
                + "Email : " + email + "\n"
                + "phone : " + phone + "\n"
                + "Adresse : " + adresse + "\n"
                + "Ville " + ville;

        resultat.setText(resultText);
    }
}