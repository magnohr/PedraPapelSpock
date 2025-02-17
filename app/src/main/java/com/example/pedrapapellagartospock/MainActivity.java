package com.example.pedrapapellagartospock;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView pedra,papel,tesoura,lagarto,spock ,maquina;
    private TextView resu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        pedra = findViewById(R.id.pedra);
        papel = findViewById(R.id.papel);
        tesoura = findViewById(R.id.tesoura);
        lagarto = findViewById(R.id.lagarto);
        spock = findViewById(R.id.spock);
        maquina = findViewById(R.id.maquina);
        resu = findViewById(R.id.resu);

    }
    public void pedra(View view){
        this.codigo("pedra");



    }
    public void papel(View view){
        this.codigo("papel");

    }
    public void tesoura(View view){
        this.codigo("tesoura");

    }
    public void lagarto(View view){
        this.codigo("lagarto");

    }
    public void spock(View view){
        this.codigo("spock");

    }
    public void codigo(String escolhaUsu){
        int numero = new Random().nextInt(4);
        String[] opcoes = {"pedra","papel","tesoura","lagarto","spock"};
        String opcaoApp = opcoes[numero];

        switch (opcaoApp){
            case "pedra":

                maquina.setImageResource(R.drawable.pedra);

                break;


            case "papel":

                maquina.setImageResource(R.drawable.papel);

                break;



            case "tesoura":

                maquina.setImageResource(R.drawable.tesoura);

                break;


            case "lagarto":

                maquina.setImageResource(R.drawable.lagarto);

                break;


            case "spock":

                maquina.setImageResource(R.drawable.spock);

                break;



        }

        if (escolhaUsu.equals(opcaoApp)) {
            resu.setText("Empate!");
        } else if (
                (escolhaUsu.equals("pedra") && (opcaoApp.equals("tesoura") || opcaoApp.equals("lagarto"))) ||
                        (escolhaUsu.equals("papel") && (opcaoApp.equals("pedra") || opcaoApp.equals("spock"))) ||
                        (escolhaUsu.equals("tesoura") && (opcaoApp.equals("papel") || opcaoApp.equals("lagarto"))) ||
                        (escolhaUsu.equals("lagarto") && (opcaoApp.equals("spock") || opcaoApp.equals("papel"))) ||
                        (escolhaUsu.equals("spock") && (opcaoApp.equals("tesoura") || opcaoApp.equals("pedra")))
        ) {
            resu.setText("Você venceu!");
        } else {
            resu.setText("Você perdeu!");
        }


    }





}

