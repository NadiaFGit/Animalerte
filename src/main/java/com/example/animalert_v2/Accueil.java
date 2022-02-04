package com.example.animalert_v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Accueil extends AppCompatActivity {
    ////Declaration pour le bouton ajuter Animal
    Button btn_AjouterAnimal;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_accueil);

        ////////////Btn Ajouter Animal, Appel de Layout Ajouter Animal
        btn_AjouterAnimal=(Button)findViewById(R.id.idAjouterAnimal);
        btn_AjouterAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Accueil.this,ActivityAjouterAnimal.class);
                startActivity(intent);

            }
        });
    }
}
