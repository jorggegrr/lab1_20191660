package com.example.lab1_20191660;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;



import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TeleAhorcadoActivity extends AppCompatActivity implements View.OnClickListener {

    private String[] palabras = {"REDES", "PROPA", "PUCP", "TELITO", "TELECO", "BATI"};
    private String palabraAdivinar;
    private int intentosRestantes = 6;
    private boolean[] letrasCorrectas;
    private TextView textViewPalabraAdivinar;
    private Button buttonNuevoJuego;
    private long tiempoInicioJuego;
    private long tiempoFinJuego;
    private int intentosFallidos = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele_ahorcado);

        textViewPalabraAdivinar = findViewById(R.id.textViewPalabraAdivinar);
        buttonNuevoJuego = findViewById(R.id.buttonNuevoJuego);

        buttonNuevoJuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarNuevoJuego();
            }
        });
        habilitarBotonesLetras(false);
        iniciarNuevoJuego();
        Button buttonA = findViewById(R.id.buttonA);
        Button buttonB = findViewById(R.id.buttonB);
        Button buttonC = findViewById(R.id.buttonC);
        Button buttonD = findViewById(R.id.buttonD);
        Button buttonE = findViewById(R.id.buttonE);
        Button buttonF = findViewById(R.id.buttonF);
        Button buttonG = findViewById(R.id.buttonG);
        Button buttonH = findViewById(R.id.buttonH);
        Button buttonI = findViewById(R.id.buttonI);
        Button buttonJ = findViewById(R.id.buttonJ);
        Button buttonK = findViewById(R.id.buttonK);
        Button buttonL = findViewById(R.id.buttonL);
        Button buttonM = findViewById(R.id.buttonM);
        Button buttonN = findViewById(R.id.buttonN);
        Button buttonO = findViewById(R.id.buttonO);
        Button buttonP = findViewById(R.id.buttonP);
        Button buttonQ = findViewById(R.id.buttonQ);
        Button buttonR = findViewById(R.id.buttonR);
        Button buttonS = findViewById(R.id.buttonS);
        Button buttonT = findViewById(R.id.buttonT);
        Button buttonU = findViewById(R.id.buttonU);
        Button buttonV = findViewById(R.id.buttonV);
        Button buttonW = findViewById(R.id.buttonW);
        Button buttonX = findViewById(R.id.buttonX);
        Button buttonY = findViewById(R.id.buttonY);
        Button buttonZ = findViewById(R.id.buttonZ);

        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonD.setOnClickListener(this);
        buttonE.setOnClickListener(this);
        buttonF.setOnClickListener(this);
        buttonG.setOnClickListener(this);
        buttonH.setOnClickListener(this);
        buttonI.setOnClickListener(this);
        buttonJ.setOnClickListener(this);
        buttonK.setOnClickListener(this);
        buttonL.setOnClickListener(this);
        buttonM.setOnClickListener(this);
        buttonN.setOnClickListener(this);
        buttonO.setOnClickListener(this);
        buttonP.setOnClickListener(this);
        buttonQ.setOnClickListener(this);
        buttonR.setOnClickListener(this);
        buttonS.setOnClickListener(this);
        buttonT.setOnClickListener(this);
        buttonU.setOnClickListener(this);
        buttonV.setOnClickListener(this);
        buttonW.setOnClickListener(this);
        buttonX.setOnClickListener(this);
        buttonY.setOnClickListener(this);
        buttonZ.setOnClickListener(this);

    }

    private void iniciarNuevoJuego() {
        tiempoInicioJuego = System.currentTimeMillis();

        palabraAdivinar = palabras[(int) (Math.random() * palabras.length)];
        letrasCorrectas = new boolean[palabraAdivinar.length()];
        for (int i = 0; i < letrasCorrectas.length; i++) {
            letrasCorrectas[i] = false;
        }
        actualizarPalabraAdivinar();
        intentosRestantes = 6;
        buttonNuevoJuego.setEnabled(false);
        habilitarBotonesLetras(true);
        findViewById(R.id.imageViewCabeza).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageViewTorso).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageViewBrazoDer).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageViewBrazoIzq).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageViewPiernaIzq).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageViewPiernaDer).setVisibility(View.INVISIBLE);
        intentosFallidos = 0;

    }


    private void habilitarBotonesLetras(boolean habilitar) {
        Button[] botonesLetras = {
                findViewById(R.id.buttonA),
                findViewById(R.id.buttonB),
                findViewById(R.id.buttonC),
                findViewById(R.id.buttonD),
                findViewById(R.id.buttonE),
                findViewById(R.id.buttonF),
                findViewById(R.id.buttonG),
                findViewById(R.id.buttonH),
                findViewById(R.id.buttonI),
                findViewById(R.id.buttonJ),
                findViewById(R.id.buttonK),
                findViewById(R.id.buttonL),
                findViewById(R.id.buttonM),
                findViewById(R.id.buttonN),
                findViewById(R.id.buttonO),
                findViewById(R.id.buttonP),
                findViewById(R.id.buttonQ),
                findViewById(R.id.buttonR),
                findViewById(R.id.buttonS),
                findViewById(R.id.buttonT),
                findViewById(R.id.buttonU),
                findViewById(R.id.buttonV),
                findViewById(R.id.buttonW),
                findViewById(R.id.buttonX),
                findViewById(R.id.buttonY),
                findViewById(R.id.buttonZ)
        };

        for (Button botonLetra : botonesLetras) {
            botonLetra.setEnabled(habilitar);
        }
    }


    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        char letra = button.getText().charAt(0);
        boolean letraEncontrada = false;

        for (int i = 0; i < palabraAdivinar.length(); i++) {
            if (palabraAdivinar.charAt(i) == letra) {
                letrasCorrectas[i] = true;
                letraEncontrada = true;
            }
        }

        if (!letraEncontrada) {
            intentosRestantes--;
            mostrarImagenIncorrecta(); // Muestra la imagen correspondiente
        }

        actualizarPalabraAdivinar();
        button.setEnabled(false);

        if (intentosRestantes == 0 || palabraAdivinarDescubierta()) {
            buttonNuevoJuego.setEnabled(true);
            mostrarMensajeResultado();
        }
    }

    private void mostrarImagenIncorrecta() {
        intentosFallidos++;

        switch (intentosFallidos) {
            case 1:
                findViewById(R.id.imageViewCabeza).setVisibility(View.VISIBLE);
                break;
            case 2:
                findViewById(R.id.imageViewTorso).setVisibility(View.VISIBLE);
                break;
            case 3:
                findViewById(R.id.imageViewBrazoDer).setVisibility(View.VISIBLE);
                break;
            case 4:
                findViewById(R.id.imageViewBrazoIzq).setVisibility(View.VISIBLE);
                break;
            case 5:
                findViewById(R.id.imageViewPiernaIzq).setVisibility(View.VISIBLE);
                break;
            case 6:
                findViewById(R.id.imageViewPiernaDer).setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
    }



    private void actualizarPalabraAdivinar() {
        StringBuilder palabraMostrada = new StringBuilder();
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            if (letrasCorrectas[i]) {
                palabraMostrada.append(palabraAdivinar.charAt(i));
            } else {
                palabraMostrada.append("_");
            }
        }
        textViewPalabraAdivinar.setText("Palabra: " + palabraMostrada.toString());
        if (palabraAdivinarDescubierta()) {
            textViewPalabraAdivinar.setText("¡Ganaste! Palabra: " + palabraAdivinar);
        } else if (intentosRestantes == 0) {
            textViewPalabraAdivinar.setText("¡Perdiste! La palabra era: " + palabraAdivinar);
        }
        if (intentosRestantes == 0 || palabraAdivinarDescubierta()) {
            buttonNuevoJuego.setEnabled(true);
            mostrarMensajeResultado();
        }

    }
    private void mostrarMensajeResultado() {
        tiempoFinJuego = System.currentTimeMillis(); String mensaje;
        if (intentosRestantes == 0) {
            mensaje = "Perdiste. La palabra era: " + palabraAdivinar;
        } else {
            mensaje = "Ganaste.";
        }
        long tiempoTranscurrido = (tiempoFinJuego - tiempoInicioJuego) / 1000;
        mensaje += "\nTerminó en: " + tiempoTranscurrido + "s";

        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }



    private boolean palabraAdivinarDescubierta() {
        for (boolean letraCorrecta : letrasCorrectas) {
            if (!letraCorrecta) {
                return false;
            }
        }
        return true;
    }
}

