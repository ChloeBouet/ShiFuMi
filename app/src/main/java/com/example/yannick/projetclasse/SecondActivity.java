package com.example.yannick.projetclasse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by yannick on 16/11/2016.
 */
public class SecondActivity extends Activity {

    public TextView joueur_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultat);
        Intent intent = getIntent();
        int var_a = intent.getIntExtra("var_a", 0);
        joueur_1 = (TextView) findViewById(R.id.tv_joueur_1);
        joueur_1.setText(String.valueOf(var_a));

    }

    public void Back(View v) {
        //pour retourner a l’activite principale il suffit seulement d’appler la methode finish() qui vas tuer cette activite
        finish();

    }
}
