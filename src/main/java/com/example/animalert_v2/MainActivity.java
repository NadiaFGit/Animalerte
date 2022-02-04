
package com.example.animalert_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ////Declaration pour le bouton ajuter user
    Button btn_AjouterUser;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_connection);

         ////////////Btn Ajouter user, Appel de Layout Ajouter User
         btn_AjouterUser=(Button)findViewById(R.id.idInscriptionUser);
         btn_AjouterUser.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent= new Intent(MainActivity.this,AddUser.class);
                 startActivity(intent);

             }
         });

    }
}