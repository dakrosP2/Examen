package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class resultado extends AppCompatActivity {
    TextView tv;
    TextView lbl_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        lbl_resultado=findViewById(R.id.lbl_resultado);
    }


    public void finalizarConResultado() {
        String textoDestino = "Este es el resultado";
        Intent intent = new Intent();
      intent.putExtra("RESULTADO", textoDestino);

                setResult(RESULT_OK, intent);

        finish();
    }
    public interface ResultListener {
        void onResult(String resultado);
    }
}
