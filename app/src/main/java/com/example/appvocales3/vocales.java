package com.example.appvocales3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vocales extends AppCompatActivity {

    MediaPlayer mp;
    Button arbol;
    Button elefante;
    Button isla;
    Button oso;
    Button uva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocales);

        arbol = (Button) findViewById(R.id.arbol);
        mp = MediaPlayer.create(this, R.raw.a);
        arbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
            });


                elefante = (Button) findViewById(R.id.elefante);
                mp = MediaPlayer.create(this, R.raw.e);
                elefante.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mp.start();
                    }
                });

                isla = (Button) findViewById(R.id.isla);
                mp = MediaPlayer.create(this, R.raw.i);
                isla.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mp.start();
                    }
                });
                oso = (Button) findViewById(R.id.oso);
                mp = MediaPlayer.create(this, R.raw.o);
                oso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mp.start();
                    }
                });
                uva = (Button) findViewById(R.id.uva);
                mp = MediaPlayer.create(this, R.raw.u);
                uva.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mp.start();
                    }
                });

            }
        }