package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class suma extends AppCompatActivity {
    EditText edt1, edt2;
    TextView tv;
    int res;
    private Button botonIrActividad1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        botonIrActividad1 = findViewById(R.id.suma);
        botonIrActividad1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(suma.this, resultado.class);
                startActivity(intent);
            }
            public void suma(View View){
                int num1=Integer.parseInt(edt1.getText().toString());
                int num2=Integer.parseInt(edt2.getText().toString());
                int res=num1+num2;
                tv.setText( res);

            }

        });

    }
    private static final int REQUEST_CODE = 1;

    public void iniciarActivityB() {
        Intent intent = new Intent(this, resultado.class);
        String textoOrigen = tv.getText().toString();
        intent.putExtra("TEXTO_DESTINO", textoOrigen);
        startActivityForResult(intent, REQUEST_CODE);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            // Obtener el resultado desde la Activity B
            String resultado = data.getStringExtra("RESULTADO");
            // Procesar el resultado aquí
        }
    }}