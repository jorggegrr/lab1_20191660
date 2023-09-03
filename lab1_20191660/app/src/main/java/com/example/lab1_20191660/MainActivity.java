package com.example.lab1_20191660;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar_inicio;
    private TextView textView;
    private Button buttonJugar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        textView = findViewById(R.id.TeleAhorcado);
        registerForContextMenu(textView);

        buttonJugar = findViewById(R.id.buttonJugar);

        buttonJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para abrir la nueva actividad
                Intent intent = new Intent(MainActivity.this, TeleAhorcadoActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if (v.getId() == R.id.TeleAhorcado) {
            getMenuInflater().inflate(R.menu.textview_context_menu, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_item_azul) {
            textView.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
            return true;
        } else if (id == R.id.menu_item_verde) {
            textView.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
            return true;
        } else if (id == R.id.menu_item_rojo) {
            textView.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            return true;
        }

        return super.onContextItemSelected(item);
    }
}